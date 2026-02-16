package org.blitmatthew.service;

import org.blitmatthew.data.DataRetriever;
import org.blitmatthew.entity.Student;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentOps {
    private List<Student> students = DataRetriever.getStudents();

    public Integer getStudentCount() {return students.size();

        }

    // Iterate over all students
    // Keep only students with GPA greater than 3.5
    // Filter by GPA condition
    public List<Student> getStrudenGba35(){
        return students.stream()
                .filter(student-> student.getGpa() > 3.5 )
                .toList();
    }

    // Iterate over all students
    // Keep only students under age 20
    // Filter by age condition
    public List<Student> getStudentUnderAge20(){
        return students.stream()
                .filter(student-> student.getAge() > 20)
                .toList();
    }

    // Iterate over all students
    // Keep only international students
    // Filter students based on international status
    public List<Student> listInternationalStudents(){
        return students.stream()
                .filter(listInternationalStudents -> listInternationalStudents.isInternational())
                .toList();
    }

    // Iterate over student
    // Filter students that have 3.0 gba and above
    // Filter student that have gba 3.5 and below
    // put them in new array
    public List<Student> studentGbaBetween30And35(){
        return students.stream()
                .filter(student -> student.getGpa() >= 3.0 && student.getGpa() <= 3.5 )
                .toList();
    }

    // Iterate over all students
    // Keep only international students
    // Enum + contain
    // filter students major (STEM)
    public List<Student> internationalStemMajor(){
        return students.stream()
                .filter(student -> student.isInternational())
                .filter(student -> student.isStemMajor())
                .toList();
    }


    // Iterate over all students
    // Extract each student's major
    // Remove null majors
    // Remove duplicate majors
    public List<String> allMajors(){
        return students.stream()
                .map(Student :: getMajor)
                .filter(major -> major != null)
                .distinct()
                .toList();
    }

    // Scholarship recipients with high credit hours
    // Iterate over all students
    // filter students recipients scholarship
    // get all students credit hours check the average
    // filter all students have above average credit hours
    public List<Student> scholarshipWithHighCredits() {
         return students.stream()
                .filter(s -> s.getCreditHours() > 110 && s.isScholarshipRecipient())
                .toList();
    }

    // Iterate over all students
    // Keep only scholarship recipients
    // Filter students based on scholarship status
    public List<Student> scholarshipStudents(){
        return students.stream()
                .filter(s -> s.isScholarshipRecipient())
                .toList();
    }


    // Iterate over all students
    // Sort students by graduation year
    // Return students in ascending graduation order
    public List<Student> studentGradSorted(){
        return students.stream()
                .sorted(Comparator.comparing(Student::getGraduationYear))
                .toList();
    }

    // Iterate over all students
    // Keep only students with exactly 60 credit hours
    // Filter students by credit hour requirement
    public List<Student> student60Credit(){
        return students.stream()
                .filter(s -> s.getCreditHours() == 60)
                .toList();
    }


    // specific university
    // Iterate over all students
    // Filter university and check if the student study at that university
    // put the result in new list

    public List<Student> specificUniversity(String university){
        return students.stream()
                .filter(s -> s.getUniversity().equalsIgnoreCase(university))
                .toList();
    }

    // Iterate over all students
    // filter students that have gpb above 3.7
    // filter international students
    // filter major STEM
    // filter students that have scholarship

    public List<Student> tooMuchInfo() {
        return students.stream()
                .filter(s -> s.getGpa() > 3.7
                        && s.isInternational()
                        && s.isStemMajor()
                        && s.isScholarshipRecipient())
                .toList();
    }

    public List<Student> test1(){
        return students.stream()

                .filter(s -> s.getGpa() > 3.7)
                .peek(s -> System.out.println("After GPA filter: " + s.getFirstName() + " " + s.getLastName()))

                .filter(s -> s.isInternational())
                .peek(s -> System.out.println("After International filter: " + s.getFirstName() + " " + s.getLastName()))

                .filter(s -> s.isStemMajor())
                .peek(s -> System.out.println("After STEM filter: " + s.getFirstName() + " " + s.getLastName()))

                .filter(s -> s.isScholarshipRecipient())
                .peek(s -> System.out.println("After Scholarship filter: " + s.getFirstName() + " " + s.getLastName()))

                .toList();
    }

    // Iterate over all students
    // Group students by graduation year
    // Collect students into lists per year
    public Map<Integer, List<Student>> studentsGroupedByGradYear(){
        return students.stream()
                .collect(Collectors.groupingBy(Student::getGraduationYear));
    }


    // Iterate over all students
    // Group students by their university
    // Collect students into lists for each university
    public Map<String, List<Student>> studentsGroupedByUniversities(){
        return students.stream()
                .collect(Collectors.groupingBy(Student::getUniversity));
    }

    // Iterate over all students
    // Check each student's age
    // Keep students born in the specified age
    public List<Student> studentsAge(int age){
        return students.stream()
                .filter(s -> s.getAge() == age)
                .toList();
    }
}
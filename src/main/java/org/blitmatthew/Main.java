package org.blitmatthew;

import org.blitmatthew.entity.Student;
import org.blitmatthew.service.CarOps;
import org.blitmatthew.service.StudentOps;
import org.blitmatthew.wrapper.StudentWrapper;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;


public class Main {

    public static List<Student> listOfNames = new ArrayList<>();




    public static void main(String[] args) {
        CarOps carOps = new CarOps();
        StudentOps studentOps = new StudentOps();

        System.out.println(carOps.getCarCount());
        System.out.println(studentOps.getStudentCount());
˚
        System.out.println("International Students -> " + studentOps.listInternationalStudents());

        System.out.println("------------------------------------------------");

        System.out.println("International and STEM Major -> " + studentOps.internationalStemMajor());

        System.out.println("------------------------------------------------");

        System.out.println("All Student Majors -> " + studentOps.allMajors());

        System.out.println("--------------------------------------------------");

        System.out.println("Students with scholarship " + studentOps.scholarshipStudents());

        System.out.println("--------------------------------------------------");

        System.out.println("Students sorted by graduation year "
                + studentOps.studentGradSorted());

        System.out.println("---------------------------------------------------");

        System.out.println("Students with exactly 60 credit hours "
                + studentOps.student60Credit());

        System.out.println("---------------------------------------------------");

        System.out.println("Students with Scholarship & High credit hours "
                + studentOps.scholarshipWithHighCredits());

        System.out.println("---------------------------------------------------");

        System.out.println("Students with specific University "
                + studentOps.specificUniversity("Innovation Institute"));

        System.out.println("------------------------------------------------------");

        System.out.println("Too much Info " + studentOps.tooMuchInfo());

        System.out.println("======================================================");

        System.out.println("Car stream practice");

        System.out.println("------------------------------------------------------");

        System.out.println("All electric cars " + carOps.getAllElectricCars());

        System.out.println("------------------------------------------------------");

        System.out.println("Model,  Average Price" + carOps.avrPriceByVehicleType());

        System.out.println("-------------------------------------------------------");

        System.out.println("Only manual transmission" + carOps.ManualTrans());

        System.out.println("--------------------------------------------------------");

        System.out.println("Excellent cars condition only" + carOps.ExcellentCondition());

        System.out.println("---------------------------------------------------");

        System.out.println("Vehicles under 50K Miles" + carOps.under50KMiles());

        System.out.println("---------------------------------------------------");

        System.out.println("Average Vehicle Mileage "  + carOps.avrMileage());

        System.out.println("---------------------------------------------------");

        System.out.println("specific manufacturers " + carOps.specificManufacturers());

        System.out.println("---------------------------------------------------");

        System.out.println("Students by GraduationYear" + studentOps.studentsGroupedByGradYear());

        System.out.println("---------------------------------------------------");

        System.out.println("Group students by their university "
                + studentOps.studentsGroupedByUniversities());

        System.out.println("---------------------------------------------------");

        System.out.println("Students age " + studentOps.studentsAge(42));

        System.out.println("---------------------------------------------------");







    }
}
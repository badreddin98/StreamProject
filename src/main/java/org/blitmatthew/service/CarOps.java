package org.blitmatthew.service;

import org.blitmatthew.data.DataRetriever;
import org.blitmatthew.entity.Car;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CarOps {
    List<Car> cars = DataRetriever.getCars();

    public Integer getCarCount() {
        return cars.size();
    }

    public List<Car> getAllElectricCars() {
        return cars.stream()
                .filter(c -> c.getFuelType().equalsIgnoreCase("Electric"))
                .toList();

    }


    // Iterate over all cars
    // Keep only cars priced under $30,000
    // Filter cars by price condition
    public List<Car> carsUnder30K() {
        return cars.stream()
                .filter(c -> c.getPrice() < 30000)
                .toList();
    }

    // Iterate over all cars
    // Keep cars priced between $40,000 and $60,000
    // Filter cars within price range
    public List<Car> carsBetween40KAnd60K() {
        return cars.stream()
                .filter(c-> c.getPrice() >= 40000
                        && c.getPrice() <= 60000)
                .toList();
    }


    // Iterate over all cars
    // Keep only hybrid vehicles
    // Filter vehicles manufactured within the last 3 years
    public List<Car> hybridCarWithinLast3Years() {
        return cars.stream()
                .filter(c -> c.getFuelType().equalsIgnoreCase("Hybrid")
                && c.getYear() > 2023)
                .toList();
    }


    // Iterate over all cars
    // Group cars by vehicle model
    // Extract each car price
    // Calculate average price per model
    public Map<String, Double> avrPriceByVehicleType() {
        return cars.stream()
                .collect(Collectors.groupingBy(Car::getModel,
                        Collectors.averagingDouble(Car::getPrice)
                ));
    }


    // Iterate over all cars
    // Keep only manual transmission vehicles
    // Filter cars by transmission type
    public List<Car> manualTrans() {
        return cars.stream()
                .filter(c -> c.getTransmission().equalsIgnoreCase("Manual"))
                .toList();
    }

    // Iterate over all cars
    // Keep only cars in excellent condition
    // Filter cars by condition status
    public List<Car> excellentCondition() {
        return cars.stream()
                .filter(c -> c.getCondition().equalsIgnoreCase("Excellent"))
                .toList();
    }

    // Iterate over all cars
    // Keep vehicles with mileage under 50,000 miles
    // Filter cars by mileage condition
    public List<Car> under50KMiles(){
        return cars.stream()
                .filter(c -> c.getMileage() < 50000)
                .toList();
    }

    // Iterate over all cars
    // Extract mileage values
    // Calculate average mileage across all vehicles
    public Double avrMileage(){
        return cars.stream()
                .mapToDouble(Car::getMileage)
                .average().orElse(0.0);
    }


    // Iterate over all cars
    // Group vehicles by manufacturer (make)
    // Collect cars into lists per manufacturer
    public Map<String, List<Car>> specificManufacturers(){
        return cars.stream()
                .collect(Collectors.groupingBy(Car::getMake));
    }




}

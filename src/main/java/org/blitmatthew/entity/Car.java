package org.blitmatthew.entity;

import lombok.*;

@Data

public class Car {
    private int id;
    private String make;
    private String model;
    private int year;
    private String color;
    private String fuelType;
    private String transmission;
    private int mileage;
    private double price;
    private String condition;

}

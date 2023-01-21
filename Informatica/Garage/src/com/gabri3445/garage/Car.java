package com.gabri3445.garage;

import java.math.BigDecimal;

public class Car extends Vehicle {
    public Car(String name, String brand, String licensePlate, int entranceHour) {
        super(name, brand, licensePlate, entranceHour);
        setCostToEnter(BigDecimal.valueOf(2));
    }
}

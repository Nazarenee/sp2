package org.example;

import java.util.ArrayList;

public class FleetOfCars {
    private ArrayList<Car> cars = new ArrayList<>();


    public String toString() {
        String s = "\n-----------------------\n";
        for (Car car : cars) {
            s+= car.toString();
            s+="\n-----------------------\n";
        }
        return s;
    }


    public void carsadd(Car car) {
        cars.add(car);
    }


    public int totalregistrationfleetofcars() {
        int totalregistration = 0;
        for (Car car : cars) {
            totalregistration += car.getRegistrationFee();
        }
        return totalregistration;
    }
}
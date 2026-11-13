package com.pluralsight;

import java.util.ArrayList;
import java.util.*;

public class Dealership {
    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> inventory;

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public void addVehicle(Vehicle vehicle) {
        inventory.add(vehicle);
    }
    public void removeVehicle(Vehicle vehicle) {
        inventory.remove(vehicle);
    }
    public void getAllTheVehicles() {
        int size = inventory.size();
        System.out.println("total car " + size );
        for (int i = 0; i < size; i++) {
            Vehicle car = inventory.get(i);

            System.out.printf(" VIN : %d  | Year : %d  | Make : %s |" +
                    " Model : %s | vehicle type: %s | Color : %s | Odometer : %d |  Price : %.2f%n ",
                    car.getVin(),
                    car.getYear(),
                    car.getMake(),
                    car.getModel(),
                    car.getVehicleType(),
                    car.getColor(),
                    car.getOdometer(),
                    car.getPrice()
                    );
        }
    }public void getVehicle() {

    }


}

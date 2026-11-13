package com.pluralsight;

import java.io.IOException;
import java.math.BigDecimal;
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
    }public void getVehicleByPrice() {
        int size = inventory.size();
        int maxPrice = Console.promptForInt("Enter The Max Value: ");
        int minPrice = Console.promptForInt("Enter The Minimum Value");

        for (int i = 0; i < size; i++) {
            Vehicle car = inventory.get(i);
            if (car.getPrice().compareTo(BigDecimal.valueOf(minPrice)) >= 0
                    && car.getPrice().compareTo(BigDecimal.valueOf(maxPrice)) <= 0) {
                System.out.println(car);
            }
        }

    }public void getVehicleByMakeModel() {
        String make = Console.promptForString("Enter The Make : ");
        String model = Console.promptForString("Enter The Model : ");;

        int size = inventory.size();
        for (int i = 0; i < size; i++) {
            Vehicle car = inventory.get(i);
            if (car.getMake().equalsIgnoreCase(make) && car.getModel().equalsIgnoreCase(model)) {
                System.out.println(car);
            }
        }
    }public void getVehicleByYear() {
        int year = Console.promptForInt("Enter the year");
        int size = inventory.size();
        for (int i =0; i < size ; i++ ) {
            Vehicle car = inventory.get(i);
            if (year == car.getYear()) {
                System.out.println(car);
            }
        }
    }public void getVehicleByColor() {
        String color = Console.promptForString("Enter The color : ");
        int size = inventory.size();

        for (int i = 0; i < size; i++) {
            Vehicle car = inventory.get(i);
            if (car.getColor().equalsIgnoreCase(color)) {
                System.out.println(car);
            }
        }
    }
    public void getVehicleByMileage() {
        int lowestMileage = Console.promptForInt("Enter lowest mileage: ");
        int highestMileage = Console.promptForInt("Enter lowest mileage: ");

        int size = inventory.size();
        for (int i= 0; i < size; i++) {
            Vehicle car = inventory.get(i);
            if (car.getOdometer() <= highestMileage && car.getOdometer() >= lowestMileage) {
                System.out.println(car);
            }
        }
    }
    public void getVehicleByType() {
        String type = Console.promptForString("Enter a type from ; Car | SUV | Van | Truck") ;
        int size = inventory.size();

        for (int i = 0; i < size; i++) {
            Vehicle car = inventory.get(i);
            if (car.getVehicleType().equalsIgnoreCase(type)) {
                System.out.println(car);
            }
        }


    }



}

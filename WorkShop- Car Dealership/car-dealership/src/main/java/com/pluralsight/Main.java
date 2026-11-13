package com.pluralsight;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Dealership dealership = new Dealership("Das Auto",
                "34 Kent Road", "222-555-3345");
        Vehicle car = new Vehicle(363663656, 2025, "Toyota", "Sportage",
                "SUV", "Blue",60000, new BigDecimal("15000.00"));
        Vehicle car1 = new Vehicle(456334376, 2019, "Kia", "Sportage",
                "SUV", "Blue", 60000, new BigDecimal("15000.00"));

        Vehicle car2 = new Vehicle(363366272, 2022, "Toyota", "Camry",
                "Car", "White", 35000, new BigDecimal("24000.00"));

        Vehicle car3 = new Vehicle(563782914, 2020, "Honda", "Civic",
                "Car", "Black", 45000, new BigDecimal("19000.00"));

        Vehicle car4 = new Vehicle(782345619, 2023, "Ford", "F-150",
                "Truck", "Red", 25000, new BigDecimal("38000.00"));

        Vehicle car5 = new Vehicle(923456781, 2021, "Jeep", "Wrangler",
                "SUV", "Green", 40000, new BigDecimal("32000.00"));

        Vehicle car6 = new Vehicle(634789215, 2018, "Honda", "Odyssey",
                "Van", "Silver", 85000, new BigDecimal("17500.00"));
        dealership.addVehicle(car);
        dealership.addVehicle(car2);
        dealership.addVehicle(car3);
        dealership.addVehicle(car4);
        dealership.addVehicle(car5);
        dealership.addVehicle(car6);

        System.out.println("Dealers Name: " + dealership.getName());
        System.out.println("Dealers Address: " + dealership.getAddress());
        System.out.println("Dealers Phone No: " + dealership.getPhone());

        dealership.getAllTheVehicles();



    }
}
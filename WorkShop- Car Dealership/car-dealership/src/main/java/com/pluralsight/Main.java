package com.pluralsight;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {


        Dealership dealership = new Dealership("Das Auto",
                "34 Kent Road", "222-555-3345");


        Vehicle car = new Vehicle(3634666363773L, 2025, "Toyota", "Sienna",
                "SUV", "Blue",80000, new BigDecimal("16000.00"));
        Vehicle car1 = new Vehicle(45633437637737L, 2019, "Kia", "Sportage",
                "SUV", "Blue", 60000, new BigDecimal("15000.00"));

        Vehicle car2 = new Vehicle(36336627246636L, 2022, "Toyota", "Camry",
                "Car", "White", 35000, new BigDecimal("24000.00"));

        Vehicle car3 = new Vehicle(56378291463663L, 2020, "Honda", "Civic",
                "Car", "Black", 45000, new BigDecimal("19000.00"));

        Vehicle car4 = new Vehicle(78234563553139L, 2023, "Ford", "F-150",
                "Truck", "Red", 25000, new BigDecimal("38000.00"));

        Vehicle car5 = new Vehicle(92345678366361L, 2021, "Jeep", "Wrangler",
                "SUV", "Green", 40000, new BigDecimal("32000.00"));

        Vehicle car6 = new Vehicle(63478923773315L, 2018, "Honda", "Odyssey",
                "Van", "Silver", 85000, new BigDecimal("17500.00"));
       dealership.addVehicle(car);
       dealership.addVehicle(car1);
        dealership.addVehicle(car2);
        dealership.addVehicle(car3);
        dealership.addVehicle(car4);
       dealership.addVehicle(car5);
       dealership.addVehicle(car6);

//        System.out.println(dealership.getName());
//        System.out.println(dealership.getAddress());
//        System.out.println(dealership.getPhone());
//        dealership.getAllTheVehicles();
//        dealership.getVehicleByPrice();
//        dealership.getVehicleByMakeModel();
//        dealership.getVehicleByYear();
//        dealership.getVehicleByColor();
//        dealership.getVehicleByMileage();
//        dealership.getVehicleByType();
//        dealership.removeVehicle(car6);
//        dealership.getAllTheVehicles();


        DealershipFileManager fileManager = new DealershipFileManager();
        fileManager.saveDealership(dealership);

        UserInterFace userInterface = new UserInterFace();
        userInterface.display();
    }
}
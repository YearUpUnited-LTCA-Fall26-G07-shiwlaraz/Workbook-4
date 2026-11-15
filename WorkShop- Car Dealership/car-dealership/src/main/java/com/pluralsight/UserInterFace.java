package com.pluralsight;

import java.math.BigDecimal;

public class UserInterFace {
    private Dealership dealership;
    private final DealershipFileManager fileManager = new DealershipFileManager();

    private void init() {
        dealership = fileManager.getDealership();
    }
    public void display() {
        init();
        if (dealership == null) {
            System.out.print("Could nt load dealership");
            return;
        }
        while (true) {
            System.out.println("""
                                        1 - Find vehicles by price
                                        2 - Find vehicles by make/model
                                        3 - Find vehicles by year
                                        4 - Find vehicles by color
                                        5 - Find vehicles by mileage
                                        6 - Find vehicles by type
                                        7 - List all vehicles
                                        8 - Add a vehicle
                                        9 - Remove a vehicle
                                        99 - Quit
                    """);
            int choice = Console.promptForInt("Enter the choice");
            try {
                switch(choice) {
                    case 1 -> processGetByPriceRequest();
                    case 2 -> processGetByMakeModelRequest();
                    case 3 -> processGetByYearRequest();
                    case 4 -> processGetByColorRequest();
                    case 5 -> processGetByMileageRequest();
                    case 6 -> processGetByVehicleTypeRequest();
                    case 7 -> processGetAllVehiclesRequest();
                    case 8 -> processAddVehicleRequest();
                    case 9 -> processRemoveVehicleRequest();
                    case 99 -> {
                        System.out.println("Goodbye!");
                        return;
                    }
                    default -> System.out.println("Invalid choice.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }
    }
    private void processGetByPriceRequest() {
        dealership.getVehicleByPrice();
    }

    private void processGetByMakeModelRequest() {
        dealership.getVehicleByMakeModel();
    }

    private void processGetByYearRequest() {
        dealership.getVehicleByYear();
    }

    private void processGetByColorRequest() {
        dealership.getVehicleByColor();
    }

    private void processGetByMileageRequest() {
        dealership.getVehicleByMileage();
    }

    private void processGetByVehicleTypeRequest() {
        dealership.getVehicleByType();
    }

    private void processGetAllVehiclesRequest() {
        dealership.getAllTheVehicles();
    }
    private void processAddVehicleRequest() {

        String vinNumber = Console.promptForString("Enter The Vin number");
        Long vin = Long.parseLong(vinNumber);
        for (Vehicle car : dealership.getAllVehicles()) {
            if (car.getVin() == vin) {
                System.out.print("Vin already exits") ;
                return;
            }
        }
        int year = Console.promptForInt("Enter The year");
        String make =Console.promptForString("Enter The make");
        String model =Console.promptForString("Enter The model");
        String vehicleType =Console.promptForString("Enter The vehicle type");
        String color =Console.promptForString("Enter The color");
        int odometer = Console.promptForInt("Enter The odometer reading");
        double doublePrice = Console.promptForDouble("Enter the price");
        BigDecimal price = new BigDecimal(doublePrice);

        Vehicle vehicle = new Vehicle(
                vin, year, make, model, vehicleType, color, odometer, price
        );
        dealership.addVehicle(vehicle);
        fileManager.saveDealership(dealership);
    }
    private void processRemoveVehicleRequest() {
        String vinNumber = Console.promptForString("Enter vin number");
        long vin = Long.parseLong(vinNumber);
        Vehicle vehicleToRemove = null;

        for (Vehicle car : dealership.getAllVehicles()) {
            if (car.getVin() == vin) {
                vehicleToRemove = car;
                break;
            }
        }
        if (vehicleToRemove == null) {
            System.out.println("Vehicle not found.");
            return;
        }
        dealership.removeVehicle(vehicleToRemove);
        fileManager.saveDealership(dealership);
    }
}

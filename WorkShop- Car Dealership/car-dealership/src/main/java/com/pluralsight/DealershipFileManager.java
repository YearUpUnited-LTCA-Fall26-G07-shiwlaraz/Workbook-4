package com.pluralsight;

import java.io.*;
import java.math.BigDecimal;

public class DealershipFileManager {
    public Dealership getDealership() {
        try (BufferedReader reader = new BufferedReader(new FileReader("inventory.csv"))) {
            String line = reader.readLine();

            if (line == null) {
                return null;
            }

            String[] dealersInfo = line.split("[|]");

            Dealership dealership = new Dealership(
                    dealersInfo[0],
                    dealersInfo[1],
                    dealersInfo[2]
            );

            while ((line = reader.readLine()) != null) {
                if (line.isBlank()) {
                    continue;
                }
                String[] splits = line.split("[|]");
                Vehicle vehicle = new Vehicle(
                        Long.parseLong(splits[0]),
                        Integer.parseInt(splits[1]),
                        splits[2],
                        splits[3],
                        splits[4],
                        splits[5],
                        Integer.parseInt(splits[6]),
                        new BigDecimal(splits[7])


                );
                dealership.addVehicle(vehicle);
            }
            return dealership;

        } catch (IOException e) {
            System.out.println("Could not load dealership: " + e.getMessage());
            return null;
        }

    }
    public void saveDealership(Dealership dealership) {
        try {
            FileWriter fr1 = new FileWriter("inventory.csv");
            BufferedWriter  bw1 = new BufferedWriter(fr1);

            bw1.write(
                    dealership.getName() + " | " +
                    dealership.getAddress() + " | " +
                    dealership.getPhone()
            );
            bw1.newLine();

            for (Vehicle vehicle : dealership.getAllVehicles()) {
                bw1.write(
                        vehicle.getVin() + "|" +
                                vehicle.getYear() + "|" +
                                vehicle.getMake() + "|" +
                                vehicle.getModel() + "|" +
                                vehicle.getVehicleType() + "|" +
                                vehicle.getColor() + "|" +
                                vehicle.getOdometer() + "|" +
                                vehicle.getPrice()
                );
                bw1.newLine();
            }
            bw1.close();

        } catch (IOException e) {
            System.out.println("Cannot write file" + e.getMessage());
         }
    }
}

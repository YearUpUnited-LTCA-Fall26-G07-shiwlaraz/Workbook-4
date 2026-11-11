package com.pluralsight;

import java.awt.*;

public class Main {
    static void main(String[] args) {

        // Testing the room first
        Room room = new Room(2, 180, false, false);
        System.out.println(room.getNumberOfBeds());
        System.out.println(room.getPrice());
        System.out.println(room.isAvailable());


        room.checkIn();
        System.out.println(room.isOccupied());
        room.checkOut();
        System.out.println(room.isDirty());
        room.cleanRoom();
        System.out.println(room.isAvailable());

        // Testing the Reservation:

        Reservation reservation = new Reservation("king", 3, true );

        System.out.println(reservation.getRoomType());
        System.out.println(reservation.getNumberOfNights());
        System.out.println(reservation.isWeekend());

        System.out.println(reservation.getPrice());
        System.out.println(reservation.getReservationTotal());

        //Testing the Employee
        Employee employee = new Employee(66366L,"Pial", "Operations", 30, 0);

        employee.punchIn(9);
        employee.punchOut(17);


        System.out.println(employee.getName());
        System.out.println(employee.getEmployeeId());
        System.out.println(employee.getDepartment());
        System.out.println(employee.getPayRate());
        System.out.println(employee.getHoursWorked());
        System.out.println(employee.getOverTimeHours());
        System.out.println(employee.getRegularHours());
        System.out.println(employee.getTotalPay());

        employee.punchIn();
        employee.punchIn();

        // Testing The Hotel class
        Hotel hotel = new Hotel("Intercontinental", 10, 20);
        System.out.println(hotel.getName());
        System.out.println(hotel.getAvailableSuites());
        System.out.println(hotel.getAvailableRooms());

        hotel.bookRoom(3, true);
        System.out.println(hotel.getAvailableSuites());
        hotel.bookRoom(3, false);
        System.out.println(hotel.getAvailableRooms());
    }
}
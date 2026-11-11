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

        System.out.println(reservation.isWeekend());




    }
}
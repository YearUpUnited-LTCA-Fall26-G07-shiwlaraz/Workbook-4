package com.pluralsight;

import java.time.LocalDate;

public class Reservation {
    private String roomType;
    private int numberOfNights;
    private boolean weekend;


    public Reservation(String roomType,double price, int numberOfNights) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.weekend = weekend;

    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }
    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }
    public void setWeekend(boolean weekend) {
        this.weekend = weekend;
    }

    public String getRoomType() {
        return roomType;
    }
    public int getNumberOfNights() {
        return numberOfNights;
    }
    public boolean isWeekend() {
        return weekend;
    }
    public double getPrice () {
        double price;

        if (roomType.equalsIgnoreCase("king")) {
            price = 139;
        }else if (roomType.equalsIgnoreCase("double")) {
            price = 124.00;
        } else {
            return  0.00;
        }
        if (weekend) {
            price = price * 1.1;
        }return price ;

    }
    public double getReservationTotal() {
        double total = numberOfNights * getPrice();
        return total;
    }



}

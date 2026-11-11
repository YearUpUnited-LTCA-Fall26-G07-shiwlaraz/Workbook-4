
package com.pluralsight;

public class Reservation {

    private String roomType;
    private int numberOfNights;
    private boolean weekend;

    public Reservation(String roomType, int numberOfNights,
                       boolean weekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.weekend = weekend;
    }

    public double getPrice() {
        if (roomType.equalsIgnoreCase("king")) {
            return 139.00;
        } else if (roomType.equalsIgnoreCase("double")) {
            return 124.00;
        } else {
            return 0.00;
        }
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

    public double getReservationTotal() {
        double total = getPrice() * numberOfNights;

        if (weekend) {
            total = total * 1.10;
        }

        return total;
    }

}

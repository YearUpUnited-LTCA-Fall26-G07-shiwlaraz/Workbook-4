package com.pluralsight;

public class Room {

    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;

    public Room(int numberOfBeds, double price, boolean isOccupied, boolean isDirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = isOccupied;
        this.dirty = isDirty;

    }
    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }
    public void setPrice(double price) {
        this.price= price;
    }
    public void setOccupied(boolean isOccupied) {
        this.occupied = isOccupied;
    }
    public void setDirty(boolean isDirty) {
        this.dirty = isDirty;
    }
    public int getNumberOfBeds() {
        return numberOfBeds;
    }
    public double getPrice() {
        return price;
    }
    public boolean isOccupied() {
        return occupied;
    }
    public boolean isDirty() {
        return dirty;
    }
    public boolean isAvailable() {
        return !dirty && !occupied;
    }

    // Need Review. Wanted to use other logic
    public void checkIn(){
        if (isAvailable()) {
            occupied = true;
            dirty = true;
        }
    }
    public void checkOut() {
        occupied = false;
    }
    public void cleanRoom() {
        if (!occupied) {
            dirty = false;
        }
    }
}

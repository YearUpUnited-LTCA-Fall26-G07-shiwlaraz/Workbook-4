package com.pluralsight;

public class Hotel {
    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;

    public Hotel(String name, int numberOFSuites, int numbersOfRooms, String bookedSuites, String bookedBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOFSuites;
        this.numberOfRooms = numbersOfRooms;
        this.bookedSuites = 0;
        this.bookedBasicRooms = 0 ;
    }

    public Hotel(String name, int numberOfSuites, int numberOfRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = 0;
        this.bookedBasicRooms = 0;



    }
    public Hotel(String name, int numberOfSuites
            , int numberOfRooms, int bookedSuites
            , int bookedBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;

    }
    public String getName() {
        return name;
    }

    public int getAvailableSuites() {
        return numberOfSuites - bookedSuites;
    }
    public int getAvailableRooms() {
        return numberOfRooms - bookedBasicRooms;
    }


    public boolean bookRoom(int roomCount, boolean suite) {
        if (roomCount <= 0) {
            return false;
        }
        if (suite) {
            if (roomCount <= getAvailableSuites()) {
                bookedSuites += roomCount;
                return true;
            }

        } else {
            if (roomCount <= getAvailableSuites()) {
                bookedBasicRooms += roomCount;
                return true;
            }
        }return false;
    }
}

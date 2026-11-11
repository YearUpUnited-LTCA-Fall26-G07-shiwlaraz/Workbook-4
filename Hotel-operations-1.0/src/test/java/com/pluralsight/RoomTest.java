package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test //room should be occupied and dirty
    void checkIn() {
        //Arrange
        Room room = new Room(3, 180, false, false);

        //Act
        room.checkIn();

        //Assert
        assertEquals(true, room.isOccupied() && room.isDirty());
    }

    @Test //Room should not be occupied and Dirty
    void checkOut() {
        //Arrange
        Room room = new Room(2, 124, false, false);

        //Act
        room.checkOut();

        //Assert
        assertEquals(false, room.isOccupied());


    }

    @Test //After clean the dirty should be false
    void cleanRoom() {
        //Arrange
        Room room = new Room(2, 124, false, false);

        //Act
        room.cleanRoom();

        //Assert
        assertEquals(false, room.isDirty());

    }
}
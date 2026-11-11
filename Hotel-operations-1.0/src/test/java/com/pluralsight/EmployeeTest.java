package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void punchIn() {

        //Arrange
        Employee employee = new Employee(137728, "Das", "Operation", 34, 0);

        //Act
        employee.punchIn(9);

        //Assert
        assertEquals(9.0, employee.getStartTime());
    }

    @Test
    void punchOut() {
        //Arrange
        Employee employee = new Employee(137728, "Das", "Operation", 34, 0);

        //Act
        employee.punchIn(8);
        employee.punchOut(15);

        //Assert
        assertEquals(7.0, employee.getHoursWorked(), 0.001);
    }
}
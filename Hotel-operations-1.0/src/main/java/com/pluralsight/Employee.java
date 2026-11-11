package com.pluralsight;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Employee {
    private long employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    public int startTime;
    public LocalDateTime clockInTime;

    public Employee (long employeeId, String name, String department,
                     double payRate, double hoursWorked ) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }
    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }
    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }
    public double getRegularHours() {
        if (hoursWorked >= 40) {
            return 40;
        }else {
            return hoursWorked;
        }
    }
    public double getOverTimeHours() {
        if (hoursWorked > 40) {
            return  hoursWorked - 40;
        }else {
            return 0.00;
        }
    }

    public double getTotalPay() {
        if (hoursWorked <= 40) {
            return hoursWorked * payRate;
        }else {
            return (getRegularHours() * payRate) +
                    (getOverTimeHours() * payRate * 1.5) ;
        }
    }


    public void punchIn (int time) {
        startTime = time;
    }
    public void punchOut(int time) {
        hoursWorked += time - startTime;
    }
    public void punchIn () {
        clockInTime = LocalDateTime.now();
    }
    public void punchOut() {
        if (clockInTime  != null) {
            LocalDateTime clockOutTime = LocalDateTime.now();

            long minutes = Duration.between(
                    clockInTime, clockOutTime
            ).toMinutes();

            hoursWorked += minutes / 60.0;

            clockInTime = null;
        }
    }



}

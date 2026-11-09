package com.pluralsight;

public class Employees {
    private long employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    public Employees (long employeeId, String name, String department,
                      double payRate,double hoursWorked)  {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }
    public void setEmployeeId(long employeeId){
        this.employeeId = employeeId ;
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


}

package com.sdl.functionaProgramming;

public class Employee {
    private String firstName;
    private String lastName;
    private int yearOfService;
    private int numberOfDirectReports;
    private Employee manager;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYearOfService() {
        return yearOfService;
    }

    public void setYearOfService(int yearOfService) {
        this.yearOfService = yearOfService;
    }

    public int getNumberOfDirectReports() {
        return numberOfDirectReports;
    }

    public void setNumberOfDirectReports(int numberOfDirectReports) {
        this.numberOfDirectReports = numberOfDirectReports;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }
}

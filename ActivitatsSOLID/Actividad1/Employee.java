package Actividad1;

import java.util.Random;

class Employee {

    private String firstName;
    private String lastName;
    private String empId;
    private String level;
    private double experienceInYears;

    public Employee(String firstName, String lastName, double experience) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.experienceInYears = experience;
        this.empId = new GenerateId().generateEmpId(firstName);
        this.level = new CheckSeniority().checkSeniority(experienceInYears);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmpId() {
        return empId;
    }

    public String getLevel() {
        return level;
    }

    public double getExperienceInYears() {
        return experienceInYears;
    }
}
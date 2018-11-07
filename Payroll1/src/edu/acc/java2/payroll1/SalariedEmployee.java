package edu.acc.java2.payroll1;

public class SalariedEmployee {
    private String firstName;
    private String lastName;
    private double salary;
    
    public SalariedEmployee(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public double getPay() {
        return salary / 52.0;
    }

    @Override
    public String toString() {
        return String.format("%s %s", firstName, lastName);
    }

}

package edu.acc.java2.payroll2;

import java.io.Serializable;

public abstract class Employee implements Serializable {
    private String firstName;
    private String lastName;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
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

    public abstract double getPay();
    
    @Override
    public String toString() {
        return String.format("%s %s", firstName, lastName);
    }
}

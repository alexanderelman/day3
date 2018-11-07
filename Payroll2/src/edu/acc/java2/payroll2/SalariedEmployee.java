package edu.acc.java2.payroll2;

public class SalariedEmployee extends Employee {
    private double salary;
    
    public SalariedEmployee(String firstName, String lastName, double salary) {
        super(firstName, lastName);
        this.salary = salary;
    }
    
    @Override
    public double getPay() {
        return salary / 52;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

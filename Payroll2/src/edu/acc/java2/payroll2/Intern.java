package edu.acc.java2.payroll2;

public class Intern extends Employee {
    private double stipend;

    public Intern(String firstName, String lastName, double stipend) {
        super(firstName, lastName);
        this.stipend = stipend;
    }

    public double getStipend() {
        return stipend;
    }

    public void setStipend(double stipend) {
        this.stipend = stipend;
    }

    @Override
    public double getPay() {
        return stipend;
    }
}

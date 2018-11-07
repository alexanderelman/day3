package edu.acc.java2.payroll2;

public class HourlyEmployee extends Employee {
    private double hours;
    private double wage;

    public HourlyEmployee(String firstName, String lastName, double hours, double wage) {
        super(firstName, lastName);
        this.hours = hours;
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    @Override
    public double getPay() {
        double pay = hours * wage;
        if (hours > 40) pay += .5 * wage * (hours - 40);
        return pay;
    }

}

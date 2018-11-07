package edu.acc.java2.payroll1;

public class HourlyEmployee {
    private String firstName;
    private String lastName;
    private double hours;
    private double wage;

    public HourlyEmployee(String firstName, String lastName, double hours, double wage) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.hours = hours;
        this.wage = wage;
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
    
    public double getWeeksPay() {
        double pay = hours * wage;
        if (hours > 40) pay += .5 * wage * (hours - 40);
        return pay;
    }

    @Override
    public String toString() {
        return String.format("%s %s", firstName, lastName);
    }
    

}

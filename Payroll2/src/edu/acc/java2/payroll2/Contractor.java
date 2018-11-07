package edu.acc.java2.payroll2;

public class Contractor extends Employee {
    private int payPeriods;
    private double totalPay;

    public Contractor(String firstName, String lastName, int payPeriods, double totalPay) {
        super(firstName, lastName);
        this.payPeriods = payPeriods;
        this.totalPay = totalPay;
    }

    public int getPayPeriods() {
        return payPeriods;
    }

    public void setPayPeriods(int payPeriods) {
        this.payPeriods = payPeriods;
    }

    public double getTotalPay() {
        return totalPay;
    }

    public void setTotalPay(double totalPay) {
        this.totalPay = totalPay;
    }

    @Override
    public double getPay() {
        return totalPay / payPeriods;
    }
    

}

package edu.acc.java2.payroll1;

public class Pieceworker {
    private String firstName;
    private String lastName;
    private double hours;
    private double wage;
    private double pieceRate;
    private int pieces;

    public Pieceworker(String firstName, String lastName, double hours, double wage, double pieceRate, int pieces) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.hours = hours;
        this.wage = wage;
        this.pieceRate = pieceRate;
        this.pieces = pieces;
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

    public double getPieceRate() {
        return pieceRate;
    }

    public void setPieceRate(double pieceRate) {
        this.pieceRate = pieceRate;
    }

    public int getPieces() {
        return pieces;
    }

    public void setPieces(int pieces) {
        this.pieces = pieces;
    }
    
    public double calculatePay() {
        double pay = hours * wage;
        if (hours > 40) pay += .5 * wage * (hours - 40);
        pay += pieceRate * pieces;
        return pay;
    }

    @Override
    public String toString() {
        return String.format("%s %s", firstName, lastName);
    }
    
}

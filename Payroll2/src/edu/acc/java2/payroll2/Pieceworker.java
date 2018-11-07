package edu.acc.java2.payroll2;

public class Pieceworker extends HourlyEmployee {
    private double pieceRate;
    private int pieces;

    public Pieceworker(String firstName, String lastName, double hours,
            double wage, double pieceRate, int pieces ) {
        super(firstName, lastName, hours, wage);
        this.pieceRate = pieceRate;
        this.pieces = pieces;
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

    @Override
    public double getPay() {
        return pieces * pieceRate + super.getPay();
    }

}

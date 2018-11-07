package edu.acc.java2.payroll1;

public class Main {

    public static void main(String[] args) {
        SalariedEmployee alice = new SalariedEmployee("Alice", "Alpha", 80_000.00);
        HourlyEmployee bob = new HourlyEmployee("Bob", "Beta", 42.75, 43.00);
        Pieceworker gene = new Pieceworker("Gene", "Gamma", 31.50, 21.00, .18, 808);
        Object[] staff = new Object[] {alice, bob, gene};

        double companyGross = 0.0;
        for (Object o : staff) {
            double grossPay = 0.0, netPay = 0.0;
            if (o instanceof SalariedEmployee)
                grossPay = ((SalariedEmployee)o).getPay();
            else if (o instanceof HourlyEmployee)
                grossPay = ((HourlyEmployee)o).getWeeksPay();
            else if (o instanceof Pieceworker)
                grossPay = ((Pieceworker)o).calculatePay();
            companyGross += grossPay;
            netPay = grossPay * .83;
            System.out.printf("Pay to the order of %s the amount $%.2f\n",
                    o, netPay);
        }

        System.out.printf("\nCompany Gross: $%.2f\n", companyGross);
    }
}

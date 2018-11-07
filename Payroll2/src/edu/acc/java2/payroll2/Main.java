package edu.acc.java2.payroll2;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Employee[] staff = {
            new SalariedEmployee("Alice", "Alpha", 80_000.00),
            new HourlyEmployee("Bob", "Beta", 42.75, 43.00),
            new Pieceworker("Gene", "Gamma", 31.50, 21.00, .18, 808),
            new Intern("Dana", "Delta", 250.00),
            new Contractor("Earl", "Epsilon", 6, 10_000.00)
        };

        double companyGross = 0.0;
        for (Employee e : staff) {
            double grossPay = e.getPay();
            companyGross += grossPay;
            double netPay = grossPay * .83;
            System.out.printf("Pay to the order of %s the amount $%.2f\n",
                    e, netPay);
        }

        System.out.printf("\nCompany Gross: $%.2f\n", companyGross);
        if (staff[2] instanceof Pieceworker) {
            System.out.printf("\n%s's piece rate is $%.2f\n", staff[2].getFirstName(),
                    ((Pieceworker) staff[2]).getPieceRate());
        }

        Arrays.sort(staff, new EmployeeComparator());
        for (Employee e : staff) {
            System.out.printf("%s: $%.2f\n", e, e.getPay());
        }
        
        Arrays.sort(staff, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
               Character e1c1 = e1.getLastName().charAt(1);
               Character e2c1 = e2.getLastName().charAt(1);
               return e1c1.compareTo(e2c1);            }
            
        });
        for (Employee e : staff)
            System.out.printf("\n%s", e);
        
        System.out.println();
        
        Arrays.sort(staff, (e1, e2) -> {
               Character e1c1 = e1.getFirstName().charAt(1);
               Character e2c1 = e2.getFirstName().charAt(1);
               return e2c1.compareTo(e1c1);             
        });
        
        for (Employee e : staff)
            System.out.printf("\n%s", e);        Comparator<Employee> lambda = (e1, e2) -> {
               Character e1c1 = e1.getFirstName().charAt(1);
               Character e2c1 = e2.getFirstName().charAt(1);
               return e2c1.compareTo(e1c1);             
        };
        Arrays.sort(staff, lambda);

     }
}

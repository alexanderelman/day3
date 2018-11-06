package edu.acc.java2.hw2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final int CAPACITY = 24;
    
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java -jar hw2.jar {staff.csv}");
            return;
        }
        List<Employee> staff = loadStaffFrom(args[0]);
        if (staff.isEmpty()) {
            System.out.println("Couldn't load staff data!");
            return;
        }
        int bigBucks = howManyEmployeesEarnedOver100K(staff);
        double grossPay = whatWasWidgetsIncGrossPay(staff);
        int kahunaCount = howManyChiefExecutives(staff);
        List<Employee> suckUps = whoTookNoVacation(staff);
        List<Employee> slackers = whoTookAllTheirVacation(staff);
        double taxesPaid = howMuchWasDeductedFromPayroll(staff, .17);
        double bonusPaid = howMuchBonusWasPaidOut(staff);
        
        StringBuilder output = new StringBuilder(512);
        output.append("\nEmployees earning over $100,000: ")
                .append(bigBucks)
                .append("\nGross Payroll Spent: ")
                .append(String.format("$%.2f", grossPay))
                .append("\nCount of Executives: ")
                .append(kahunaCount)
                .append("\nEmployees Using No Vacation: ")
                .append(suckUps)
                .append("\nEmployees Using All Vacation: ")
                .append(slackers)
                .append("\nPayroll Taxes Deducted: ")
                .append(String.format("$%.2f", taxesPaid))
                .append("\nBonus Paid Out: ")
                .append(String.format("$%.2f", bonusPaid));
        System.out.println(output);
    }
    
    private static List<Employee> loadStaffFrom(String file) {
        List<Employee> staff = new ArrayList<>(CAPACITY);
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            br.readLine(); // discard the header line
            String line;
            while ((line = br.readLine()) != null) {
                String[] cols = line.split(",");
                Employee e = new Employee();
                e.setLastName(cols[0]);
                e.setFirstName(cols[1]);
                e.setId(Integer.parseInt(cols[2]));
                e.setTitle(cols[3]);
                e.setGrossWages(Double.parseDouble(cols[4]));
                e.setVacationEarned(Integer.parseInt(cols[5]));
                e.setVacationSpent(Integer.parseInt(cols[6]));
                e.setBonused(cols[7].equals("Y"));
                e.setBonusPercent(Integer.parseInt(cols[8]));
                e.setZipCode(cols[9]);
                staff.add(e);
            }
        } catch (IOException ioe) {}
        return staff;
    }

    private static int howManyEmployeesEarnedOver100K(List<Employee> staff) {
        int count = 0;
        for (Employee e : staff)
            if (e.getGrossWages() > 100_000) count++;
        return count;
    }

    private static double whatWasWidgetsIncGrossPay(List<Employee> staff) {
        double gross = 0.0;
        for (Employee e : staff)
            gross += e.getGrossWages();
        return gross;
    }

    private static int howManyChiefExecutives(List<Employee> staff) {
        int chiefs = 0;
        for (Employee e : staff)
            if (e.getTitle().startsWith("Chief")) chiefs++;
        return chiefs;
    }

    private static List<Employee> whoTookNoVacation(List<Employee> staff) {
        List<Employee> result = new ArrayList<>();
        for (Employee e : staff)
            if (e.getVacationSpent() == 0) result.add(e);
        return result;
    }

    private static List<Employee> whoTookAllTheirVacation(List<Employee> staff) {
        List<Employee> result = new ArrayList<>();
        for (Employee e : staff)
            if (e.getVacationSpent() == e.getVacationEarned()) result.add(e);
        return result;
    }

    private static double howMuchWasDeductedFromPayroll(List<Employee> staff, double percent) {
        double deducted = 0.0;
        for (Employee e : staff)
            deducted += percent * e.getGrossWages();
        return deducted;
    }

    private static double howMuchBonusWasPaidOut(List<Employee> staff) {
        double bonus = 0.0;
        for (Employee e : staff)
            bonus += e.isBonused() ? e.getBonusPercent() * e.getGrossWages() / 100 : 0.0;
        return bonus;
    }
    
}

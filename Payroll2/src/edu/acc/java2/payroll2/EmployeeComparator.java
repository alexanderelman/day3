package edu.acc.java2.payroll2;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o2.getLastName().compareTo(o1.getLastName());
    }
    
}

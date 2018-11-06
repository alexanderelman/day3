package edu.acc.java2.hw2;

public class Employee {
    private String lastName;
    private String firstName;
    private int id;
    private String title;
    private double grossWages;
    private int vacationEarned;
    private int vacationSpent;
    private boolean bonused;
    private int bonusPercent;
    private String zipCode;

    public Employee() {
    }

    public Employee(String lastName, String firstName, int id, String title, double grossWages, int vacationEarned, int vacationSpent, boolean bonused, int bonusPercent, String zipCode) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.id = id;
        this.title = title;
        this.grossWages = grossWages;
        this.vacationEarned = vacationEarned;
        this.vacationSpent = vacationSpent;
        this.bonused = bonused;
        this.bonusPercent = bonusPercent;
        this.zipCode = zipCode;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getGrossWages() {
        return grossWages;
    }

    public void setGrossWages(double grossWages) {
        this.grossWages = grossWages;
    }

    public int getVacationEarned() {
        return vacationEarned;
    }

    public void setVacationEarned(int vacationEarned) {
        this.vacationEarned = vacationEarned;
    }

    public int getVacationSpent() {
        return vacationSpent;
    }

    public void setVacationSpent(int vacationSpent) {
        this.vacationSpent = vacationSpent;
    }

    public boolean isBonused() {
        return bonused;
    }

    public void setBonused(boolean bonused) {
        this.bonused = bonused;
    }

    public int getBonusPercent() {
        return bonusPercent;
    }

    public void setBonusPercent(int bonusPercent) {
        this.bonusPercent = bonusPercent;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return String.format("%s %s", firstName, lastName);
    }
    
    
}

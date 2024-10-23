package com.example.btth2_prac02;



public class Staff {
    private String staffId;
    private String fullName;
    private String birthDate;
    private double salary;

    public Staff(String staffId, String fullName, String birthDate, double salary) {
        this.staffId = staffId;
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.salary = salary;
    }

    public String getStaffId() {
        return staffId;
    }

    public String getFullName() {
        return fullName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public double getSalary() {
        return salary;
    }
}


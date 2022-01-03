package com.company;

public class Uc_01_Emp_absent_present {
    public static void computeEmpWage() {
        int empCheck = (int) Math.floor(Math.random() % 10) % 2;
        if (empCheck == 1) {
            System.out.println("Employee is present");
        } else {
            System.out.println("Employee is absent");
        }
    }
    public static void main(String[] args) {
       computeEmpWage();
    }
}
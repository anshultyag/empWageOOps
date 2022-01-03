package com.company;

public class Uc_02_Emp_wage {
    public static void computeEmpWage(int wagePerHour) {
      int empHrs=0;
    int empCheck = (int) Math.floor(Math.random() * 10) % 2;
    if (empCheck == 1) {
            System.out.println("Employee is present");
            empHrs =8;
            int DailyWage=wagePerHour * empHrs;
            System.out.println("Total day wage : " + DailyWage );

    } else {
        System.out.println("Employee is absent");
    }
}
    public static void main(String[] args) {
        computeEmpWage(20);
    }
}

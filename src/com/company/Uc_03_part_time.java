package com.company;

public class Uc_03_part_time {
    public static void computeEmpWage(int wagePerHour) {
        int empHrs=0;
        int empCheck = (int) Math.floor(Math.random() * 10) % 2;
        if (empCheck == 1) {
            System.out.println("Full Time");
            empHrs =8;
        } else {
            System.out.println("Part Time :");
            empHrs =4;
        }
        int DailyWage=wagePerHour * empHrs;
        System.out.println("Total day wage : " + DailyWage );
    }
    public static void main(String[] args) {
        computeEmpWage(20);
    }
}

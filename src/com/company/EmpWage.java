package com.company;

public class EmpWage {
    static final int PART_TIME = 0;
    static final int FULL_TIME = 1;
    public static void computeEmpWage(int wagePerHour) {
        int empHrs=0;
        int empCheck = (int) Math.floor(Math.random() * 10) % 2;
        switch (empCheck) {
            case(PART_TIME):
                System.out.println("Part Time :");
                empHrs =8;
            case(FULL_TIME):
                System.out.println("Full time  :");
                empHrs =4;
        }
        int DailyWage=wagePerHour * empHrs;
        System.out.println("Total Emp wage : " + DailyWage );
    }
    public static void main(String[] args) {
        computeEmpWage(20);
    }
}

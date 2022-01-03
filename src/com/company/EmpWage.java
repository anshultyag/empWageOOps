package com.company;

public class EmpWage {
    static final int PART_TIME = 0;
    static final int FULL_TIME = 1;
    public static void computeEmpWage(int wagePerHour,int numOfWorkingDays,int maxHours) {
        int empHrs=0;
        int totalEmpHrs = 0;
        int totalWage = 0;
        int totalWorkingDays=0;
        while (numOfWorkingDays >= totalWorkingDays && maxHours > totalEmpHrs) {
             int empCheck = (int) Math.floor(Math.random() * 10) % 3;
             switch (empCheck) {
                case (PART_TIME):
                     empHrs = 8;
                     break;
                case (FULL_TIME):
                     empHrs = 4;
                     break;
                default:
                    empHrs = 0;00
                    break;
             }
            totalEmpHrs= totalEmpHrs + empHrs;
            totalWorkingDays++;
        }
        System.out.println("Total Emp Hours : " + totalEmpHrs);
        totalWage=  totalEmpHrs * wagePerHour;
        System.out.println("Total Emp wage : " + totalWage );
    }
    public static void main(String[] args) {
        computeEmpWage(20,21,100);
    }
}

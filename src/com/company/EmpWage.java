package com.company;

public class EmpWage {
    static final int PART_TIME = 0;
    static final int FULL_TIME = 2;
    private final String company;
    private final int wagePerHour;
    private final int numOfWorkingDays;
    private final int maxHours;

    public EmpWage(String company, int wagePerHour, int numOfWorkingDays, int maxHours) {
        this.company = company;
        this.wagePerHour = wagePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHours = maxHours;
    }
    public int computeEmpWage() {
        int empHrs = 0, totalEmpHrs = 0, totalWage = 0, totalWorkingDays = 0;
        while (numOfWorkingDays > totalWorkingDays && maxHours > totalEmpHrs) {
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case (PART_TIME):
                    empHrs = 8;
                    break;
                case (FULL_TIME):
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
                    break;
            }
            totalEmpHrs = totalEmpHrs + empHrs;
            totalWorkingDays++;
        }
        System.out.println("Total Emp days : " + totalWorkingDays);
        totalWage = totalEmpHrs * wagePerHour;
        return  totalEmpHrs + totalWage;
    }

    public static void main(String[] args) {
        EmpWage tata =new EmpWage("TATA",20,21,100);
        System.out.println("Total Emp Hours of " + tata.company +" is " +tata.computeEmpWage());
        System.out.println("Total Emp wage for  " + tata.company +" is " +tata.computeEmpWage() );
    }
}
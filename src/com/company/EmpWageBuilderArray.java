package com.company;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class EmpWageBuilderArray {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    private int numOfCompany = 0;
    private LinkedList<CompanyEmpWage> companyEmpWageList;
    private Map<String, CompanyEmpWage> companyToEmpWageMap;

    public EmpWageBuilderArray() {
        companyEmpWageList = new LinkedList<>();
        companyToEmpWageMap = new HashMap<>();
    }

    private void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
        CompanyEmpWage companyEmpWage = new CompanyEmpWage(company, empRatePerHour, numOfWorkingDays, maxHoursPerMonth);
        companyEmpWageList.add(companyEmpWage);
        companyToEmpWageMap.put(company, companyEmpWage);
    }
    private void computeEmpWage() {
        for (int i = 0; i < numOfCompany; i++) {
            CompanyEmpWage companyEmpWage = companyEmpWageList.get(i);
            companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
            System.out.println(companyEmpWage);
        }
    }

    public int computeEmpWage(CompanyEmpWage companyEmpWage) {...}

    @Override
    public int getTotalWage(String company) {
        return companyToEmpWageMap.get(company).totalEmpWage;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to employee wage");
        EmpWageBuilderArray empWageBuilder = new EmpWageBuilderArray();
        empWageBuilder.addCompanyEmpWage("TATA", 20, 20, 20);
        empWageBuilder.addCompanyEmpWage("Reliance", 22, 4, 20);
         System.out.println("Total wage for TATA : " );
        empWageBuilder.computeEmpWage();
        System.out.println("Total wage for TATA : " + empWageBuilder.getTotalWage("TATA"));
    }
}
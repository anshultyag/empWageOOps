package com.company;

public interface IComputeEmpWage {
    public void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHours);

    public void computeEmpWage();

    public int getTotalWage(String company);
}

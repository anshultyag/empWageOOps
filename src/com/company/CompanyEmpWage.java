package com.company;
public class CompanyEmpWage {
    public final String company;
    public final int empRatePerHour;
    public final int numOfWorkingDays;
    public final int maxHours;
    public int totalEmpWage;

    public CompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHours) {
        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHours = maxHours;
    }

    public void setTotalWage(int totalEmpWage) {
        this.totalEmpWage = totalEmpWage;
    }

    @Override
    public String toString() {
        return "Total Emp wage for company : " + company + " is : " + totalEmpWage;
    }
}
    public class EmpWageBuilderArray<CompanyEmpWage> {
        public static final int IS_PART_TIME = 1;
        public static final int IS_FULL_TIME = 2;

        private int numOfCompany = 0;
        private CompanyEmpWage[] companyEmpWageArray;

        public EmpWageBuilderArray() {
            companyEmpWageArray = new CompanyEmpWage[5];
        }

        private void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
            companyEmpWageArray[numOfCompany] = new CompanyEmpWage(company, empRatePerHour, numOfWorkingDays, maxHoursPerMonth);
            numOfCompany++;
        }

        private void computeEmpWage() {
            for (int i = 0; i < numOfCompany; i++) {
                companyEmpWageArray[i].setTotalWage(this.computeEmpWage(companyEmpWageArray[i]));
            }
        }

        private int computeEmpWage(CompanyEmpWage companyEmpWage) {
            int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
            while (totalWorkingDays <= computeEmpWage.maxHoursPerMonth && totalWorkingDays < computeEmpWage.numOfworkingDays) {
                totalWorkingDays++;
                int empCheck = (int) Math.floor(Math.random() * 10) % 3;
                switch (empCheck) {
                    case (IS_PART_TIME):
                        empHrs = 8;
                        break;
                    case (IS_FULL_TIME):
                        empHrs = 4;
                        break;
                    default:
                        empHrs = 0;

                }
                totalEmpHrs = totalEmpHrs + empHrs;
                System.out.println("Total Emp days : " + totalWorkingDays + "  Emp Hr : " + empHrs);
            }
            return totalEmpHrs * computeEmpWage.empRatePerHour;
        }

        public static void main(String[] args) {
            System.out.println("Welcome to employee wage");
            EmpWageBuilderArray empWageBuilder = new EmpWageBuilderArray();
            empWageBuilder.addCompanyEmpWage("TATA", 20, 20, 20);
            empWageBuilder.addCompanyEmpWage("Reliance", 22, 4, 20);
            empWageBuilder.computeEmpWage();
//        Scanner obj = new Scanner(System.in);
//        honda2.company= obj.next();
        }
    }
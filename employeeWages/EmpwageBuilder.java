package employeeWages;

public class EmpwageBuilder implements EmpWageInterface {

	public static final int is_Full_Time = 1;
	public static final int is_Part_Time = 2;
	private int numOfCompany = 0;
	private CompanyEmpWages[] companyEmpWageArray;

	/**
	 * This method is created to save the Employee Wage of multiple companies.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		EmpwageBuilder empWageBuilder = new EmpwageBuilder();
		empWageBuilder.addComapnyEmpWage("Dmart", 200, 25, 160);
		empWageBuilder.addComapnyEmpWage("Vijay", 220, 24, 150);
		empWageBuilder.addComapnyEmpWage("More", 210, 23, 155);
		empWageBuilder.addComapnyEmpWage("Ratnadeep", 250, 25, 160);

		empWageBuilder.computeEmpWage();
	}

	public EmpwageBuilder() {
		companyEmpWageArray = new CompanyEmpWages[5];
	}

	/**
	 * To Add company employee wages to companyEmpWageArray.
	 */
	@Override
	public void addComapnyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
		companyEmpWageArray[numOfCompany] = new CompanyEmpWages(company, empRatePerHour, numOfWorkingDays,
				maxHoursPerMonth);
		numOfCompany++;

	}

	/**
	 * To compute the employee wages of companies.
	 */
	@Override
	public void computeEmpWage() {
		for (int i = 0; i < numOfCompany; i++) {
			companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
			System.out.println("--------------------------------------------------------------------");
			System.out.println(companyEmpWageArray[i]);
			System.out.println("--------------------------------------------------------------------");
		}
	}

	private int computeEmpWage(CompanyEmpWages companyEmpWage) {
		int empHrs = 0, totalempHrs = 0, totalWorkingDays = 0;

		while (totalempHrs <= companyEmpWage.maxHoursPerMonth && totalWorkingDays < companyEmpWage.numOfWorkingDays) {
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;

			switch (empCheck) {
			case is_Part_Time:
				empHrs = 4;
				break;

			case is_Full_Time:
				empHrs = 8;
				break;

			default:
				empHrs = 0;
			}
			totalempHrs += empHrs;
			System.out.println("Day " + totalWorkingDays + ":" + "\nEmployee worked :" + empHrs + "hours");
		}
		return totalempHrs * companyEmpWage.empRatePerHour;
	}

}

package employeeWages;

public interface EmpWageInterface {
	/**
	 * To Add company employee wages to companyEmpWageArray.
	 */
	public void addComapnyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth);

	/**
	 * To compute the employee wages of companies.
	 */
	public void computeEmpWage();
}

package employeeWages;

public class CompanyWage {

	public final String companyName;
	public final int empRatePerHour;
	public final int numOfWorkingDays;
	public final int maxHoursPerMonth;
	public int totalEmpWage;

	/**
	 * Constructor
	 */
	public CompanyWage(String companyName, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
		super();
		this.companyName = companyName;
		this.empRatePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;

	}

	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}

	@Override
	public String toString() {
		return "CompanyWage [companyName=" + companyName + ", empRatePerHour=" + empRatePerHour + ", numOfWorkingDays="
				+ numOfWorkingDays + ", maxHoursPerMonth=" + maxHoursPerMonth + ", totalEmpWage=" + totalEmpWage + "]";
	}

}

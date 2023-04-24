package employeeWages;

public class Company {

	/**
	 * Initializing variables
	 */
	protected static String companyName;
	protected static int wageOfEmployee;
	private int totalsalary = 0;
	private int wage = 0;
	protected static int fullDayHour;
	protected static int partTimeHour;
	int isPresent;
	
/**
 * Using getter and setter methods.
 * @return
 */
	public static String getCompanyName() {
		return companyName;
	}

	public static void setCompanyName(String companyName) {
		Company.companyName = companyName;
	}

	
	
	public int getWageOfEmployee() {
		return wageOfEmployee;
	}

	public static void setWageOfEmployee(int wageOfEmployee) {

		if (wageOfEmployee <= 1000)
			Company.wageOfEmployee = wageOfEmployee;
		else
			System.out.println("wageOfEmployee is invalid");
	}

	
	
	public int getFullDayHour() {
		return fullDayHour;
	}

	public static void setFullDayHour(int fullDayHour) {

		if (fullDayHour <= 10)
			Company.fullDayHour = fullDayHour;
		else
			System.out.println("fullDayHour is invalid");
	}

	
	
	public int getPartTimeHour() {
		return partTimeHour;
	}

	public static void setPartTimeHour(int partTimeHour) {

		if (partTimeHour <= 8)
			Company.partTimeHour = partTimeHour;
		else
			System.out.println("partTimeHour is invalid");
	}
	
	

	/*
	 * Calculate the random number
	 * 
	 */
	public void random() {
		isPresent = (int) (Math.random() * 3);
	}

	/**
	 * Calculating daily wages of employee.
	 */
	public void calculatingWages() {
		int workinghour = fullDayHour + partTimeHour;

		for (int day = 1; day <= 20; day++)

		{

			if (workinghour <= 100) {
				/**
				 * Switch expression
				 */

				switch (isPresent) {

				case 1:
					// System.out.println("Employee is present");
					wage = fullDayHour * wageOfEmployee;
					totalsalary = totalsalary + wage;

					// System.out.println("Employee earned " +totalsalary );
					break;

				case 2:
					// System.out.println("Employee is partial present");
					wage = partTimeHour * wageOfEmployee;
					totalsalary = totalsalary + wage;

					// System.out.println("Employee earned " + totalsalary );
					break;

				default:
					// System.out.println("Employee is absent");

				}

			}
		}

	}

	/**
	 * Printing the data.
	 */
	@Override
	public String toString() {
		return "Company [companyName=" + companyName + ",   wageOfEmployee=" + wageOfEmployee + ",   totalsalary="
				+ totalsalary + ",  wage=" + wage + ",   FullDayHour=" + fullDayHour + ",   PartTimeHour="
				+ partTimeHour + "  ]";
	}
}

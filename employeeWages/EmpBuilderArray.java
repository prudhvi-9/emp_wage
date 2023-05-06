package employeeWages;

public class EmpBuilderArray {

	public static final int is_Full_Time = 1;
	public static final int is_Part_Time = 2;

	private final String company;
	private final int empratePerHour;
	private final int numOfWorkingDays;
	private final int maxHoursPerMonth;
	private int totalEmpWage;

	/**
	 * This method is created to save the total wage for each company.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		EmpBuilderArray DMart = new EmpBuilderArray("DMart", 40, 25, 150);
		EmpBuilderArray Reliance = new EmpBuilderArray("Reliance", 39, 25, 140);
		EmpBuilderArray Vijay = new EmpBuilderArray("Viay", 45, 24, 140);
		EmpBuilderArray Surya = new EmpBuilderArray("Surya", 35, 25, 129);
		DMart.computeEmpWage();
		System.out.println(DMart);
		System.out.println("-------------------------------------------");
		Reliance.computeEmpWage();
		System.out.println(Reliance);
		System.out.println("-------------------------------------------");
		Vijay.computeEmpWage();
		System.out.println(Vijay);
		System.out.println("-------------------------------------------");
		Surya.computeEmpWage();
		System.out.println(Surya);
	}

	/**
	 * Constructor
	 */
	public EmpBuilderArray(String company, int empratePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
		super();
		this.company = company;
		this.empratePerHour = empratePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;

	}

	/**
	 * To compute the employee wages of each company.
	 */
	public void computeEmpWage() {
		int empHrs = 0, totalempHrs = 0, totalworkingDays = 0;
		while (totalempHrs <= maxHoursPerMonth && totalworkingDays < numOfWorkingDays) {
			totalworkingDays++;
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
			System.out.println("Day " + totalworkingDays + ":" + "\nEmployee worked :" + empHrs + "hours");
		}
		totalEmpWage = totalempHrs * empratePerHour;
	}

	@Override
	public String toString() {
		return "Total Emp Wage for Company: " + company + " is: " + totalEmpWage;
	}

}
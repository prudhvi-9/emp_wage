package employeeWages;

public abstract class WagesOfEmp {
	static int wageOfEmployee = 20;
	static int sum = 0;
	static int wage = 0;
	static int FullDayHour = 8;
	static int PartTimeHour = 8;
	static int workinghour = FullDayHour + PartTimeHour;

	public static int getWageOfEmployee() {

		return wageOfEmployee;
	}

	public void setWageOfEmployee(int wageOfEmployee) {

		WagesOfEmp.wageOfEmployee = wageOfEmployee;
	}

	public static int getSum() {
		return sum;
	}

	public void setSum(int sum) {

		WagesOfEmp.sum = sum;
	}

	public static int getWage() {
		return wage;
	}

	public void setWage(int wage) {

		WagesOfEmp.wage = wage;
	}

	public static int getFullDayHour() {
		return FullDayHour;
	}

	public void setFullDayHour(int fullDayHour) {

		WagesOfEmp.FullDayHour = fullDayHour;
	}

	public static int getPartTimeHour() {
		return PartTimeHour;
	}

	public void setPartTimeHour(int partTimeHour) {

		WagesOfEmp.PartTimeHour = partTimeHour;
	}

	public static void checkpresentorabsent() {

		for (int day = 1; day <= 20; day++) {

			if (workinghour <= 100) {

				/*
				 * Calculate the random number
				 */
				int isPresent = (int) (Math.random() * 3);

				// Switch expression
				switch (isPresent) {
				// Case statements
				case 1:
					System.out.println("Employee is present");
					wage = FullDayHour * wageOfEmployee;
					sum = sum + wage;

					System.out.println("Employee earned " + sum);
					break;

				case 2:
					System.out.println("Employee is partial present");
					wage = PartTimeHour * wageOfEmployee;
					sum = sum + wage;

					System.out.println("Employee earned " + sum);
					break;

				// Default case statement
				default:
					System.out.println("Employee is absent");

				}
			}
		}
	}
}

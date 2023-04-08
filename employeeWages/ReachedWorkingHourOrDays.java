package employeeWages;

public class ReachedWorkingHourOrDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Declaring a variable for switch expression
		 * Calculate the random number.
		 * Declaring a variable for switch expression Switch expression.
		 * Switch expression
		 */

		// Declaring a variable for switch expression
		int wageOfEmployee = 20;
		int sum = 0;
		int wage = 0;
		int FullDayHour = 8;
		int PartTimeHour = 8;

		for (int day = 1; day <= 20; day++) {
			for (int workinghour = 0; workinghour <= 100; workinghour++) {

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

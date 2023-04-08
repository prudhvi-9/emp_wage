package employeeWages;

public class SwitchCase {

	public static void main(String[] args) {
		/*
		 * 1)Calculate the random number 
		 * 2)Declaring a variable for switch expression
		 * 3)Switch expression
		 */

		// Declaring a variable for switch expression
		int wageOfEmployee = 20;
		int sum = 0;
		int FullDayHour = 8;
		int PartTimeHour = 8;

		/*
		 * Calculate the random number
		 */
		int isPresent = (int) (Math.random() * 3);

		/**
		 * 3) Switch expression
		 */
		switch (isPresent) {
		// Case statements
		case 1:
			System.out.println("Employee is present");
			wageOfEmployee = FullDayHour * wageOfEmployee;
			sum = wageOfEmployee;
			System.out.println("Employee earned " + sum);
			break;

		case 2:
			System.out.println("Employee is partial present");
			wageOfEmployee = PartTimeHour * wageOfEmployee;
			sum = sum + wageOfEmployee;
			System.out.println("Employee earned " + sum);
			break;

		// Default case statement
		default:
			System.out.println("Employee is absent");

		}
	}

}

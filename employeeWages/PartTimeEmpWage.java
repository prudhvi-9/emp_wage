package employeeWages;

public class PartTimeEmpWage {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Calculate the random number 
		 * Calculate the wage of employee 
		 * 
		 */

		int wageOfEmployee = 20;
		int sum = 0;
		int FullDayHour = 8;
		int PartTimeHour = 8;
		int wage = 0;

		/*
		 * 1)Calculate the random number
		 */
		int isPresent = (int) (Math.random() * 3);

		/*
		 * 2)Calculate the wage of employee if employee is present
		 */
		if (isPresent >= 2) {
			System.out.println("Employee is present");

			wage = FullDayHour * wageOfEmployee;
			sum += wage;
		}

		/*
		 * 3) Calculate the wage of employee if employee is partially present
		 */
		else if (isPresent >= 1 && isPresent < 2) {
			System.out.println("Employee is partial present");
			wage = PartTimeHour * wageOfEmployee;
			sum += wage;

		}

		/*
		 * 4)Print if employee is absent
		 */
		else {
			System.out.println("Employee is absent");
		}
		System.out.println("Employee earned " + sum);
	}

}

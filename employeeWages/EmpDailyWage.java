package employeeWages;

public class EmpDailyWage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int wageOfEmployee = 20;
		int sum = 0;
		int FullDayHour = 8;
		int wage = 0;

		/*
		 * Calculate the random number
		 */
		double isPresent = Math.random() * 3;

		/*
		 * Calculate the wage of employee if employee is present
		 */
		if (isPresent >= 1) {
			System.out.println("Employee is present");
			wage = FullDayHour * wageOfEmployee;
			sum += wage;
		}
		/*
		 * Print if employee is absent
		 */
		else {
			System.out.println("Employee is absent");
		}
		System.out.println("Employee earned " + sum);
	}
}

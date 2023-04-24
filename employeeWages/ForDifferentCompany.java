package employeeWages;

import java.util.Scanner;

public class ForDifferentCompany extends Company {
	/**
	 * This method is created to calculate employee wages using OOPs concept.
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Taking user input from user.
		 */
		Scanner cs = new Scanner(System.in);

		Company ForDifferentCompany = new Company();

		System.out.println("Enter Company Name:");
		companyName = cs.nextLine();
		setCompanyName(companyName);

		System.out.println("Enter wageOfEmployee:");
		wageOfEmployee = cs.nextInt();
		setWageOfEmployee(wageOfEmployee);

		System.out.println("Enter fullDayHour:");
		fullDayHour = cs.nextInt();
		setFullDayHour(fullDayHour);

		System.out.println("Enter partTimeHour:");
		partTimeHour = cs.nextInt();
		setPartTimeHour(partTimeHour);

		/**
		 * Calculating daily wages of employee.
		 * 
		 */
		ForDifferentCompany.random();
		ForDifferentCompany.calculatingWages();
		
		
		/**
		 * Printing the data.
		 */
		System.out.println(ForDifferentCompany.toString());
		cs.close();

	}
}

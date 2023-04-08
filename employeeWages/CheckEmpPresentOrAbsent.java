package employeeWages;

public class CheckEmpPresentOrAbsent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * This method is created to Check Employee is Present or Absent
		 * 
		 * @param args
		 */

		/*
		 * 1) Check whether employee is present or absent
		 */

		double isPresent = Math.random() * 3;
		if (isPresent >= 1) {
			System.out.println("Employee is present");
		}

		else {
			System.out.println("Employee is absent");

		}

	}

}

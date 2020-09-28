package employeeWageComputation;

import java.util.Random;

public class EmployeeWageComputation {
	private static final int wage_per_hour = 20;
	private static final int full_hours = 8;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to employee wage computation programme");
		Random random = new Random();
		int is_present = (int) random.nextInt(2);
		if(is_present==0)
			System.out.println("Employee Absent");
		else
			System.out.println("Employee Present");
		int daily_wage=wage_per_hour*full_hours*is_present;
		System.out.println("Daily wage is "+daily_wage);
	}

}

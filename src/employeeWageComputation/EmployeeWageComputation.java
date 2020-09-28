package employeeWageComputation;

import java.util.Random;

public class EmployeeWageComputation {
	private static final int wage_per_hour = 20;
	private static final int full_hours = 8;
	private static final int part_hours = 8;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to employee wage computation programme");
		int daily_wage=0;
		Random random = new Random();
		int is_present = (int) random.nextInt(3);
		if(is_present==0) {
			System.out.println("Employee Absent");
			daily_wage=wage_per_hour*0;
		}
		else if(is_present==1) {
			System.out.println("Part Time");
			daily_wage=wage_per_hour*part_hours;
		}
		else {
			System.out.println("Full time");
			daily_wage=wage_per_hour*full_hours;
		}
		System.out.println("Daily wage is "+daily_wage);
	}

}

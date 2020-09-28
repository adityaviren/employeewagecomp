package employeeWageComputation;

import java.util.Random;

public class EmployeeWageComputation {
	private static final int wage_per_hour = 20;
	private static final int full_hours = 8;
	private static final int part_hours = 8;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to employee wage computation programme");
		int daily_wage = 0, no_of_days = 1,monthly_salary=0, no_of_hours=0;
		while (no_of_days < 21 && no_of_hours<100) {
			Random random = new Random();
			int is_present = (int) random.nextInt(3);
			switch (is_present) {
			case 0:
				System.out.println("Employee Absent");
				daily_wage = wage_per_hour * 0;
				no_of_hours+=0;
				break;
			case 1:
				System.out.println("Part Time");
				daily_wage = wage_per_hour * part_hours;
				no_of_hours+=part_hours;
				break;
			case 2:
				System.out.println("Full time");
				daily_wage = wage_per_hour * full_hours;
				no_of_hours+=full_hours;
				break;
			}
			System.out.println("Daily wage is " + daily_wage);
			monthly_salary+=daily_wage;
			no_of_days++;
		}
		System.out.println("Monthly Salary is "+monthly_salary+" for "+(no_of_days-1)+" days.");
	}

}

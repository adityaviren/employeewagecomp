package employeeWageComputation;

import java.util.Random;
import java.util.Scanner;

public class EmployeeWageComputation {
	private int wage_per_hour;
	private String company_name;
	private int max_no_of_hours;
	private int max_no_of_days;

	private static final int full_hours = 8;
	private static final int part_hours = 8;

	public EmployeeWageComputation(String company_name, int wage_per_hour, int max_no_of_hours, int max_no_of_days) {
		this.company_name = company_name;
		this.wage_per_hour = wage_per_hour;
		this.max_no_of_hours = max_no_of_hours;
		this.max_no_of_days = max_no_of_days;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to employee wage computation programme");
			EmployeeWageComputation Dmart = new EmployeeWageComputation("DMart", 100, 100, 20);
			EmployeeWageComputation Reliance = new EmployeeWageComputation("Reliance", 90, 120, 24);
			System.out.println("For DMart ");
			wageBuilder(Dmart.max_no_of_days,Dmart.wage_per_hour,Dmart.max_no_of_hours);
			System.out.println("For Reliance ");
			wageBuilder(Reliance.max_no_of_days,Reliance.wage_per_hour,Reliance.max_no_of_hours);
			
	}

	private static int employeeHours() {
		int emp_hours = 0;
		Random random = new Random();
		int is_present = (int) random.nextInt(3);
		switch (is_present) {
		case 0:
			System.out.println("Employee Absent");
			emp_hours = 0;
			break;
		case 1:
			System.out.println("Part Time");
			emp_hours = part_hours;
			break;
		case 2:
			System.out.println("Full time");
			emp_hours = full_hours;
			break;
		}
		return emp_hours;
	}
	private static void wageBuilder(int Max_no_of_days, int wage_per_hour, int max_hours) {
		int daily_wage, no_of_days = 0, monthly_salary = 0, no_of_hours, total_hours = 0;
		while (no_of_days < Max_no_of_days && total_hours < max_hours) {
			no_of_hours = employeeHours();
			total_hours += no_of_hours;
			daily_wage = no_of_hours * wage_per_hour;
			System.out.println("Daily wage is " + daily_wage);
			monthly_salary += daily_wage;
			no_of_days++;
		}
		System.out.println("Monthly Salary for is " + monthly_salary + " for "
				+ no_of_days + " days.");
	}

}

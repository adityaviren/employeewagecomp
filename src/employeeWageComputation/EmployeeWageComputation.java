package employeeWageComputation;

import java.util.Random;
import java.util.Scanner;

public class EmployeeWageComputation {
	private final int wage_per_hour;
	private final String company_name;
	private final int max_no_of_hours;
	private final int max_no_of_days;

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
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to employee wage computation programme");
		for(int i=0;i<2;i++){
			System.out.println("Enter company name");
			String name=sc.nextLine();
			System.out.println("Enter wage per hour");
			int wage_per_hour=Integer.parseInt(sc.nextLine());
			System.out.println("Enter maximum number of hours");
			int max_hours=Integer.parseInt(sc.nextLine());
			System.out.println("Enter maximum number of days");
			int max_days=Integer.parseInt(sc.nextLine());
			EmployeeWageComputation company = new EmployeeWageComputation(name,wage_per_hour,max_hours,max_days);
			int daily_wage, no_of_days = 0, monthly_salary = 0, no_of_hours ,total_hours=0;
			while (no_of_days < company.max_no_of_days && total_hours < company.max_no_of_hours) {
			no_of_hours = employeeHours();
			total_hours+=no_of_hours;
			daily_wage = no_of_hours * company.wage_per_hour;
			System.out.println("Daily wage is " + daily_wage);
			monthly_salary += daily_wage;
			no_of_days++;
		}
		System.out.println("Monthly Salary for "+company.company_name+" is " + monthly_salary + " for " + no_of_days + " days.");
		}
		sc.close();
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

}

package employeeWageComputation;

import java.util.*;

public class EmployeeWageComputation implements employeeWageManager{

	private static final int full_hours = 8;
	private static final int part_hours = 4;

	ArrayList<CompanyEmpWage> Company_emp_wage = new ArrayList<CompanyEmpWage>();
	
	public void addCompanyEmpWage(String name,int wage, int max_hours,int max_days) {
		CompanyEmpWage cew = new CompanyEmpWage(name,wage,max_hours,max_days);
		Company_emp_wage.add(cew);
	}
	
	public void computeCompanyEmpWage() {
		for(CompanyEmpWage c : Company_emp_wage) {
			c.setTotalWage(wageBuilder(c));
			System.out.println(c);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to employee wage computation programme");
		EmployeeWageComputation ewc= new EmployeeWageComputation();
			ewc.addCompanyEmpWage("DMart", 100, 100, 20);
			ewc.addCompanyEmpWage("Reliance", 90, 120, 24);
			ewc.computeCompanyEmpWage();
			
	}

	private static int employeeHours() {
		int emp_hours = 0;
		Random random = new Random();
		int is_present = (int) random.nextInt(3);
		switch (is_present) {
		case 0:
			emp_hours = 0;
			break;
		case 1:
			emp_hours = part_hours;
			break;
		case 2:
			emp_hours = full_hours;
			break;
		}
		return emp_hours;
	}
	private static int wageBuilder(CompanyEmpWage company_emp_wage) {
		int daily_wage, no_of_days = 0, monthly_salary = 0, no_of_hours, total_hours = 0;
		while (no_of_days < company_emp_wage.max_no_of_days && total_hours < company_emp_wage.max_no_of_hours) {
			no_of_hours = employeeHours();
			total_hours += no_of_hours;
			daily_wage = no_of_hours * company_emp_wage.wage_per_hour;
			monthly_salary += daily_wage;
			no_of_days++;
		}
		return monthly_salary;
	}

}
class CompanyEmpWage {
	public final String company_name;
	public final int max_no_of_hours,max_no_of_days,wage_per_hour;
	private int total_wage;
	String daily_wage;
	int no_of_hours_in_day=8;
	
	CompanyEmpWage(String company_name, int wage_per_hour, int max_no_of_hours, int max_no_of_days) {
		this.company_name = company_name;
		this.wage_per_hour = wage_per_hour;
		this.max_no_of_hours = max_no_of_hours;
		this.max_no_of_days = max_no_of_days;
		daily_wage=Integer.toString(wage_per_hour*no_of_hours_in_day);
	}
	
	public void setTotalWage(int total_wage) {
		this.total_wage=total_wage;
	}
	
	public Map<Integer,String> getWageMap() {
		Map<Integer, String> map = new HashMap<Integer,String>();
		map.put(total_wage,daily_wage);
		return map;
	}
	
	@Override
	public String toString() {
		return "The daily wage for company " + company_name + " is " + getWageMap();
	}
}


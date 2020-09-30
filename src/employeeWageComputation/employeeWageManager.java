package employeeWageComputation;

public interface employeeWageManager {
	public void addCompanyEmpWage(String name,int wage, int max_hours,int max_days);
	public void computeCompanyEmpWage();
	
}
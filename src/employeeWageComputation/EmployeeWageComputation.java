package employeeWageComputation;

import java.util.Random;

public class EmployeeWageComputation {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to employee wage computation programme");
		Random random = new Random();
		int is_present = (int) random.nextInt(2);
		if(is_present==0)
			System.out.println("Employee Absent");
		else
			System.out.println("Employee Present");
	}

}

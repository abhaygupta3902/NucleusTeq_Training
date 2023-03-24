package week4EmployeeManagementSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class Main {
	
	//public static String filename = "D:\\softwares\\eclipse\\workspace\\NucleusTeqTraining\\src\\week4EmployeeManagementSystem\\employee.txt";
	
	//employee services method 
	public void services()
	{
		EmployeeServices obj = new EmployeeServices();
		Scanner sc = new Scanner(System.in);
		boolean itr =true;
		while(itr ==true)
		{
			System.out.println("\nEnter following choices to use a service:");
			System.out.println("Enter 1 to create new file");
			System.out.println("Enter 2 to add employee details");
			System.out.println("Enter 3 to read employee by search key");
			System.out.println("Enter 4 to read all employees");
			System.out.println("Enter 5 to update employee:");
			System.out.println("Enter 6 to delete employee:");
			System.out.println("Enter 0 to exit:");
			int choice = sc.nextInt();
			switch(choice)
			{
				case 0:
					itr =false;
					System.out.println("Thanyou for using our service!");
					break;
				case 1:
					obj.createNewFile();
					break;
				case 2:
					obj.addEmployee(sc);
					break;
				case 3:
					obj.getEmployee(sc);
					break;
				case 4:
					obj.getAllEmployee();
					break;
				case 5:
					obj.updateEmployee(new ArrayList<HashMap<String,String>>(), sc);
					break;
				case 6:
					obj.deleteEmployeeById(new ArrayList<HashMap<String,String>>(), sc);
					break;
				default:
					System.out.println("invalid input");
			}
		}
		
	}
	
	
	// -------main method -------
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Main().services(); 
	}

}

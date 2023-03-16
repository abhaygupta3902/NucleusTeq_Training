package week4EmployeeManagementSystem;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	public static String filename = "D:\\softwares\\eclipse\\workspace\\NucleusTeqTraining\\src\\week4EmployeeManagementSystem\\employee.txt";
	
	public static void services()
	{
		Scanner sc = new Scanner(System.in);
		boolean itr =true;
		while(itr ==true)
		{
			System.out.println("\nEnter following choices to use a service:");
			System.out.println("Enter 1 to add employee details");
			System.out.println("Enter 2 to read employee details");
			System.out.println("Enter following choices to use a service:");
			System.out.println("Enter following choices to use a service:");
			System.out.println("Enter following choices to use a service:");
			System.out.println("Enter 0 to exit:");
			int choice = sc.nextInt();
			switch(choice)
			{
				case 1:
					addEmployee(sc);
					break;
				case 0:
					itr =false;
					System.out.println("Thanyou for using our service!");
					break;
				case 2:
					getEmployee(sc);
					break;
				default:
					System.out.println("invalid input");
			}
		}
		
	}
	
	public static void addEmployee(Scanner sc)
	{
		int id;
		String name;
		String address;
		String  phoneNo;
		 
		System.out.println("Enter details of an employee");
		System.out.println("Enter id:");
		id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter name:");
		name = sc.nextLine();
		System.out.println("Enter Address:");
		address = sc.nextLine();
		//sc.nextLine();
		System.out.println("Enter Phone:");
		phoneNo = sc.nextLine();
		
		Employee eObj = new Employee(id,name,address,phoneNo);
		
		try {
			FileWriter fw = new FileWriter(filename ,true);
			fw.append(eObj.toString());
			fw.append("\n");
			fw.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	public static void getEmployee(Scanner sc)
	{
		try {
			BufferedReader reader = new BufferedReader(new FileReader(filename));
			System.out.println("Enter the employee id:");
			sc.nextLine();
			String searchId = sc.nextLine();
			String line;
			
			while((line = reader.readLine())!=null)
			{
				if(line.contains(searchId))
				{
					System.out.println("Employee details :"+line);
				}
			}
			reader.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		services(); 
	}

}

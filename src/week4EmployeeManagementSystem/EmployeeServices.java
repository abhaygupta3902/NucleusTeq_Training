package week4EmployeeManagementSystem;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EmployeeServices {
	
	private static String filename = "D:\\softwares\\eclipse\\workspace\\NucleusTeqTraining\\src\\week4EmployeeManagementSystem\\employee.txt";

	
	public void createNewFile()
	{
		File empFile = new File(filename);
		
		try {
			if(empFile.createNewFile()==true)
			{
				FileWriter fw = new FileWriter(filename ,true);
				
				fw.append("Job_id,"+"Name,"+"Address,"+"Salary,"+"Post,"+"PhoneNo\n");
				
				fw.close();
				System.out.println("New File Created");
			}
			else
			{
				System.out.println("File already exists");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void addEmployee(Scanner sc)
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
		System.out.println("Enter Salary:");
		double salary = sc.nextDouble();
		System.out.println("Enter post:");
		sc.nextLine();
		String post = sc.nextLine();
		System.out.println("Enter Phone:");
		phoneNo = sc.nextLine();
		
		Employee eObj = new Employee(id,name,address,salary,post,phoneNo);
		
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
	
	public void getEmployee(Scanner sc)
	{
		try {
			BufferedReader reader = new BufferedReader(new FileReader(filename));
			System.out.println("Enter the search key:");
			sc.nextLine();
			String searchKey = sc.nextLine();
			String line;
			boolean empfound = false;
			
			while((line = reader.readLine())!=null)
			{
			
				if(line.contains(searchKey))
				{
					empfound = true;
					System.out.println("Employee details :"+line);
				}
			}
			
			if(empfound == false)
			{
				System.out.println("Employee not found");
			}
			reader.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void getAllEmployee()
	{
		try {
			BufferedReader reader = new BufferedReader(new FileReader(filename));
			
			String line;
			while((line = reader.readLine()) !=null)
			{
				System.out.println(line);
			}
			
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

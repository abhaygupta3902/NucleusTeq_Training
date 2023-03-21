package week4EmployeeManagementSystem;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeServices {
	
	private static String filename = "D:\\softwares\\eclipse\\workspace\\NucleusTeqTraining\\src\\week4EmployeeManagementSystem\\employee.txt";
	
	
	public static int generateId() //method for generating job id
	{
		int count=0;
		try {
			BufferedReader reader = new BufferedReader(new FileReader(filename));
			
			//String line;
			while(reader.readLine()!=null)
			{
				count++;
			}
			
			reader.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
	}
	
	public void createNewFile()//method to create a new file
	{
		File empFile = new File(filename);
		
		try {
			if(empFile.createNewFile()==true)//if file exist emplFile.createNewFile() will return false 
			{
				FileWriter fw = new FileWriter(filename ,true);
				
				fw.append("Job_id,"+"Name,"+"Address,"+"Salary,"+"Post,"+"PhoneNo\n");//appending data to file
				
				fw.close();//closing the file
				
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
		//System.out.println("Enter id:");
		id = generateId();
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
	public void getEmployeeById(ArrayList <String> arrayList,Scanner sc)
	{
		try {
			BufferedReader reader = new BufferedReader(new FileReader(filename));
			System.out.println("Enter job id");
			int id = sc.nextInt();
			String line;
			while((line=reader.readLine())!=null)
			{
				arrayList.add(line);
			}
			try
			{
				System.out.println(arrayList.get(id));
			}
			catch(IndexOutOfBoundsException e)
			{
				System.out.println("Please enter a valid Job id");
			}
			
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void updateEmployee(ArrayList <String> arrayList,Scanner sc)
	{
		try
		{
			BufferedReader reader = new BufferedReader(new FileReader(filename));
			System.out.println("Enter job id");
			int id = sc.nextInt();
			String line;
			while((line=reader.readLine())!=null)
			{
				arrayList.add(line);
			}
			
			line =arrayList.get(id);
			sc.nextLine();
			System.out.println("Enter the text you want to change from this");
			System.out.println(line);
			String oldValue = sc.nextLine();
			System.out.println("Enter the new value");
			String newValue = sc.nextLine();
			
			arrayList.set(id, line.replace(oldValue, newValue));
			System.out.println("Employee data updated");
			reader.close();
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println("Please enter valid Job id");
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		
		try {
			FileWriter fw = new FileWriter(filename);
			for(int i=0;i<arrayList.size();i++)
			{
				fw.append(arrayList.get(i));
				fw.append("\n");
			}
			
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void deleteEmployeeById(ArrayList <String> arrayList , Scanner sc)
	{
		try {
			BufferedReader reader = new BufferedReader(new FileReader(filename));
			System.out.println("Enter job id");
			int id = sc.nextInt();
			String line;
			while((line=reader.readLine())!=null)
			{
				arrayList.add(line);
			}
			System.out.println("Deleted Employee:"+arrayList.get(id));
			arrayList.set(id, null);
			
			
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println("Pleasde enter valid job id");
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			FileWriter fw = new FileWriter(filename);
			for(int i=0;i<arrayList.size();i++)
			{
				fw.append(arrayList.get(i));
				fw.append("\n");
			}
			
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
	
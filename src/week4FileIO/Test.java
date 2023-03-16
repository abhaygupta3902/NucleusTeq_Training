package week4FileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

class Employee
{
	
	int id;
	String name;
	String address;
	long phoneNo;
	
	public Employee(int id ,String name , String address , long phoneNo)
	{
		this.id = id;
		this.name = name;
		this.address = address;
		this.phoneNo = phoneNo;
	}
	
	public String toString()
	{
		return "["+this.id+","+this.name+","+this.address+","+this.phoneNo;
	}
}

public class Test {

	public static String filename = "D:\\\\softwares\\\\eclipse\\\\workspace\\\\NucleusTeqTraining\\\\src\\\\week4FileIO\\\\text.txt";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e = new Employee(100 ,"Abhay","Basant Bihar",123456);
		
		//File f = new File(filename);
		System.out.println(e);
		
		try {
			FileWriter fw = new FileWriter(filename ,true);
			fw.append(e.toString());
			
			fw.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

}

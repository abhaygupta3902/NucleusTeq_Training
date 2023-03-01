package week1;
import java.util.Scanner;

public class MultiplicationTable {
	
	void printMultiplicationTable(int num)//Logic to print the multiplication table
	{
		for(int i=1;i<=10;i++)//using for loop to print multiplication table
		{ 
			System.out.println(num+"*"+i+"="+num*i);//ptinting multiplication table
		}
	}
	

	public static void main(String[] args)
	{
	 	Scanner sc= new Scanner(System.in);//creating scanner class object to take input from user 
		System.out.println("Enter the number");
		int num =sc.nextInt();//taking an input
		
		MultiplicationTable obj = new MultiplicationTable();//declaring MultiplicationTable class object
		obj.printMultiplicationTable(num);//calling the method to print multiplication table
	}
}

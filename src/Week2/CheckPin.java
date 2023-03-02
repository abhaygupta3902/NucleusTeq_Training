package Week2;

import java.util.Scanner;

//Program to check valid input pin 

public class CheckPin {
	
	int count = 0;
	
	public int checkInputPin(int pin)
	{
		while(pin!=0)
		{
			pin=pin/10;
			count++;
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the pin Number:");
		
		CheckPin obj = new CheckPin();
		
		if(obj.checkInputPin(sc.nextInt())==6)
		{
			System.out.println("The input pin is valid ");
		}
		else
		{
			System.out.println("input pin is not valid");
		}
	}

}

package Week2;

import java.util.Scanner;

//Program to calculate highest of three numbers 

public class MaxNumber {

	public int getMaxNumber(int num1 ,int num2, int num3)
	{
		if(num1>num2)
		{
			if(num1>num3)
				return num1;
			else
				return num3;
		}
		else
		{
			if(num2>num3)
				return num2;
			else
				return num3;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		MaxNumber obj = new MaxNumber();
		System.out.println("Enter the 3 Numbers");
		System.out.println("the maximum number is:"+obj.getMaxNumber(sc.nextInt(), sc.nextInt(), sc.nextInt()));
	}

}

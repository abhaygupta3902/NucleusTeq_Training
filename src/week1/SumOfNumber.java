package week1;
import java.util.Scanner;

public class SumOfNumber {
	
	int sum=0;
	
	int calculateSumOfNumbers(int num)//logic to calculate sum of n number
	{
		
		do		
		{
			sum+=num;		
		}
		while(num--!=0);
		
		return sum;	
	}
	
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Number");
		int num= sc.nextInt();
		
		SumOfNumber obj = new SumOfNumber();
		int result = obj.calculateSumOfNumbers(num);
		System.out.println("Sum of "+ num+ " Number is "+ result );
	}
}

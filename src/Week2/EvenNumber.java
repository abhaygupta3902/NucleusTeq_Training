//Program to Calculate list of even Numbers in  an array

package Week2;
import java.util.Scanner;

public class EvenNumber {
	
	boolean isEven(int num)//logic to check number is even or not
	{
		if(num%2==0)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args)
	{
		EvenNumber obj = new EvenNumber();
		 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of the array");
		int size = sc.nextInt();

		int arr[] = new int[size];
		System.out.println("Enter the elements of array");

		for(int i=0;i<size;i++)//taking input
		{
			arr[i]=sc.nextInt();
		}

		System.out.println("List of Even Numbers");
		
		for(int i=0;i<size;i++)
		{
			if(obj.isEven(arr[i]))
			System.out.print(arr[i]+" ");
		}
	}
}

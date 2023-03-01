package Week2;

//Program to left shift the array
import java.util.Scanner;

class RotateList
{
	void shiftList(int arr[],int n,int r)
	{
		System.out.println("Array after performing "+r+" shifts:");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[(i+r)%n]+" ");
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		System.out.println("Enter the elements of the array:");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the value of shift:");
		int r=sc.nextInt();

		RotateList obj = new RotateList();
		obj.shiftList(arr,size,r);
	}
}

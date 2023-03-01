package Week2;

//this is the program to partition the array in two parts where elements that are less than the value of x will be at left subarray and values greater than x will be at right subarray

import java.util.Scanner;

public class PartitionArray
{
	void partitionArray(int arr[],int x,int n) //method to partition the array
	{
		int i=0,j=n-1;//the variable i will point to the first index of the array where as variable j will point to the last index of the array
		while(i<j)//this loop will iterate till i is less than j
		{
			while(arr[i]<=x) //if the value at index i is less than or equals to the value of x than i will get incremented and point to next index  
				i++;

			while(arr[j]>x)//if the value at index j is greater than the value of x than j will get decremented
				j--;
			if(i>j)    // if value of i becomes greater than j than the loop will break
				break;
			
			swap(arr ,i ,j);//this will swap the values at index i and j
			
			i++;	//incrementing value of i by 1
			j--;	//decrementing value of j by 1
		}	
	}
	
	void swap(int arr[] ,int i,int j)//method declaration to swap the elements
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size = sc.nextInt();//size of the array
		
		int arr[]= new int [size];//array declaration
		System.out.println("Enter the elements of the array:");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();//taking input for the array
		}
		
		System.out.println("Enter the Partition value:");
		int x = sc.nextInt(); //taking input for the partition value

		PartitionArray obj = new PartitionArray();//creatinf object of the PartitionArray class
		obj.partitionArray(arr,x,size);//calling the partiionArray method with arguments arr,size and x(partition value)
		
		System.out.println("Array after partition:");
		for(int i=0;i<size;i++)
			System.out.print(arr[i]+" ");
	}
}

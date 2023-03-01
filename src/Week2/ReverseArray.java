package Week2;

//Program to reverse array in groups

import java.util.Scanner;


class ReverseArray
{
	void reverseArrayInGroup(int arr[] , int n,int k) // method to reverse the array in groups
	{
		int temp=0; //here we have taken a temporary variable 
		while(temp<n) // this loop will iterate until variable temp is less than variable n
		{
			//the variable i and j will divide the array in groups by the difference of k and reverse the elements by swapping the elements of index i and j
			int i=temp; 
			int j=temp+(k-1);

			while(i<j)	//this inner loop will iterate until i is less than j
			{
				//code to perform swapping 	
				int t=arr[i];
				arr[i]=arr[j];
				arr[j]=t;
				
				i++;//incrementing value of i by 1
				j--;//decrementing value of j by 1
			}
			temp+=k; // incrementing value of temp by k
		}
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size = sc.nextInt();
		
		System.out.println("Enter the elements of the array:");
		int arr[] = new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the value of k:"); //k is the value to reverse the array in groups
		int k= sc.nextInt();
		
		ReverseArray obj = new ReverseArray();
		obj.reverseArrayInGroup(arr ,size , k);
		
		System.out.println("Array after reversing in  groups:");
		for(int i=0;i<size;i++)
			System.out.print(arr[i]+" ");
	}	
}


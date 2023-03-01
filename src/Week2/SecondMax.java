package Week2;

import java.util.Scanner;

class SecondMax
{
	
	int findSecondMax(int arr[],int n)
	{
		int max=0,smax=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]>max)
			{
				smax=max;
				max=arr[i];
			}
			else if(arr[i]>smax)
			{
				smax=arr[i];
			}
		}
		return smax;
	}

	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter size of the array:");
		int size=sc.nextInt();
		
		int arr[]=new int [size];
		
		
		System.out.println("Enter the elements of array:");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		
		SecondMax obj = new SecondMax();
		int ans = obj.findSecondMax(arr,size);
		
		System.out.println("The second max element is:"+ans);
	}
}
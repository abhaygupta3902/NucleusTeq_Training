package week6Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task1ArrayList {

	static boolean checkUnique(ArrayList<Integer> arrayList ,Integer data)
	{
		if(arrayList.contains(data))
		{
			return false;
		}
		else
		{
			return true;
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int t;
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		System.out.println("Enter Number of data to insert");
		Scanner sc = new Scanner(System.in);
		t =sc.nextInt();
		while(t--!=0)
		{
			System.out.println("Enter integer data");
			Integer input =  sc.nextInt();
			/*if(arrayList.isEmpty())
			{
				arrayList.add(input);
			}*/
			if(checkUnique(arrayList,input))
			{
				arrayList.add(input);
			}
			else
			{
				//System.out.println("data already exists");
			}
		}
		
		System.out.println(arrayList);
	}

}

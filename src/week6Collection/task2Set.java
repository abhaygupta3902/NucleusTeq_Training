package week6Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class task2Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,1,2,3,3,3,3};
		
		//ArrayList<Integer> arr = new ArrayList<Integer>();
		Set <Integer> set = new HashSet<Integer>();
		
		for(int i:arr)
		{
			set.add(arr[i]);
		}
		
		System.out.println(set);
		
		if(set.contains(1))
		{
			System.out.println("Elemnet found");
		}
		else
		{
			System.out.println("Element not found");
		}
	}

}

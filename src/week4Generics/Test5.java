package week4Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Program to demonstrate Unbounded Wildcard
public class Test5 {
	
	
	public static void printList(List<?> list)
	{
		for(Object element : list)
			System.out.print(element+" ");
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Integer> li = Arrays.asList(1,2,3,4,5);
		List <Object> lo = Arrays.asList(1,"Hello","Bye",100.0);
		List <String> ls = Arrays.asList("Hello","Everyone","bye");
		
		printList(li);
		printList(lo);
		printList(ls);
	}

}

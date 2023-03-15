package week4Generics;

import java.util.Arrays;
import java.util.List;

//program to show upper bound Wildcard
//Wildcards are used when we dont know the type

public class Test4  {

	public static double sumOfList(List <? extends Number> list) //the argumnet list will accept the sub classes of Number . If we omit the '? extedns Number ' and only write Number so it will only allow Number type not its subtypes 
	{
		double s = 0.0;
		
		for(Number n :list)
		{
			s+=n.doubleValue();
		}
		return s;
	}

	public static void main(String[] args) {
		
		List <Integer> li= Arrays.asList(1,2,3);
		System.out.println("sum of Integer list is "+sumOfList(li));
		
		List <Double> ld = Arrays.asList(1.2,2.3,3.4);
		System.out.println("sum of Double list is "+sumOfList(ld));
	}

}

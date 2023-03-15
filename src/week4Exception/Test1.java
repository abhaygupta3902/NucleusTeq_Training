package week4Exception;

//program to implement exception handling

public class Test1 {
	
	
	
	public static void divideNumber(int n,int d)
	{
		int result = 0;
		try {
			result = n/d;
		}
		catch(ArithmeticException  e)
		{
			System.out.println("The number can not be divided as the denominator is zero");
		}
		
		System.out.println("The result of division is "+result);
	}
	
	public static void convertStringToInt(String s)
	{
		Integer no =null;
		try
		{
		 no = Integer.parseInt(s);
		}
		catch(NumberFormatException e)
		{
			System.out.println("The input string is not a number");
		}
		System.out.println("the converted integer is "+no);
		
		try
		{
			int result = no*5;//this will give Null pointer exception
		}
		catch(NullPointerException e)
		{
			System.out.println("Number is null");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//divideNumber(5,0);//divide by zero exception
		
		//convertStringToInt("100");
		convertStringToInt("Hello");//this will give NumberFormatException
		
		try
		{
			System.out.println(args[0]);//this will give array index out of bound exception
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array index is out of bound");
		}
		
	}

}

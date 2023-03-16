package week4Exception;

import java.io.IOException;

//program to show use of throws keyword


public class Test3 {
	
	
	public void method() throws IOException //throws keyword is used to declare checked exception
	{
		throw new IOException("Input /output error"); //throwing checked exception
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test3 obj = new Test3();
		
		try
		{
			obj.method();
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage()); //printing the message of exception object
		}
		
		System.out.println("Normal flow of program ");
		
	}

}

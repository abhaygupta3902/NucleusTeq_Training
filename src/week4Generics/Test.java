package week4Generics;
//program to show generics

public class Test <T>{//Generic class
	
	T data; 
	
	public Test(T data) //constructor it will accept any type of object
	{
		this.data = data;
	}
	
	public T getData() //method of generic type  to get the data 
	{
		return this.data;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test <String> strObj = new Test<String>("Hello Everyone");//Creating Test object and passing string object as argument
		
		Test <Integer> intObj = new Test<Integer>(100);//Creating Test Object and Passing Integer object as an argument
		
		System.out.println(strObj.getData()); //calling getData method of String type
		
		System.out.println(intObj.getData()); //calling getData method of Integer type
	}

}

package week4Generics;

//program to demonstrate generic function

public class Test3 {
	
	
	< T > void genericMethod(T data)
	{
		System.out.println(data.getClass().getSimpleName() + " = "+data);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test3 obj = new Test3();
		
		obj.genericMethod("String data");
		obj.genericMethod(100);
		obj.genericMethod(1000.0);
	}

}

package week4Generics;

//we can also have multiple generic types separated by comma

public class Test2 <T ,U>{
	
	T tTypeData;
	U uTypeData;
	
	public Test2(T tTypeData ,U uTypeData) //constructor
	{
		this.tTypeData = tTypeData;
		this.uTypeData = uTypeData;
	}
	
	public T getTtypeData()
	{
		return this.tTypeData;
	}
	
	public U getUtypeDta()
	{
		return this.uTypeData;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test2 <String ,Integer> obj = new Test2 <String ,Integer>("Hello",100); //creating test2 object with argument string object and integer object
		
		System.out.println(obj.getTtypeData());
		
		System.out.println(obj.getUtypeDta());
		
	}

}

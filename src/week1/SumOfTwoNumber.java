package week1;

public class SumOfTwoNumber {

	public int sumOfTwoNumber(int num1 ,int num2)
	{
		return (num1+num2);//this statement will add num1 and num2 variable and return the value 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfTwoNumber obj = new SumOfTwoNumber();
		int result = obj.sumOfTwoNumber(10, 20);
		System.out.println("Sum of two Number is "+result);
	}

}

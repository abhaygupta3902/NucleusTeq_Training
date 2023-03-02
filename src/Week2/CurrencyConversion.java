package Week2;

//program to covert currency in respective of country value
import java.util.Scanner;

public class CurrencyConversion {
	
	
	public double convertRupeeToDollar(double rupees)
	{
		return rupees*82.47;
	}
	public double convertDollarToRupee(double dollar)
	{
		return dollar/82.47;
	}
	
	//main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CurrencyConversion obj = new CurrencyConversion();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for rupee to dollar conversion");
		System.out.println("Enter 2 for dollar to rupee dollar");
		switch(sc.nextInt())
		{
			case 1:
				System.out.println("Enter the value of rupee:");
				System.out.println("the corresponding dollar value is :"+obj.convertRupeeToDollar(sc.nextDouble()));
				break;
			case 2:
				System.out.println("Enter the value od dollar:");
				System.out.println("the corresponding rupee value is:"+obj.convertDollarToRupee(sc.nextDouble()));
				break;
			default:
				System.out.println("invalid input");
		}
	}

}

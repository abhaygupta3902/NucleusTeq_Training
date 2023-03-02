package Week2;
import java.util.Scanner;

public class Interest {
	
	double si,p,r,t,ci;
	static Scanner sc = new Scanner(System.in);
	
	public Interest(double p,double r,double t)//Interest class constructor
	{
		this.p = p;
		this.r = r;
		this.t = t;
	}
	
	public void simpleInterest()
	{
		si=(p*r*t)/100;
	}
	
	public double getSimpleInterest()
	{
		return si;
	}
	
	public void compoundInterest()
	{
		ci= (p*(Math.pow((1+r/100), t)))-p;
	}
	public double getCompoundInterest()
	{
		return ci;
	}
	
	
	//static methods to get the values of p ,r and t 
	public static double getPrincipal()
	{
		
		System.out.println("Enter Principal amount:");
		double p = sc.nextDouble();
		return p;
	}
	
	public static double getRate()
	{
		System.out.println("Enter rate:");
		double r = sc.nextInt();
		return r;
	}
	
	public static double getTime()
	{
		System.out.println("Enter time:");
		double t = sc.nextInt();
		return t;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Interest obj1 = new Interest(getPrincipal() ,getRate() , getTime());
		obj1.simpleInterest();
		System.out.println("Value of Simple Interest is :"+obj1.getSimpleInterest());
		
		Interest obj2 = new Interest(getPrincipal() ,getRate() , getTime());
		obj2.compoundInterest();
		System.out.println("Value of compound Interest is :"+obj2.getCompoundInterest());
	}

}

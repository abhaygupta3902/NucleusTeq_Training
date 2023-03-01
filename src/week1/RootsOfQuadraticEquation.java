package week1;
import java.util.Scanner;
import java.lang.Math;

public class RootsOfQuadraticEquation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,num;
		double x1,x2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of a , b, c");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		num=((b*b)-(4*a*c));
		double sq=Math.sqrt(num);
		
		x1=((-b)+sq)/2*a;
		x2=((-b)-sq)/2*a;
		System.out.println("The roots are "+x1+","+x2);
	}

}

package week1;
import java.util.Scanner;
public class AreaOfTriangle {
	int base,height;
	float area=0.0f;
	
	AreaOfTriangle(int b, int h)
	{
		base = b;	
		height = h;
	}
	void calArea()
	{
		area=(base*height)/2;	
	}
	float getArea()
	{
		return area;
	}
	public static void main(String[] args)
	{
		
		int b,h;
		System.out.println("Enter the values of base and height :");
		Scanner sc = new Scanner(System.in);
		b = sc.nextInt();
		h = sc.nextInt();
		
		AreaOfTriangle obj = new AreaOfTriangle(b,h);
		obj.calArea();
		System.out.println("the area of a triangle is "+obj.getArea());
	}

}

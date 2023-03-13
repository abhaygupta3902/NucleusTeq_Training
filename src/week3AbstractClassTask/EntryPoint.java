package week3AbstractClassTask;
import java.util.Scanner;
public class EntryPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter 'C' to perform circle operation or 'R' to perform rectangle operation ");
		Scanner sc = new Scanner(System.in);
		String choice = sc.nextLine();
		
		if(choice.equals("C"))
		{
			System.out.println("Enter raius of the circle");
			int r = sc.nextInt();
			
			Circle obj =new Circle(r);
			
			System.out.println("Enter 1 to calculate perimeter of circle:");
			System.out.println("Enter 2 to calculate area of circle:");
			switch(sc.nextInt())
			{
				case 1:
					System.out.println("The perimeter of circle is:"+obj.perimeter());
					break;
				case 2:
					System.out.println("The area of circle is:"+obj.area());
					break;
				default:
					System.out.println("Please enter a valid choice");
					
			}
		}
		else if(choice.equals("R"))
		{
			System.out.println("Enter length of rectangle");
			double length = sc.nextDouble();
			System.out.println("Enter width of rectangle");
			double width = sc.nextDouble();
			
			Rectangle obj = new Rectangle(length ,width);
			
			System.out.println("Enter 1 to calculate perimeter of Rectangle:");
			System.out.println("Enter 2 to calculate area of Rectangle:");
			switch(sc.nextInt())
			{
				case 1:
					System.out.println("The perimeter of Rectangle is:"+obj.perimeter());
					break;
				case 2:
					System.out.println("The area of Rectangle is:"+obj.area());
					break;
				default:
					System.out.println("Please enter a valid choice");
					
			}
		}
		else
		{
			System.out.println("Invalid option");
		}
	}

}

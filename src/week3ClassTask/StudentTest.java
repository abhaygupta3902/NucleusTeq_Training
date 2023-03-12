package week3ClassTask;

import java.util.Scanner;
public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Student Object");
		int t = sc.nextInt();
		sc.nextLine();//this line reads the data left by the sc.nextInt() bcz it only reads int and when user press enter it leaves the '\n' .so sc.nextLine() is necessary to read the '\n' . 
		
		/*If we writing a statement like
		 * int n = sc.nextInt();
		 * sc.nextLine() //reads '/n' or data left by sc.nextInt()
		 * String s = sc.nextLine();
		 * so we have to include a extra sc.nextLine() to store the data left by the nextInt()
		 */
		
		Student s[] = new Student[t];
		
		for(int i=0;i<t;i++)
		{
			System.out.println("Enter the Details of student"+(i+1));
			System.out.println("Name :");
			String name = sc.nextLine();
			System.out.println("Course :");
			String course = sc.nextLine();
			System.out.println("Marks1:");
			int marks1 = sc.nextInt();
			System.out.println("Marks2:");
			int marks2 = sc.nextInt();
			System.out.println("Marks3:");
			int marks3 = sc.nextInt();
			sc.nextLine();//to read the data left by sc.nextInt()
			
			s[i] = new Student(name ,course,marks1,marks2,marks3);
			
		}
		for(int i=0;i<t;i++)
		{
			System.out.println(s[i]);
		}
		
		
		
	}

}

package week1;

public class Pattern1 {

	void printPattern1(int num)
	{
		for(int i=1;i<=num;i++)
		{
			char c='A';
			for(int j=1;j<=i;j++)
			{
				System.out.print(c +" ");
				c++;	
			}
			System.out.println("");
		}
	}

	public static void main(String[] args)
	{
		Pattern1 obj=new Pattern1();
		obj.printPattern1(5);
	}
}

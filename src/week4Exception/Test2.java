package week4Exception;

class VowelException extends Exception
{
	String msg;
	
	public VowelException(String msg)
	{
		this.msg = msg;
	}
	
	public String toString()
	{
		return msg;
	}
}

class ConsonentException extends Exception
{
	String msg;
	
	public ConsonentException(String msg)
	{
		this.msg = msg;
	}
	
	public String toString()
	{
		return msg;
	}
}

public class Test2 {
	
	
	public static void check(char c)
	{
		try
		{
			if(c=='a' || c=='A' || c=='e' || c=='E' || c=='i' || c=='I' || c=='o' || c=='O' || c=='u' || c=='U')
			{
				throw new VowelException("char is vowel");
			}
			else
			{
				throw new ConsonentException("char is consonent");
			}
		}
		catch(VowelException e)
		{
			System.out.println(e);
		}
		catch(ConsonentException e)
		{
			System.out.println(e);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		check('a');
		check('k');
	}

}

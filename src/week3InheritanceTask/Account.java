package week3InheritanceTask;

public class Account {
	
	 
	private String name ,address ,dob,accountNo,phoneNo;
	private double balance;
	private static int seriesNo;
	
	static  //static block to initialize the static variable
	{
		seriesNo = 100 ;
	}
	
	//parameterized constructor to initialize the instance variables
	public Account(String name ,String address ,String dob ,String phoneNo ,double balance)
	{
		this.setName(name);
		this.setAddress(address);
		this.setDob(dob);
		this.setPhoneNo(phoneNo);
		this.setAccountNo();
		this.setBalance(balance);
	}
	
	
	//setter method for account number
	public void setAccountNo()
	{
		this.accountNo = String.valueOf(phoneNo)+String.valueOf(++seriesNo);
	}
	
	//getter method for account number
	public String getAccountNo()
	{
		return this.accountNo;
	}
	
	//setter method for phoneNo
	public void setPhoneNo(String phoneNo)
	{
		this.phoneNo = phoneNo;
	}
	
	//getter method for phone number
	public String getPhoneNo()
	{
		return this.phoneNo;
	}
	
	//setter method for name
	public void setName(String name)
	{
		this.name = name;
	}
	//getter method for name
	public String getName()
	{
		return this.name;
	}
	
	//setter method for address
	public void setAddress(String address)
	{
		this.address = address;
	}
	//getter method for address
	public String getAddress()
	{
		return this.address;
	}
	//setter methid for dob
	public void setDob(String dob)
	{
		this.dob = dob;
	}
	//getter method for dob
	public String getDob()
	{
		return this.dob;
	}
	//setter method for balance
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	//getter method for balance
	public double getBalance()
	{
		return this.balance;
	}
	
	public String toString()
	{
		return "Account details[ AccountNo -"+this.accountNo+"| Name - "+this.name+"| Address - "+this.address +"| Dob - "+this.dob
				+"| PhoneNo - "+this.phoneNo+"| Balance - "+this.balance+"]";
	}
}

package week3InheritanceTask;

public class SavingsAccount extends Account {
	
	private double fixedBalance ;
	public SavingsAccount(String name, String address, String dob, String phoneNo, double balance) {
		super(name, address, dob, phoneNo, balance);
	}
	
	public double deposit(double amount)
	{
		setBalance(getBalance()+amount);
		System.out.println("Amount deposited "+amount);
		return getBalance();
	}
	
	public double withdraw(double amount)
	{
		setBalance(getBalance()-amount);
		System.out.println("amount withdrawn "+amount);
		return getBalance();
	}
	public void fixedDeposit(double amount)
	{
		this.fixedBalance = amount;
		System.out.println("amount added to fixed deposit "+amount);
		//setBalance(getBalance()-amount);
	}
	public double getFixedBalance()
	{
		return this.fixedBalance;
	}

	

}

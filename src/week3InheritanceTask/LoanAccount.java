package week3InheritanceTask;

public class LoanAccount extends Account {
	
	private double loanAmount ;
	
	public LoanAccount(String name, String address, String dob, String phoneNo, double balance) {
		super(name, address, dob, phoneNo, balance);
	}
	
	public void payEMI(double amount)
	{
		this.loanAmount-=amount;
		System.out.println("EMI paid "+amount);
		System.out.println("loan remaining "+this.loanAmount);
	}
	
	public void topUpLoan(double amount)
	{
		this.loanAmount+=amount;
		System.out.println("loan amount granted "+amount);
		System.out.println("Total "+this.loanAmount);
	}
	
	public void repayment(double amount)
	{
		this.loanAmount -= amount;
		System.out.println("loan amount paid "+amount);
		System.out.println("loan remaining "+this.loanAmount);
	}
}

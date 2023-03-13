package week3InheritanceTask;
import java.util.Scanner;

public class EntryPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println("what type of account do you want to create ----->\n Enter 'S or s' for savings account \n Enter 'L or l' for Loan account\n");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the details of the user");
		System.out.println("Name :");
		String name = sc.nextLine();
		System.out.println("Address :");
		String address = sc.nextLine();
		System.out.println("Dob :");
		String dob = sc.nextLine();
		System.out.println("Phone Number :");
		String phoneNo = sc.nextLine();
		System.out.println("Balance :");
		double balance = sc.nextDouble();
		System.out.println("what type of account do you want to create ----->\n Enter 'S or s' for savings account \n Enter 'L or l' for Loan account\n");
		sc.nextLine();
		String accType = sc.nextLine();
		
		if(accType.equals("S") ||accType.equals("s") )
		{
			SavingsAccount obj = new SavingsAccount(name, address, dob, phoneNo, balance);
			
			boolean loop = true;
			while(loop == true)
			{
			
				System.out.println("what service do you want");
				System.out.println("Enter 0 to exit");
				System.out.println("Enter 1 for the Customer details");
				System.out.println("Enter 2 for deposit amount ");
				System.out.println("Enter 3 for withdraw amount");
				System.out.println("Enter 4 for fixed deposit ");
				System.out.println("Enter 5 to see the fixed deposit amount");
				
				switch(sc.nextInt())
				{
					case 0:
						System.out.println("Thankyou for using our service");
						loop = false;
						break;
					case 1:
						System.out.println(obj);
						break;
					case 2:
						System.out.println("Enter amount to deposit");
						System.out.println("Total balance:"+obj.deposit(sc.nextDouble()));
						break;
					case 3:
						System.out.println("Enter amount to withdraw");
						System.out.println("Total balance:"+obj.withdraw(sc.nextDouble()));
						break;
					case 4:
						System.out.println("Enter amount to fixed deposit");
						obj.fixedDeposit(sc.nextDouble());
						break;
					case 5:
						System.out.println("Fixed deposit balance is :"+obj.getFixedBalance());
						break;
					default:
						System.out.println("invalid choice ! please Enter valid choice");
						break;
				}
				
			}
		}
		else if(accType.equals("L") ||accType.equals("l"))
		{
			LoanAccount obj = new LoanAccount(name, address, dob, phoneNo, balance);
			boolean loop = true;
			while(loop == true)
			{
			
				System.out.println("what service do you want");
				System.out.println("Enter 0 to exit");
				System.out.println("Enter 1 for the Customer details");
				System.out.println("Enter 2 to pay EMI ");
				System.out.println("Enter 3 for top up loan");
				System.out.println("Enter 4 for repayment ");
				
				
				switch(sc.nextInt())
				{
					case 0:
						System.out.println("Thankyou for using our service");
						loop = false;
						break;
					case 1:
						System.out.println(obj);
						break;
					case 2:
						System.out.println("Enter EMI amount");
						obj.payEMI(sc.nextDouble());
						break;
					case 3:
						System.out.println("Enter top up loan amount ");
						obj.topUpLoan(sc.nextDouble());
						break;
					case 4:
						System.out.println("Enter repayment amount");
						obj.repayment(sc.nextDouble());
						break;
					default:
						System.out.println("invalid choice ! please Enter valid choice");
						break;
				}
			}
		}
		else
		{
			System.out.println("invalid account type ! Thankyou");
		}
	}

}

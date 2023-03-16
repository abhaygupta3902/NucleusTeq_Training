package week4EmployeeManagementSystem;

public class Employee {
	
	private int id;
	private String name;
	private String address;
	private String  phoneNo;
	
	public Employee(int id ,String name , String address , String  phoneNo)
	{
		this.id = id;
		this.name = name;
		this.address = address;
		this.phoneNo = phoneNo;
	}
	
	public String toString()
	{
		return this.id+","+this.name+","+this.address+","+this.phoneNo;
	}
}

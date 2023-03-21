package week4EmployeeManagementSystem;

public class Employee {
	
	private int id;
	private String name;
	private String address;
	private String  phoneNo;
	private String post;
	private double salary;
	
	
	public Employee(int id ,String name , String address ,double salary, String post,String  phoneNo)
	{
		this.id = id;
		this.name = name;
		this.address = address;
		this.phoneNo = phoneNo;
		this.salary = salary;
		this.post =post;
	}
	
	public String toString()
	{
		return this.id+","+this.name+","+this.address+","+this.salary +","+this.post+","+this.phoneNo;
	}
}

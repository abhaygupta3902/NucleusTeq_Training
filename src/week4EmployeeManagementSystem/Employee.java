package week4EmployeeManagementSystem;

public class Employee {
	
	private String id;
	private String name;
	private String address;
	private String  phoneNo;
	private String post;
	private String salary;
	
	
	public Employee(String id ,String name , String address ,String salary, String post,String  phoneNo)
	{
		this.id = id;
		this.name = name;
		this.address = address;
		this.phoneNo = phoneNo;
		this.salary = salary;
		this.post =post;
	}
	
	public String toString() //return HashMap Object String
	{
		//return this.id+","+this.name+","+this.address+","+this.salary +","+this.post+","+this.phoneNo;
		return "{Job_id ="+this.id+","+"Name="+this.name+","+"Address="+this.address+","+"Salary="+this.salary+","
				+"Post="+this.post+","+"PhoneNo="+this.phoneNo+"}";
	}
	
	//Setter getter methods
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}
}

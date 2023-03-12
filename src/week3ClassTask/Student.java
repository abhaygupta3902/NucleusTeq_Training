package week3ClassTask;

public class Student {
	
	//Instance variables of Student class
	private int rollNumber;
	private int marks1,marks2,marks3;
	private static int seriesNumber=5000;
	private String name ,course;
	private String enrollmentNo;
	
	public Student(String name ,String course,int marks1,int marks2,int marks3)
	{
		this.setName(name);
		this.setCourse(course);
		this.setRollNumber();
		this.setEnrollmentNo();
		this.setMarks1(marks1);
		this.setMarks2(marks2);
		this.setMarks3(marks3);
	}
	
	//setter getter methods
	public void setEnrollmentNo() 
	{
		enrollmentNo = course +"@"+rollNumber;
	}
	public String getEnrollmentNumber()
	{
		return enrollmentNo;
	}
	public void setRollNumber()
	{
		this.rollNumber =++seriesNumber;;
	}
	public int getRollNumber()
	{
		return this.rollNumber;
	}
	
	public void setMarks1(int marks1)
	{
		this.marks1=marks1;
	}
	public int getMarks1()
	{
		return this.marks1;
	}
	public void setMarks2(int marks2)
	{
		this.marks2=marks2;
	}
	public int getMarks2()
	{
		return this.marks2;
	}
	public void setMarks3(int marks3)
	{
		this.marks3=marks3;
	}
	public int getMarks3()
	{
		return this.marks3;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}
	
	public void setCourse(String course)
	{
		this.course = course;
	}
	
	public String getCourse()
	{
		return this.course;
	}
	
	//----------------------------------------------------------//
	
	
	public String toString()//toString method it will return the student details
	{
		return "Students [Name - "+this.name+" , "+"Roll Number - "+this.rollNumber+" , "+"Course - "+this.course+" , "+"EnrollmentNo - "
				+this.enrollmentNo+" , "+"Total Marks - "+ this.calculateTotal()+" , "+"Grade - "+this.calculateGrade()+"]";
	}
	
	public int calculateTotal()
	{
		return (this.marks1+this.marks2+this.marks3);
	}
	
	public double calculateAverage()
	{
		return (this.marks1+this.marks2+this.marks3)/3;
	}
	
	public String calculateGrade()
	{
		double percentage = this.calculateAverage();
		//System.out.println(percentage);
		
		if(percentage >=85)
			return "A+";
		else if(percentage >=70)
			return "A";
		else if(percentage >=60)
			return "B+";
		else if(percentage >=50)
			return "B";
		else if(percentage >=45)
			return "C";
		else
			return "D";
	}
}

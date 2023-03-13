package week3AbstractClassTask;

public class Circle extends Shape {
	
	private int radius;
	
	public Circle(int radius)
	{
		this.radius = radius;
	}
	
	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		
		return (2*3.14*this.radius);
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (3.14*this.radius*this.radius);
	}

}

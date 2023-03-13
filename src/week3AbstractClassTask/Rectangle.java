package week3AbstractClassTask;

public class Rectangle extends Shape {
	
	private double length;
	private double width;

	public Rectangle(double length, double width) {

		this.length = length;
		this.width = width;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2*(length+width);
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return length*width;
	}

}

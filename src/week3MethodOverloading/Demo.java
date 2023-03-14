package week3MethodOverloading;

class X
{
    void method(int a)
    {
        System.out.println("ONE");
    }
 
    void method(double d)
    {
        System.out.println("TWO");
    }
}
 
class Y extends X
{
    @Override
    void method(double d)
    {
        System.out.println("THREE");
    }
}
 
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Y().method(100); //passing an integer value so it will call the method which has integer argument
		new X().method(0.0); //passing an double value so it will call the method which has double argument
		new Y().method(100.0); //creating child class object so it will call the overrided method
	}

}

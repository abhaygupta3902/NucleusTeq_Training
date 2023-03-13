package week3InterfaceTask;
import java.util.Scanner;


//SmartPhone class that extends Phone class and implements camera and MusicPlayer interface
public class SmartPhone extends Phone implements Camera ,MusicPlayer 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone obj = new SmartPhone(); //creating SmartPhone object 
		
		Scanner sc = new Scanner(System.in);//creating Scanner class object
		
		boolean loop =true;
		
		//services choice for SmartPhone
		while(loop == true )
		{
			System.out.println("\nEnter the following choices to use a service");
			System.out.println("Enter 1 to make a call");
			System.out.println("Enter 2 to send an sms");
			System.out.println("Enter 3 to play Music Player");
			System.out.println("Enter 4 to stop Music Player");
			System.out.println("Enter 5 to click a Picture");
			System.out.println("Enter 6 to start recording");
			System.out.println("Enter 0 to exit");
			
			switch(sc.nextInt())
			{
				case 0:
					System.out.println("Thankyou for using our service");
					loop = false;
					break;
				case 1:
					obj.call();
					break;
				case 2:
					obj.sms();
					break;
				case 3:
					obj.play();
					break;
				case 4:
					obj.stop();
					break;
				case 5:
					obj.click();
					break;
				case 6:
					obj.record();
					break;
				default:
					System.out.println("invalid choice !Please Enter a valid choice");
			}
		}
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("playing music player");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("music player stopped");	
	}

	@Override
	public void click() {
		// TODO Auto-generated method stub
		System.out.println("Picture clicked");
	}

	@Override
	public void record() {
		// TODO Auto-generated method stub
		System.out.println("recording start");
	}

}

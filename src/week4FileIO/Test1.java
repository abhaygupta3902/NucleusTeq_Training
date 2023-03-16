package week4FileIO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//program to write into a file
public class Test1 {

	public static void main(String[] args)   {
		// TODO Auto-generated method stub
		
		try {
			
			FileOutputStream fout = new FileOutputStream("D:\\softwares\\eclipse\\workspace\\NucleusTeqTraining\\src\\week4FileIO\\text.txt");
			//fout.write(65); //writing integer to file
			
			String s ="Hello";
			byte b[] = s.getBytes(); //converting string to bytes
			
			fout.write(b);
			
			fout.close();
			System.out.println("Success");
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}

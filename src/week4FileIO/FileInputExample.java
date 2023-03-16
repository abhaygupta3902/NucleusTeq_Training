package week4FileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// program to read data from file
public class FileInputExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			FileInputStream fin = new FileInputStream("D:\\softwares\\eclipse\\workspace\\NucleusTeqTraining\\src\\week4FileIO\\text.txt");
			
			//int i = fin.read(); //reading first byte
			
			//System.out.println("input char is "+(char)i);
			
			int i=0;  //reading all characters from the file
			while((i=fin.read())!=-1)
			{
				System.out.print((char)i);
			}
			
			fin.close();
		} catch (FileNotFoundException e) {
			
			System.out.println(e.getMessage());
		} catch (IOException e) {
			
			System.out.println(e.getMessage());
		}
		
	}

}

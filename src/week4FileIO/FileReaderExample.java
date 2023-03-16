package week4FileIO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//program to read data from file using file reader
public class FileReaderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileReader fr = new FileReader("D:\\\\softwares\\\\eclipse\\\\workspace\\\\NucleusTeqTraining\\\\src\\\\week4FileIO\\\\text.txt");
			
			int i;
			
			while((i=fr.read())!=-1)
			{
				System.out.print((char) i);
			}
			
			fr.close();
		} catch (FileNotFoundException e) {
			
			System.out.println(e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

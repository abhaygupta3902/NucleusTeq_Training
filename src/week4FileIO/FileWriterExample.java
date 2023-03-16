package week4FileIO;

import java.io.FileWriter;
import java.io.IOException;

//program to write data into file using FileWriter
public class FileWriterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter fw = new FileWriter("D:\\softwares\\eclipse\\workspace\\NucleusTeqTraining\\src\\week4FileIO\\text.txt");
			
			fw.write("Writing using file writer"); // writing string into file
			
			fw.close(); //closing the file
			
			System.out.println("Success");
		} catch (IOException e) {
			
			System.out.println(e.getMessage());
		}
	}

}

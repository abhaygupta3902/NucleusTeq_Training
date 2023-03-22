package week4FileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

class Employee
{
	
	String id;
	String name;
	String address;
	String phoneNo;
	
	public Employee(String id ,String name , String address , String phoneNo)
	{
		this.id = id;
		this.name = name;
		this.address = address;
		this.phoneNo = phoneNo;
	}
	
	public String toString()
	{
		return "["+this.id+","+this.name+","+this.address+","+this.phoneNo;
	}
	
	public String getId() {
		return this.id;
	}
	public String getName()
	{
		return this.name;
	}
	
	public String getAddress()
	{
		return this.address;
	}
	
	public String getPhone()
	{
		return this.phoneNo;
	}
}

public class Test {

	public static String filename = "D:\\\\softwares\\\\eclipse\\\\workspace\\\\NucleusTeqTraining\\\\src\\\\week4FileIO\\\\text.txt";

	public Map<String, String> convertStringToHashMap(String line)
	{
		return Arrays
				.stream(line.substring(1,line.length()-1).split(","))
				.map(s -> s.split("=",2))
				.collect(Collectors.toMap(s ->s[0].trim(), s->s[1].trim()));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e = new Employee("102" ,"Ashish sahu","Santoshi Nagar","123456");
		
		HashMap <String , String> map=new HashMap <String,String>();
		
		map.put("Job_id",e.getId());
		map.put("Name", e.getName());
		map.put("Address", e.getAddress());
		map.put("PhoneNo", e.getPhone());
		
		//ArrayList<HashMap> arrayList = new ArrayList<HashMap>();
		
		//arrayList.add(map);
		
		System.out.println(map);
		
		try {
			/*FileWriter fw = new FileWriter(filename,true);
			fw.append(""+map);
			fw.append("\n");
			fw.close();*/
			//fw.write((String)arrayList);
			
			BufferedReader reader = new BufferedReader(new FileReader(filename));
			String line;
			boolean check = true;
			while((line=reader.readLine())!=null)
			{
				map = (HashMap<String, String>) new Test().convertStringToHashMap(line);
				if(map.containsValue("1000"))
				{
					System.out.println(map);
					check = false;
				}
			}
			
			if(check)
			{
				System.out.println("User not Found");
			}
			
			reader.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		//File f = new File(filename);
		/*System.out.println(e);
		
		try {
			//FileWriter fw = new FileWriter(filename ,true);
			//fw.append(e.toString());
			
			//fw.close();
			FileReader fr = new FileReader(filename);
			fr.read();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		*/
	}

}

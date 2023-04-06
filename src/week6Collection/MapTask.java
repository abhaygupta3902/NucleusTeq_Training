package week6Collection;

import java.util.HashMap;

public class MapTask {

	public static void countFrequency(String str)
	{
		HashMap<Character , Integer> map = new HashMap<Character,Integer>();
		
		//map.put('h', 1);
		//map.put('e', 2);
		
		//System.out.println(str.charAt(4));
		for(int i=0;i<str.length();i++)
		{
			//map.get(str.charAt(i))!=nullmap.get(str.charAt(i))!=null
			if(map.containsKey(str.toUpperCase().charAt(i)))
			{
				//System.out.println(map.get(str.charAt(i)));
				Integer temp = map.get(str.charAt(i))+1;
				map.replace(str.charAt(i), temp);
			}
			else 
			{
				map.put(str.charAt(i), 1);
			}
		}
		
		System.out.println(map);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "HelloEveryone";
		
		countFrequency(str);

	}

}

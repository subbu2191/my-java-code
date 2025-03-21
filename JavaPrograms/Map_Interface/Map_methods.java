package Map_Interface;

import java.util.HashMap;
import java.util.Map;

public class Map_methods 
{
	public static void main(String[] args) 
	{
		Map<String,Integer> m2=new HashMap<String,Integer>();
		m2.put("Aa", 1);
		m2.put("Bb", 2);
		m2.put("Cc", 3);
		m2.put("Dd", 4);
		m2.put("Ee", 5);
		m2.put("Ff", 6);
		System.out.println(m2);
		
		//m2.putAbsent("Gg", 7);
        //System.out.println(m2);
		
		System.out.println(m2.containsKey("Gg"));
		System.out.println(m2.containsValue(5));
		
		m2.remove("Dd", 4);
		System.out.println(m2);
		
		m2.remove("Dd");
		System.out.println(m2);
		
		m2.replace("Aa", 1 , 10);
		System.out.println(m2);
		
		
	
	}

}

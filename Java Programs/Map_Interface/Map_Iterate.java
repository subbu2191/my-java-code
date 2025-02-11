package Map_Interface;

import java.util.Map;
import java.util.HashMap;

public class Map_Iterate
{
public static void main(String[] args) 
{
	Map<String,Integer> m1=new HashMap<String,Integer>();
	m1.put("Ram", 51);
	m1.put("Sita", 35);
	m1.put("Supriya", 21);
	m1.put("Mahesh", 18);
	m1.put("Suman", 60);
	System.out.println(m1);
	
	for (String key: m1.keySet())
	{
		System.out.println(key);
	
	}
	
	for (Integer value: m1.values())
	{
		System.out.println(value);
	
	}
	
	
	//System.out.println(m1.keySet());
	//System.out.println(m1.values());
	//System.out.println(m1.entrySet());
	
	
	
	
	
	
	
	
	
}
}

package Map_Interface;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Map_foreach_entryset 
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
	
	for(Entry<String,Integer> kv: m1.entrySet())
	{
		System.out.println(kv);
	}
	
	
	
}
}

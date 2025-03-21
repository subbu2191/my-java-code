package Map_Interface;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Map_Entryset 
{
	
public static void main(String[] args) 
{
	Map<String,String> m1=new HashMap<String,String>();
	m1.put("Ram", "Chennai");
	m1.put("Sita", "Bangalore");
	m1.put("Supriya", "Delhi");
	m1.put("Mahesh", "Pune");
	m1.put("Suman", "Noida");
	System.out.println(m1);
	
	for(Entry <String,String> kv :m1.entrySet()) 
	{
		System.out.println(kv);
	}
	
	
	
	
	
	
	
	
}
}

package Map_Interface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Map_Iterator 
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
	
	Iterator <Entry<String,String>> kv=m1.entrySet().iterator();
	
	while(kv.hasNext())
	{
		System.out.println(kv.next());
	}
}
}

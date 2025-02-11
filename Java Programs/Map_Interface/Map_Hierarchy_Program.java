package Map_Interface;

import java.util.HashMap;
import java.util.Map;

public class Map_Hierarchy_Program 

{
public static void main(String[] args)
{
	//hashmap to map-->upcasting
	
	Map m1=new HashMap();
	m1.put("Ram", 50);
	m1.put("Suresh", 40);
	m1.put("Ramesh", 30);
	m1.put("Mahesh", 60);
	m1.put("Booban", 20);
	m1.put("Karthick", 10);
	System.out.println(m1);
	
	//map with wrapper class
	Map<String,Integer> m2=new HashMap<String,Integer>();
	m2.put("Aa", 1);
	m2.put("Bb", 2);
	m2.put("Cc", 3);
	m2.put("Dd", 4);
	m2.put("Ee", 5);
	m2.put("Ff", 6);
	System.out.println(m2);
	m2.putAll(m1);
	System.out.println(m2);
	
	Map m3=new HashMap();
	m3.put("Ram", 55);
	m3.put("Suresh", 46);
	m3.put("Ramesh", 70);
	m3.put("Mahesh", 90);
	m3.put("Booban", 93);
	m3.put("Karthick", 10);
	System.out.println(m3);
	m3.clear();
	System.out.println(m3);
}
}

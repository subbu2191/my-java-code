package Collection_Programs;

import java.util.Enumeration;
import java.util.Vector;

public class Enumeration_OneOfJavaCursor 

{
public static void main(String[] args)
{
	Vector v1=new Vector();
	v1.add("Subbu");
	v1.add("Harinika");
	v1.add("Booban");
	v1.add("Karthick");
	System.out.println(v1);
	
	Enumeration e1=v1.elements();
	while(e1.hasMoreElements())
	{
		System.out.println(e1.nextElement());
	}
	
	
	
	
}
}

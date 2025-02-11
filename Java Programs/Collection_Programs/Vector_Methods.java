package Collection_Programs;

import java.util.Collections;
import java.util.Vector;

public class Vector_Methods 
{
	
		static void Sorting()
		{
		Vector v1=new Vector();
	
		v1.add("Subbu");
		v1.add("Apple");
		v1.add("Zebra");
		v1.add("Tiger");
		v1.add("Subbu");
		Collections.sort(v1);
		System.out.println(v1);
	}
	
public static void main(String[] args)
{
	Vector v1=new Vector();
	v1.add("Subbu");
	v1.add(15);
	v1.add(3.9876543212345);
	v1.add('J');
	v1.add(false);
	v1.add(null);
	v1.add(null);
	v1.add("Subbu");
	System.out.println(v1);
	Sorting();
}
}

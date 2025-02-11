package Collection_Programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class Upcasting_Collections 

{
public static void main(String[] args)
{
	//ArrayList(Sub Class) to List(Super Class)
	
	System.out.println("Understanding List");
	List l1=new ArrayList();
	l1.add("Subbu");
	l1.add(3456);
	l1.add(9.76543);
	l1.add('E');
	l1.add(true);
	l1.add(null);
	l1.add(null);
	System.out.println(l1);
	
	//iterator
	Iterator i1=l1.iterator();
	while(i1.hasNext())
	{
	System.out.println(i1.next());
	}
	
	//ListIterator
	ListIterator i2=l1.listIterator();
	while(i2.hasNext())
	{
	System.out.println(i2.next());
	}
	
	ListIterator i4=l1.listIterator();
	while(i4.hasNext())
	{
	System.out.println(i4.next());
	}
	
	//Hashset(Sub class) to Set(Super class)
	
	System.out.println("Understanding Set");
	Set s1=new HashSet();
	s1.add("Booban");
	s1.add(1983);
	s1.add(100.98765432);
	s1.add(true);
	s1.add('B');
	s1.add(null);
	s1.add(null);
	System.out.println(s1);
	
	//iterator
		Iterator i3=s1.iterator();
		while(i3.hasNext())
		{
		System.out.println(i3.next());
		}
	
}
}

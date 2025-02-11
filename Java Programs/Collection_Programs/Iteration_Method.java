package Collection_Programs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Iteration_Method 
{
public static void main(String[] args)
{
	ArrayList a1=new ArrayList();
	a1.add("subbu");
	a1.add(765);
	a1.add('G');
	a1.add("Sita");
	a1.add(false);
	a1.add(null);
	System.out.println("a1 is->" +a1);
	
	Iterator i1=a1.iterator();
	while(i1.hasNext())
	{
		System.out.println(i1.next());
	}
	
	ListIterator i2=a1.listIterator();
	while(i2.hasNext())
	{
		System.out.println("Forward Iteration");
		System.out.println( i2.next());
	}
	
	while(i2.hasPrevious())
	{
		System.out.println("Backward Iteration");
		System.out.println(i2.previous());
	}
	
	
}
}

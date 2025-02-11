package Collection_Programs;

import java.util.ArrayList;

public class ArrayList_add_Methods 
{

public static void main(String[] args)	
{
	ArrayList a1=new ArrayList();     //object created
	a1.add("Ram") ;                 //adding objects
	a1.add("Kumar");
	a1.add("Subbu");
	a1.add(17);
	a1.add(true);
	a1.add('C');
	a1.add(13.09876543);
	a1.add(null);          //arraylist accepts duplicates and null 
	a1.add(null);
	a1.add("Ram") ;
	System.out.println(a1);
	 
	ArrayList a2=new ArrayList();     //to check dynamic
	a2.add("Ram") ;                 
	a2.add("Kumar");
	a2.add("Subbu");
	a2.add(17);
	a2.add(true);
	a2.add('C');
	a2.add(13.09876543);
	a2.add(null);
	a2.add(null);
	a2.add("Ram") ;
	System.out.println(a2);

	
}
	
}

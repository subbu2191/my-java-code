package Collection_Programs;

import java.util.ArrayList;

public class ArrayList_Other_Methods 
{
	
public static void main(String[] args)
{
	ArrayList a1=new ArrayList(); //by default empty size 10
	a1.add("Ram");
	a1.add("Sita");
	a1.add("Laxman");
	System.out.println("a1 is->" +a1);
	
	ArrayList a3=new ArrayList(6); //int capacity 6
	a3.add("Harinika");
	a3.add("Asmitha");
	a3.add("Sara");
	System.out.println("a3 is->" +a3);
	
	

	ArrayList a4=new ArrayList(a3);  //Collection
	System.out.println("a4 is->" +a4);
	
	System.out.println(a4.set(2, 123));
	System.out.println("a4 is->" +a4);
	System.out.println(a4.get(1));
	
	/*a1.clear();
	System.out.println("a1 is->" +a1);
	
	
	
	ArrayList a2=new ArrayList();
	a2.add("Raja");
	a2.add("Queen");
	a2.add("Minister");
	a2.addAll(a1);
	a2.add(0,"Subbu");
	a2.addAll(0,a1);
	a2.remove("Subbu");
	System.out.println("a2 is->" +a2);
	System.out.println("contains->" +a2.contains("Subbu"));
	System.out.println("containsAll->" +a2.containsAll(a1));
	a2.removeAll(a1);
	System.out.println("a1 removed from a2->" +a1);
	System.out.println ("size of a2->" +a2.size());
	System.out.println ("size of a1->" +a1.size());
	System.out.println("Empty->" +a1.isEmpty());
	*/
	
}
}

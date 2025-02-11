package Collection_Programs;

import java.util.Collections;
import java.util.HashSet;

public class HashSet_Methods 
{
	
/*static void Sorting() 
{
	HashSet h1=new HashSet();
	h1.add("Lion");
	h1.add("Bat");
	h1.add("Girl");
	Collections.sort(h1);
	System.out.println(h1);
}*/
	
public static void main(String[] args)
{
	HashSet h1=new HashSet();
	h1.add("Lion");
	h1.add(5678);
	h1.add(null);
	h1.add(null);
	h1.add(true);
	h1.add("Lion");
	System.out.println(h1);
	
}
}

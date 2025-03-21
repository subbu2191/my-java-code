package Collection_Programs;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist_sort_method 
{
	
static void sorting_method()
{
	ArrayList a1=new ArrayList();
	a1.add(11);
	a1.add(100);
	a1.add(30);
	a1.add(800);
	a1.add(0);
	Collections.sort(a1);
	System.out.println(a1);
}
public static void main(String[] args)
{
	
	ArrayList a1=new ArrayList();
	a1.add("Cat");
	a1.add("Zebra");
	a1.add("Hen");
	a1.add("Ice cream");
	a1.add("Wave");
	Collections.sort(a1);
	System.out.println(a1);
	sorting_method();
	
}
}

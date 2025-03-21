package Collection_Programs;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList_Methods 
{
	static void Sorting()	
	{
		LinkedList l1=new LinkedList();
		l1.add(50);
		l1.add(700);
		l1.add(1);
		l1.add(20);
		l1.poll();
		System.out.println(l1);
		Collections.sort(l1);
		System.out.println(l1);
	}
public static void main(String[] args)
{
	LinkedList l1=new LinkedList();
	l1.add("Apple");
	l1.add('H');
	l1.add(800);
	l1.add(false);
	l1.add(14.87654324567);
	l1.add(null);
	l1.add(null);
	l1.add("Apple");
	System.out.println(l1);
	Sorting();
}
}

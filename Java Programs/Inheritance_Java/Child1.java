package Inheritance_Java;

class Grandparent
{
	void third()
	 {
		 System.out.println("level3");
	 }
}

class Parent extends Grandparent
{
	void second()
	 {
		 System.out.println("level2");
	 }
}



public class Child1 extends Parent
{
 void first()
 {
	 System.out.println("level1");
 }
	
	public static void main(String[] args)   //Multi level inheritance, all methods non-static
{
	Child1 r1=new Child1();     //object creation only for child class
	r1.first();                  // same reference variable call the all the methods in different class
	r1.second();
	r1.third();
}
}

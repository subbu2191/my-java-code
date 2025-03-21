package Hierarchial_Inheritance;

class State_Class
{
	State_Class()                      // constructor
	
	{
		System.out.println("State class Constructor");
	}
}


public class City_Class extends State_Class

{
City_Class()                 // constructor
{
	super();     //implicitly or explicitly
	
	System.out.println("City Class Constructor");
}

public static void main(String args[])
{
	new City_Class();      //object created for Child class
}
	
	
}

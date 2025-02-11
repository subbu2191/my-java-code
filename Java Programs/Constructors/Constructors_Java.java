package Constructors;

public class Constructors_Java

{

	Constructors_Java()
	{
		System.out.println("login to Amazon");
	}
	
	Constructors_Java(int a)
	{
		System.out.println("login to google");
	}
	Constructors_Java(String name)
	{
		System.out.println(name);
	}
	
	public static void main(String[] args)
	{
		Constructors_Java C1=new Constructors_Java();
		
		Constructors_Java C2=new Constructors_Java();
		
		Constructors_Java C3=new Constructors_Java();     // classname ref.varaiable=classname
		
		new Constructors_Java();    // another method for create an object
		
		new Constructors_Java(2); 
		
		new Constructors_Java("SUBBU"); 
	    
		
	}
}

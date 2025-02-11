package Inheritance_Java;

class Amazon_login
{
	static void level3()
	{
	System.out.println("GrantParent class");
	}
}


class Yahoo_login extends Amazon_login
{
static void level2()
{
System.out.println("Parent class");
}
}



public class Google_Auth extends Yahoo_login
{
	static void level1()
	{
	System.out.println("Child class");
	}
	
	public static void main(String[] args)    // Multi level Inheritance, all methods are static
	{
		level1();
		level2();
		level3();
	}
	
	
	
}

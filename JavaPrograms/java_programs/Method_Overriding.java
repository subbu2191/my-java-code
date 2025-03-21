package java_programs;
class Class1
{
	void Amazon()                          //suppressed or it has been overridden
	{
		System.out.println("Parent class");
	}
	
	static void amazon()                       //static method
	{ 
		System.out.println("addition");
	}
}

public class Method_Overriding extends Class1
{
void Amazon()
{
	                                    // written only under non-static method
	System.out.println("Child class");
	super.Amazon();
}
	
	
	
public static void main(String[] args)
{
	Method_Overriding M1=new Method_Overriding();
	M1.Amazon();
	amazon();
}

}

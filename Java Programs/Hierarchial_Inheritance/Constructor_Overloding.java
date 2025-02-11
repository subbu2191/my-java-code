package Hierarchial_Inheritance;

public class Constructor_Overloding 
{
	Constructor_Overloding(int age)
	{
		System.out.println(age);
	}
	Constructor_Overloding(double weight)
	{
		this(50);
		System.out.println(weight);
	}
	
	Constructor_Overloding(String name)
	{
		this(20.98);                     //to call previous constructor
		System.out.println(name);
	}
	
	
	
	
public static void main(String[] args)
{
	new Constructor_Overloding("Subbu");
}
}

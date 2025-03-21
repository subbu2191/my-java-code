package Hierarchial_Inheritance;

class Country_Class 
{
	 Country_Class()
	 {
		 System.out.println("Country class");
	 }
}



class Subbu_Class extends  Country_Class
{
    Subbu_Class(int a)                      // constructor
	
	{
		System.out.println("State class Constructor");
	}
}



public class Super_Parameterized extends Subbu_Class
{
	
	Super_Parameterized()                 // constructor
		{
			super(100);     //implicitly or explicitly
			
			System.out.println("Super Parameterized Constructor");
		}
	
	
	public static void main(String args[])
	{
		new Super_Parameterized();
	}
}
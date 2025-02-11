package Constructors;

public class GlobalasFinal 

{

	final static double pi=3.14;
	
	static void area()           // formula: pi*r*r
	{
		int r=7;
		double circle_area=pi*r*r; 
		System.out.println("AreaofCircle=");     // wrong to update pi if it is not final variable
	    System.out.println(circle_area);
	
	
	}
	static void circumference()      //formaula: 
	{
		int r=3;
		double circum=2*pi*r;
		System.out.println("CircumferenceofCircle=");
		System.out.println(circum); 
	}
	
	public static void main(String[] args) 
	{
	final int min=60;                 // local variable(min) as final variable
	System.out.println(min);
	area();
	circumference(); 	
		
		
		
		
		
		
	}
}

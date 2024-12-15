package Constructors;

public class Globalvariable1 
{
static double pi=3.14;
static int no_of_days;    // default value=0 for int
static String name;	
static double d1;
static boolean b1;	
static char c;
	
	
public static void main(String[] args)
{
	
	no_of_days=365;       //update the global variable
	System.out.println(no_of_days);
	
	int r=7;
	double area=pi*r*r;
	System.out.println(area);
	System.out.println(name);
	System.out.println(d1);
	System.out.println(b1);
	System.out.println(c);
}
}

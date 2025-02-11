package Constructors;

public class GlobalVariable 
{
static double pi=3.14;    //global variable
	
static void daughter()
{
	int r1=9;            //local variable
	double areaofcircle=pi*r1*r1;
	System.out.println(areaofcircle);
}
	
public static void main(String[] args)
{
	
	int r=7;
	double area=pi*r*r;
	System.out.println(area);
	
	daughter();
}
}

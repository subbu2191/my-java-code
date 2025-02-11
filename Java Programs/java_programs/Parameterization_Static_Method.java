package java_programs;

public class Parameterization_Static_Method 
{
static void add(int a, int b)
{
	System.out.println(a+b);
}

static void sub(double a, int b)
{
	System.out.println(a-b);
}
	
static void other(char male, char female)
{
	System.out.println(male);
}

static void bool(boolean A)
{
	System.out.println(A);
}
	
	
	
public static void main(String[] args)	
{

	add(90, 10);
	sub(9.987765,1);
	other('M','F');
	bool(true);
	
}	
}

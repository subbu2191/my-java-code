package Collection_Programs;

public class Primitive_Typecasting 
{
public static void main(String[] args)
{
	//int into double-->small to big
	int a=10;
	double d1= a;     //widning-implicit
	System.out.println("implicit " +d1);
	
	//widning-explicit
	double newage =(double) 30;
	System.out.println("Explicit " +newage);
	
	//Narrowing-only explicit
	//double into int
	int i1=(int) 700.098;
	System.out.println("Explicit-Narrowing " +i1);
	
	double d2=9.76576;
	//int i2=d1;
}
}

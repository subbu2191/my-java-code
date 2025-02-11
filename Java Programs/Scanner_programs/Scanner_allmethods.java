package Scanner_programs;

import java.util.Scanner;

public class Scanner_allmethods 
{
	
public static void main(String args[])
{
Scanner s1=new Scanner(System.in)	;

System.out.println("Enter name");
String name=s1.next();
System.out.println("Enter age");
int age=s1.nextInt();
System.out.println("Enter byte");
byte b1=s1.nextByte();
System.out.println("Enter short");
short s2=s1.nextShort();
System.out.println("Enter long");
long l1=s1.nextLong();
System.out.println("Enter float");
float f1=s1.nextFloat();
System.out.println("Enter double");
double d1=s1.nextDouble();
System.out.println("Enter boolean");
boolean b2=s1.nextBoolean();
s1.close();

	
	
	
	
	
	
}
}

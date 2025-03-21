package java_programs;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment_NestedTryCatch_Exception 

{
public static void main(String args[])

{
	Scanner s1 = new Scanner(System.in);
	try 
	{
		System.out.println("Enter the Mobile number");
		int mobileno=s1.nextInt();
		System.out.println(mobileno);
	}
	catch(InputMismatchException a)
	{
		System.out.println("Enter Numeric Value");
		Scanner s2 = new Scanner(System.in);
		try 
		{
			System.out.println("Enter the Mobile number");
			int mobileno=s1.nextInt();
			System.out.println(mobileno);
		}
		catch(InputMismatchException b)
		{
			System.out.println("Enter Numeric Value");
			Scanner s3 = new Scanner(System.in);
		}
	}
	
	
	
	
}
}

package java_programs;

import java.util.InputMismatchException;

public class ExceptionHandling 

{
public static void main(String args[])
{
/*
 int c=a/b;     // a comes from parent class and b comes from child class
 */
	
try {
	
	int c=1/0;  // exception coming ,  1/1 means- no exception
	System.out.println("try block will execute if exception is not coming");
}
catch(ArithmeticException a)
{
	System.out.println("Catch block will execution if exception is coming");
}

catch(InputMismatchException b)
{

	System.out.println("Multiple catch block");
}
finally
{
	System.out.println("Finally block always execute");
}
	
}
}


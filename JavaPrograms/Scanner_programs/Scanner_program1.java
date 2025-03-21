package Scanner_programs;
import java.util.Scanner;

public class Scanner_program1 

{
public static void main(String args[])
{
	Scanner s1=new Scanner(System.in);   // creating objects
	System.out.println("Write the value of a");
	int a= s1.nextInt();
	System.out.println("Write the value of b");
	int b= s1.nextInt();
	int sum= a+b;
	System.out.println("output");
	System.out.println(sum);
	s1.close();
	
	
	
	
}
	
}

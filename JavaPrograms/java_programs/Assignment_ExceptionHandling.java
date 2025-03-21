package java_programs;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_ExceptionHandling 
{

	public static void main(String args[])
	{
		String name[]= new String[3];
		Scanner s1=new Scanner(System.in);
		
		for(int i=0;i<=3;i++)
		{
			System.out.println("Enter the value of index->" +i);
			name[i]=s1.next();
		}
		
		
		System.out.println("Output");
		System.out.println(name);
	}
	
	
	
	
	
	
	
	
}

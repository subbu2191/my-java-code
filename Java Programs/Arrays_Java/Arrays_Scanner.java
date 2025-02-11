package Arrays_Java;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Scanner

{
public static void main(String[] args)
{
	int rollno[]=new int[3];
	Scanner s1=new Scanner(System.in);
	
	
	
	for(int i=0;i<=2;i++)
	{
		System.out.println("Enter the value of index->" +i);
		rollno[i]=s1.nextInt();
	}
	
	//rollno[0]=s1.nextInt();
	//rollno[1]=s1.nextInt();
	//rollno[2]=s1.nextInt();
	
	
	//System.out.println(rollno[0]);
	//System.out.println(rollno[1]);
	//System.out.println(rollno[2]);
	
	System.out.println("Output");
	System.out.println(Arrays.toString(rollno));
}
	
	
	
}

package String_Methods;

import java.util.Arrays;

public class String_Alphabets_present 

{
	
public static void main(String[] args) 
{
	int count_of_alpha=0;
	String input="Manish123";
	System.out.println(input.length());
	char c1[]=input.toCharArray();
	System.out.println(Arrays.toString(c1));
	
	for(int i=0;i<input.length();i++)
	{
		boolean b1=Character.isAlphabetic(c1[i]);
		
		if (b1==true)
				{
			count_of_alpha++;
				}
	
	}
	System.out.println("The number of alphabet present in String-->");
	System.out.println(count_of_alpha);
	
}
	
	
	
}



//datatype-->byte,short,int,long,float,double,char
//Wrapper Class-->Byte, Short, Integer, Long, Float, Double, Character
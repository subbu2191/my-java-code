package String_Methods;

import java.util.Arrays;

public class Count_Numeric_Only 
{
public static void main(String[] args)
{
	int count_of_alpha=0;
	int count_of_numeric=0;
	int count_of_space=0;
	String input="17 October &%*(#";
	char c1[]=input.toCharArray();
	System.out.println(Arrays.toString(c1));
	
	for(int i=0;i<input.length();i++)
	{
		boolean b1=Character.isAlphabetic(c1[i]);
		boolean b2=Character.isDigit(c1[i]);
		boolean b3=Character.isWhitespace(c1[i]);
		if(b1==true)
		{
			count_of_alpha++;
		}
		if(b2==true)
		{
			count_of_numeric++;
		}
		if(b3==true)
		{
			count_of_space++;
		}
	}
	
	System.out.println("Alphabets-> "+count_of_alpha);
	System.out.println("Numeric-> "+count_of_numeric);
	System.out.println("Space-> "+count_of_space);
	System.out.println("Total length->"+input.length());
	
	int count_of_specialcharacters=input.length()-(count_of_alpha+count_of_numeric+count_of_space);  //BODMAS rule
	System.out.println("Special Characters-> "+count_of_specialcharacters);
}
	
	
	
}

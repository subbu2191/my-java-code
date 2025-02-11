package String_Methods;

import java.util.Arrays;

public class Concat_function 

{
public static void main(String[] args)
{
	String First_name="Subbu";
	String Last_name="lakshmi";
	System.out.println(First_name.concat(" ").concat(Last_name));
	
	
	String intro="My|name|is|Ram";
	String [] a1=intro.split("|");
	System.out.println(Arrays.toString(a1));
	
	String intro1="My name is Ram";
	String [] a2=intro1.split(" ");
	String [] a3=intro1.split(" ", 2);
    System.out.println(a2.length);
	
	
	System.out.println(Arrays.toString(a2));
	System.out.println(Arrays.toString(a3));
	
	
}
}

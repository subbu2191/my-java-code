package String_Methods;

public class Reverse_String_String 

{
public static void main(String[] args)
{
String input="School";
String output="";

for(int i=input.length()-1;i>=0;i--)
{
	char c1=input.charAt(i);
	output=output+c1;
	 // System.out.println(output);
}
	
System.out.println(output);	
	
}
}

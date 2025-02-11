package String_Methods;

public class String_palindrome


{
public static void main(String[] args)
{
	String input="radar";
	String output="";
	
	for(int i=input.length()-1;i>=0;i--)
	{
		char c1=input.charAt(i);
		output=output+c1;
	}
	
	
	System.out.println(output);
	if(input.equals(output))
	{
		System.out.println("The given String is a Palindrome");    //palindrome-->if reverse the word, same word only.
	}
	else
	{
		System.out.println("The given String is NOT a Palindrome");
	}
	}
	
	
}

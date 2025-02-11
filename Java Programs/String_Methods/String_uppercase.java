package String_Methods;

public class String_uppercase

{
public static void main(String[] args)
{
	String name="My school name is sankar ponnar";
	System.out.println(name.length());
	System.out.println(name.toUpperCase());
	
	String mail_id=" SUBBUTCS91@GMAIL.COM";
			System.out.println(mail_id.toLowerCase());
			
	System.out.println(mail_id.charAt(0));
	System.out.println(mail_id.charAt(6));
	
	System.out.println(mail_id.indexOf('T'));
	System.out.println(mail_id.indexOf('B'));   //only gives first 'B' presents in the word
	
	System.out.println(mail_id);
	System.out.println(mail_id.trim());    //space removes only start and end of the string, not in middle
	
	
	String name1="My School name is sankar ponnar";      //check case sensitive also
	System.out.println(name1.equals(name));
	System.out.println(name1.equalsIgnoreCase(name));     //ignore the case sensitive while both string same
	
	
	System.out.println(name1.contains("is"));
	
	System.out.println(name1.substring(18));     //gives after 18th position, 19th fetch the output
	
	System.out.println(name1.substring(0, 10));   //start and end of index-->middle word
	
	
	
	
	
	
}

	
	
	
	
	
	
	
}

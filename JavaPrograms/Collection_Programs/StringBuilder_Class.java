package Collection_Programs;

public class StringBuilder_Class 

{
public static void main(String[] args)
{
	StringBuilder s1=new StringBuilder("Booban");
	System.out.println(s1);
	s1.append("vikneshwaran");
	System.out.println(s1);
	System.out.println(s1.delete(13,18));
	System.out.println(s1.replace(6, 13,"mahendran"));
	System.out.println(s1.substring(2));
	System.out.println(s1.substring(3, 6));
	System.out.println(s1.capacity());
	System.out.println(s1.charAt(0));
	
	
	
	
}
}

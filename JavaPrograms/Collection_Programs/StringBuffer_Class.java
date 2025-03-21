package Collection_Programs;

public class StringBuffer_Class 
{

	
public static void main(String[] args)
{
	
	String s=new String("Subbu");
	s.concat("lakshmi");
	System.out.println("String output-> " +s);
	
	
	StringBuffer s1=new StringBuffer("Subbu");
	s1.append("lakshmi");
	System.out.println("StringBuffer Output-> " +s1);
	
	System.out.println(s1.length());
	System.out.println(s1.substring(5));
	System.out.println(s1.substring(0, 5));
	//System.out.println(s1.indexOf(b));
	System.out.println(s1.isEmpty());
	System.out.println(s1.replace(0,5,"Maha"));
	System.out.println(s1.delete(0, 4));
	System.out.println(s1.reverse());
	
	
}
}

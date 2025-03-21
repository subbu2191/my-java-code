package String_Methods;

public class String_Other_Methods 

{
public static void main(String[] args)

{
String a="Subbu lakshni"	;
System.out.println(a.isEmpty());          //check string is empty or not
System.out.println(a.lastIndexOf('b'));   //while repeated letters give the last index position of the letter
System.out.println(a.indexOf('b'));       //gives 1st position of repeated letters

System.out.println(a.replace('n', 'm'));       //replace single character
System.out.println(a.replaceAll(" ","" ));    //remove entire space in string
System.out.println(a.replaceAll("Subbu", "Raja"));   //replace word

String b="school123";
System.out.println(b.replaceAll("[0-9]",""));     //removes number from 0 to 9

System.out.println(b.replaceAll("[a-z]", ""));
// ASCII values  System.out.println(b.replaceAll(' ', ''));    -->explain later


String c="Manish123 School";
System.out.println(c.replaceAll("[A-Z]", ""));       //remove all capital letters


String s1="Manish Kumar Tiwari";     //ends with 'i' or not 
System.out.println(s1.matches("(.*)i"));    //in sql '%I' % replaced by "(.*)i" in java
System.out.println(s1.matches("(.*)k"));

System.out.println(s1.matches("M(.*)"));   //starts with 'm' ot not and case sensitive

System.out.println(s1.matches("(.*)K(.*)"));    //if 'k' is present or not
System.out.println(s1.contains("K")); 


String s2="Subbu";
System.out.println(s2.matches("....."));     //if 5 letters or not 
















	
	
	
}
	
	
	
	
}

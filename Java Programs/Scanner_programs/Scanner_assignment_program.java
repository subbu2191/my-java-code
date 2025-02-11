package Scanner_programs;

import java.util.Scanner;



public class Scanner_assignment_program 

{
public static void main(String args[])
{
Scanner s1=new Scanner(System.in);

System.out.println("Enter the User First Name");
String first_name=s1.next();

System.out.println("Enter the User Last Name");
String last_name=s1.next();

System.out.println("Enter the User email");
String email=s1.next();

System.out.println("Enter the User Password");
String password=s1.next();

System.out.println("Enter the User Gender");
String gender=s1.next();

System.out.println("Enter the User Present Address");
String Present_address=s1.nextLine();

System.out.println("Enter the User Permanant Address");
String Permanant_address=s1.next();

System.out.println("Enter the Pincode");
int pincode=s1.nextInt();

s1.close();
	
}	
}

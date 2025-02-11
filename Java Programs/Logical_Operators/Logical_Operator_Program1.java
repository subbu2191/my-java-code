package Logical_Operators;

public class Logical_Operator_Program1 
{
public static void main (String[] args)
{

int age=19;
char gender='M';

if (age>=18 && gender=='M')
{
	System.out.println("Statement AND operator");
}
	
if (age>=18 || gender=='F')
{
	System.out.println("Statement OR operator");
}	
	
if (!(age>=25 && gender=='M'))
{
	System.out.println("Statement AND-NOT operator");
}	

if (!(age>=25 || gender=='F'))
{
	System.out.println("Statement OR operator");
}



		
}
}

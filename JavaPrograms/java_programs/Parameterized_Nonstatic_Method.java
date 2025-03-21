package java_programs;

public class Parameterized_Nonstatic_Method 
{

void add(int a, int b)	
{
	int sum=a+b;
	System.out.println(sum);
}
	
	
	public static void main(String[] args)
	{
		
		Parameterized_Nonstatic_Method NS1= new Parameterized_Nonstatic_Method();
		NS1.add(100,10);	
				
		
		
		
		
	}
}

package Constructors;

public class GlobalVariable_nonstatic 
{
	int no_of_days=365;      // non-static global variable

	public static void main(String[] args)
	{
	
		GlobalVariable_nonstatic GV1=new GlobalVariable_nonstatic();    // object creation
		System.out.println(GV1.no_of_days);        //used ref variable to access global variable
		
		
	GV1.no_of_days=366;                         //update value for global variable
	System.out.println(GV1.no_of_days);
		
	}
	
	
	
	
	
	
}



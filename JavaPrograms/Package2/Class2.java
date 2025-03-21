package Package2;

import Package1.Class1;


public class Class2 

{

	public static void main(String[] args)
	{
		Class1 C1=new Class1(); //object created for class1
		Class1.add();           //only public method can access and not able to access private,protected,default
	
	}
}

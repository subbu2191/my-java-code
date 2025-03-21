package java_programs;

public class Method_Overloading 
{

	static void add()
	{
		System.out.println("1");
	}
	
	static void add(int a)
	{
		System.out.println("2");	
	}
	
	static void add(double a, int b)
	{
		System.out.println("3");
	}
	
	static void add(int a, int b)
	{
		System.out.println("4");	
	}
	
	static void add(int a, double b)
	{
		System.out.println("5");
	}
	
	static void add(char c)
	{
		c='Z';          //updated the value for variable c
		System.out.println(c);
	}
	
	static void add(boolean a)
	{
		System.out.println("7");
	}
	
	void add(char a,char b)
	{
		a='A';
		System.out.println(a);
	}
	
	void add(String a)
	{
		System.out.println(a);
	}
	
	public static void main(String[] args)
	{
		
		add();
		add(200);
		add(3.246,1);
		add(10,10);
		add(100,1.111);
		add('A');
		add(true);
		Method_Overloading MO=new Method_Overloading();
		MO.add('M', 'F');
		MO.add("SUBBU");
		
		
		
		
	}
}

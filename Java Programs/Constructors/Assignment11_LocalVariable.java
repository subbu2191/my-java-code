package Constructors;

public class Assignment11_LocalVariable 

{
static void add()
{
	int subbu=100;    //local variable
}

void substract()
{
	int subbu=200;
}
	
void multiple(int no1, int no2)
{
	no2=200;
	System.out.println(no1*no2);
}

Assignment11_LocalVariable()
{
	System.out.println("subbu123");
}
	public static void main(String[] args)
	{
		int subbu=1000;	
		System.out.println(subbu);   // Local variable dont have default value
		Assignment11_LocalVariable LV1=new Assignment11_LocalVariable();
		LV1.multiple(100,100);
		new Assignment11_LocalVariable();
	}
}

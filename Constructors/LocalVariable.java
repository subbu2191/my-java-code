package Constructors;

public class LocalVariable 

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

LocalVariable()
{
	System.out.println("subbu123");
}
	public static void main(String[] args)
	{
		int subbu=1000;	
		System.out.println(subbu);   // Local variable dont have default value
		LocalVariable LV1=new LocalVariable();
		LV1.multiple(100,100);
		new LocalVariable();
	}
}

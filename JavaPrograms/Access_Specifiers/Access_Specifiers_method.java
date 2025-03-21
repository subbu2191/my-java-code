package Access_Specifiers;

public class Access_Specifiers_method
{
public static void add()
{
	System.out.println("add");
}
	
protected static void sub()
{
	System.out.println("sub");
}
	
private static void mul()
{
	System.out.println("mul");
}
	
static void divide()
{
	System.out.println("divide");
}
	
	
	
public static void main(String[] args)
{
	divide();
	add();
	sub();
	mul();
}
	
	
	
}

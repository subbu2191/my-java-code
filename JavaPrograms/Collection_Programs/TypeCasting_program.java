package Collection_Programs;

class Super_Class
{
void add()
{
	System.out.println("addition");
}
void sub()
{
	System.out.println("subtraction");
}
}

public class TypeCasting_program extends Super_Class
{
void mul()	
{
	System.out.println("multiplication");
}
void div()
{
	System.out.println("division");
}
	
public static void main(String[] args)
{
	//upcasting-implicit manner
	Super_Class s1= new TypeCasting_program();
	s1.add();
	s1.sub();
	
	
	//upcasting-explicit manner
	Super_Class s2=(Super_Class) new TypeCasting_program();
	s2.add();
	s2.sub();
	
	//downcasting-explicit only
	TypeCasting_program t1=(TypeCasting_program) s1; 
	t1.mul();
	t1.div();
	t1.add();
	t1.sub();
	
}
}

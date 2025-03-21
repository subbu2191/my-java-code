package java_programs;

public class This_Keyword1 
{
	int age; //0                    global
	String name;  //null
	double salary;  //0.0
	
	void student_details(int age, String name, double salary)  // 25,ram,8000 -->local
	{
		this.age=age; //this.global variable = local variable
		this.name=name;
		this.salary=salary;
	}
	
public static void main(String[] args)
{
	This_Keyword1 t2=new This_Keyword1();
	t2.student_details(25, "Subbu", 60000);
	System.out.println(t2.age);
	System.out.println(t2.name);
	System.out.println(t2.salary);
}
	
	
	
	
}

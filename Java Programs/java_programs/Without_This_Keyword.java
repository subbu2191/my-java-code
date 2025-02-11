package java_programs;

public class Without_This_Keyword 
{
int age; //0                    global
String name;  //null
double salary;  //0.0

void student_details(int age, String name, double salary)  // 25,ram,8000 -->local
{
	System.out.println("Non-static method");
}
	
	
	
	
public static void main(String[] args)
{
	Without_This_Keyword t1=new Without_This_Keyword();
	t1.student_details(25, "Ram", 8000);
	System.out.println(t1.salary);
	System.out.println(t1.name);
	System.out.println(t1.age);
}
	
	
	
	
}

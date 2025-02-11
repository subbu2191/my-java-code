package Interface_Programs;
interface Google_Auth           //class to interface relationship
{
	void login();
	void logout();    //abstract method-->"abstract word" not needed inside interface
	
}

public class Monday implements Google_Auth
{

	
	
public static void main(String[] args)
{
	Monday M1=new Monday();
	M1.login();
}

public void login()                 //concreate methods overridden in class monday
{
	System.out.println("login");
}

public void logout() 
{
	
	
}


}


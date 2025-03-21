package Interface_Programs;
interface Google
{
	void loginthrough_google_auth();
	void logoutthrough_google_auth();
}

interface Facebook extends Google
{
	void loginthrough_facebook_auth();
	void logoutthrough_facebook_auth();
}



public class Multilevel_Interface implements Facebook

{
public static void main(String[] args) 
{
	Multilevel_Interface M1=new Multilevel_Interface();
	M1.loginthrough_google_auth();
}


public void loginthrough_google_auth()
{
	System.out.println("loginthrough google authorization");
	
}


public void logoutthrough_google_auth() 
{
	
}


public void loginthrough_facebook_auth()
{
		
}


public void logoutthrough_facebook_auth() 
{

	
}
	
}

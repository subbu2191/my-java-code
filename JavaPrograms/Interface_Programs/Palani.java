package Interface_Programs;
abstract class Tamilnadu
{
	abstract void add();
	abstract void sub();
	
	
}


abstract class Dindigul extends Tamilnadu
{
	void login_logic()
	{
		System.out.println("login logic");
	}
	static void logout_logic()
	{
		System.out.println("logout logic");
	}

	
}

public class Palani extends Dindigul
{
	void add()
	{
		System.out.println("Addition");
	}
	void sub() 
	{
		
	}
void voice_chat()
{
	System.out.println("chatting via voice");
}

void video_chat()
{
	System.out.println("chatting via video");
}

	
public static void main(String[] args)	
{
Palani P1=new Palani();
P1.voice_chat();
P1.video_chat();
P1.add();
P1.login_logic();
	
	
	
	
}
	
	
	
}

package Class42to46_Java_concepts;

class Google_Auth
{
	private String apikey="b24fgh34356ghjkh";
	
	public void setapikey(String apikey)
	{
		this.apikey=apikey;
	}
	
	public String getapikey()
	{
		return apikey;
	}
}

public class return_keyword_program 
{
public static void main(String[] args) 

{
	Google_Auth g1=new Google_Auth();
	g1.setapikey("s123u567");
	System.out.println(g1.getapikey());
}
}

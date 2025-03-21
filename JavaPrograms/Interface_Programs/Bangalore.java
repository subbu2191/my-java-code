package Interface_Programs;
abstract class Delhi
{
	abstract void delhi_roads();     //abstract method
	abstract void delhi_hospitals();
}



public class Bangalore extends Delhi
{
	void delhi_roads()
	{
		System.out.println("logic1");
	
	}

	void delhi_hospitals()
	{
		System.out.println("logic2");
	}
		
	
	
	
public static void main(String[] args)
{
	Bangalore b1=new Bangalore();
	b1.delhi_roads();
	b1.delhi_hospitals();
	 
}

	
	
}

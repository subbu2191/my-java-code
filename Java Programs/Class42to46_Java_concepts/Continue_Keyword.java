package Class42to46_Java_concepts;

public class Continue_Keyword 
{
public static void main(String[] args) 
{
	for(int i=0;i<=5;i++)
	{
		if (i==4)
		{
			continue;        //skip iteration
		}
		
		System.out.println(i);
	}
}
}

package Arrays_Java;

import java.util.Arrays;

public class Arrays_Example1 

{
	public static void main(String[] args)
	{
		String [] name=new String[3];
		name[0]="Karthick";
		name[1]="Subbu";
		name[2]="Booban";
		// name[3]="Harini";
		
		
		System.out.println(name[0]);
		System.out.println(name[1]);
		System.out.println(name[2]);
		// System.out.println(name[3]);
		
		
		for(int i=0;i<3;i++)            // for loop
		{
			System.out.println(name[i]);
		}
		
		System.out.println(Arrays.toString(name));   //output is [0, 1, 2]
	}

}

package MathClass;

public class CircleArea_forloop
{
final static double pi=Math.PI;

public static void main(String args[])
{
	
for(int i=0;i<10;i++)	
{
	double r=Math.random();    //keep on changing, so inside for loop
	double area=pi*r*r;
	System.out.println(area);
}
	
	
}	
	
}


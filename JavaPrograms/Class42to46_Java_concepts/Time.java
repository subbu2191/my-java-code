package Class42to46_Java_concepts;

import java.util.Date;

public class Time 
{
public static void main(String[] args) 
{
	Date d1=new Date();
	System.out.println("Epoch Time: " +d1.getTime());     //epoch time -->Machine understandable time
	
	
    Date d2=new Date(d1.getTime());
    System.out.println("Current Time: " +d2);            //Current time
    String human=d2.toString();                          //toString
    String Day=human.substring(0, 3);
    System.out.println("Day: " +Day);
    
    String Month=human.substring(4, 7);
    System.out.println("Month: " +Month);
    
    
    String Year=human.substring(24);              //Assignment to find year
    System.out.println("Year: " +Year);
    
    
    Date d3=new Date(d1.getTime()+(1000*60*60*24*1));
    System.out.println("Future Time 1 day: " +d3);             //Future Time(1-->Number of days)
    
    Date d4=new Date(d1.getTime()+(1000*60*60*24*2));
    System.out.println("Future Time 2 days: " +d4);   
    
    Date d5=new Date(d1.getTime()-(1000*60*60*24*1));     //Past time
    System.out.println("Past Time: " +d5);   
    
}
}

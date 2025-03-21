package Collection_Programs;

public class Assignment_convert_byte_into_int 

{
public static void main(String[] args)

{
	//Assignment 1--> widening-implicit
	
	byte b1=127;
	int a=b1;
	System.out.println("implicit " +a);
	
	//widening-explicit
	
	int a1=(int) 127;
	System.out.println("explicit " +a1);
	
	//Assignment 2--> int into byte 
	//Narrowing-implicit throws error
	
	/*int a2=98759;
	byte b2=a2;
	*/     
	//type mismatch error-cannot convert into to byte
	
	//Narrowing-explicit
	byte b3=(byte) 98765;
	System.out.println("Narrowing-explicit " +b3);
	
	//Assignment 3: convert double into float
	//widening-explicit
	float f1=(float) 87.8765436554;
	System.out.println("Float value " +f1);
	

	
	
}
}

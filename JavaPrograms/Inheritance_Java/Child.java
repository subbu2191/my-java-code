package Inheritance_Java;
class Father1
{
	static void house()
	{
	System.out.println("father have house");	
	}
	static void car()
	{
		System.out.println("father have car");
	}
	
	
}
public class Child extends Father1
{
	static void laptop()
	{
		System.out.println("child have laptop");	
	}
	static void bike()
	{
		System.out.println("child have bike");
	}
	
	
	
	
	public static void main(String args[])     // Single level Inheritance
	{
		laptop();
		bike();
		car();
		house();
	
	}
}

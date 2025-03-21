package Interface_Programs;

interface Karnataka
{
	void state_election();
	void state_airport();
}

interface Kerala
{
	void state_sea();
	void state_factory();
}



public class Multiple_level_Interface implements Karnataka, Kerala

{

public static void main(String[] args)
{
	Multiple_level_Interface M1=new Multiple_level_Interface();
	M1.state_sea();
	M1.state_election();
	M1.state_factory();
	M1.state_airport();
}


public void state_sea()
{
	System.out.println("sea");
}


public void state_factory()
{
	System.out.println("factory");
	
}


public void state_election() 
{
	System.out.println("election");
	
}


public void state_airport()
{
	
	System.out.println("airport");
}
	
	
}

package progams;

public class Forrunstatic implements forstatica,forstaticb
{

	public static void main(String[] args) 
	{
	 forstatica.addition();
	 forstaticb.addition();
	 
	Forrunstatic aa=new Forrunstatic();
	aa.substraction();
	
	}

	@Override
	
	public void substraction() 
	{
		// TODO Auto-generated method stub
		forstatica.super.substraction();
		
		forstaticb.super.substraction();
	}

	
}

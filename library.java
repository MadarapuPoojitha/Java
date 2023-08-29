class Main
{
	public static void main(String args[] )
	{
	int days=35;
	if(days<=5)
	{
	System.out.println("the fine is 0.50");
	}
	else if(days<=10)
	{
	System.out.println("the fine is 1 rupee");
	}
	else if(days>=15 && days<=30)
	{
	System.out.println("the fine is 5 rupees");
	}
	else if(days>30)
	{
	System.out.println("the membership will be cancelled");
	}
}
}
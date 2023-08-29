class Main

{
	public static void main(String args[])
	{
	int hardness=40;
	double carbon=0.9;
	int tensile=562;
	if(hardness>50 && carbon<0.7 && tensile>5600)
	{
        System.out.println("Grade is 10");
	}
  	else if(hardness>50 && carbon<0.7)
	{
        System.out.println("Grade is 9");
	}
	else if(hardness>50   &&  tensile>5600)
	{
	System.out.println("Grade is 8");
	System.out.println("Grade is 7");
	}
	else if(hardness>50)
        {
        System.out.println("Grade is 6");
	}
        else
	{
        System.out.println("Grade is 5");
	}
}
}
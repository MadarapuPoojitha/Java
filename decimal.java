class Main
{
	public static void main(String args[] )
	{
	double x=25.585,y=25.5859;
	x=Math.round(x*1000);
	x=x/1000;
	y=Math.round(y*1000);
	y=y/1000;
	if(x==y)
	System.out.println("they are same upto 3 decimals");
	else
	System.out.println("they are different");
	}
}
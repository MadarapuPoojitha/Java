class Main
{
	public static void main(String args[] )
	{
	int a=30,b=10,c=40;
	System.out.println("Before Swapping:" +a+" " +b+"   " +c);
	if(a<b)
	{
	a=a+b;
	b=a-b;
	a=a-b;
	}
	if(a<c)
	{
	a=a+c;
	c=a-c;
	a=a-c;
	}
	if(b<c)
	{
	b=b+c;
	c=b-c;
	b=b-c;
	}
	System.out.println( a);
	System.out.println(b);
	System.out.println( c);
	}
	}
	
	
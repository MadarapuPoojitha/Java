class Main
{
	public static void main(String args[] )
	{
	int x=1,n=50,sum=0,mul=1;
	while(x<=n)
	{
	if(x%2==0)
	{
	System.out.println(x);
	x+=2;
	sum=sum+x;
	}

	}
     System.out.println("the sum is:" + sum);
	else
       {
      mul=mul*x;
	}
	System.out.println(mul);

}
}
	
class Main

{
	public static void main(String args[])
	{
	char c='1';
	int a=(char)c;
	if(a>=65 && a<=90)
	{
	System.out.println("upper case");
          }
        
	else if(a>=97 && a<=122)
        {
	System.out.println("Lower case");
	}
	else if(a>=48 && a<=57)
	{
	System.out.println("Special character");
	}
	else 
	{
	System.out.println("Digit");
	}
}
}
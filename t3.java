class Main

{
	public static void main(String args[])
	{
	int n=210;
	System.out.println((n>=0 && n<=9)?("single digit"):(n>=10 && n<=99)?("double digit"):(n>=100 && n<=999)?("three digit"):"not");
	}
}
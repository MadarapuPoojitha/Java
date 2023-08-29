class Main
{
	public static void main(String args[] )
	{
	int a=10,b=2;
	char op='*';
	switch(op)
	{
        case '+':System.out.println(a+b);
	break;
	case '-':System.out.println(a-b);
	break;
	case '*':System.out.println(a*b);
	break;
	case '%':System.out.println(a%b);
	break;
	default:System.out.println("not a arithmetic operator");
	}
}
}
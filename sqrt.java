class Main
{
	public static void main(String args[] )
        {
        int a=2,b=10,c=4;
        double d;
        d=(Math.pow(b,2)-(4*a*c));
        double e=(-b+Math.sqrt(d))/(2*a);
        double f=(-b-Math.sqrt(d))/(2*a);
        System.out.println( e);
        System.out.println(f);
        }
}    
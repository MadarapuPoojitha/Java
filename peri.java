class Main
{
	public static void main(String args[] )
	{
	int length=5,breadth=4;
	double area,peri;
	area=length*breadth;
	peri=2*(length+breadth);
	if(area>peri)
	{
	System.out.println("Area of Rectangle is greater than perimeter");
	}
	else 
	{
	System.out.println("Area of Rectangle is less than perimeter");
	}
	}
}
class Main
{
	public static void main(String args[] )
	{

	int basic_sal=25000;
	double ta=15,da=12,hra=19,total,pf,tax,grosssal;
	ta=(15/100)*basic_sal;
	da=(12/100)*basic_sal;
	hra=(19/100)*basic_sal;
	total=basic_sal+ta+da+hra;
	if(total>75000)
	{
	pf=(11/100)*basic_sal;
	tax=(5/100)*basic_sal;
	}
	else
	{
	pf=(7/100)*basic_sal;
	tax=(2.5/100)*basic_sal;
	}
	grosssal=total-pf-tax;
	System.out.println(grosssal*12);
	}
}
	
	
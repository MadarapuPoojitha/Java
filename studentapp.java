class Main
{
	public static void main(String args[] )
	{
	int s1=75,s2=65,s3=76,s4=44,s5=90,s6=37;
	int section;
	int fee=74000,schloarship,donation;
	int total=s1+s2+s3+s4+s5+s6;
	double percentage=(total/600.0)*100;
	String grade;
	if(percentage>80)
	{
	section='A';
	schloarship=10000;
	donation=0;
	grade="distinction";
         }
	else
	{
	section='B';
	schloarship=0;
	donation=1500;
	grade="fail";
	}
	fee=fee+donation-schloarship;
        System.out.println(grade  + "  Total fee to be paid is=  " + fee );
	}
}
	
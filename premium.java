class Main

{
	public static void main(String args[])
	{
	int age=27;
	double premium;
	String gender="male";
	String lives="city";
	double amount=0;
	String health="excellent";
	
	if(age>=25 && age<=35 && gender=="male"  && lives=="city" && health=="excellent")
	{
		premium=(4/1000.0)*200000;
		System.out.println("premium is " + premium);
	}
	else if(age>=25 && age<=35 && gender=="female" && lives=="city" && health=="excellent")
	{
	       premium=(3/1000.0)*100000;
		System.out.println("premium is:" + premium);
         }
	else if(age>=25 && age<=35 && gender=="male" && lives=="village" && health=="poor")
	{
	  premium=(6/1000.0)*10000;
	  System.out.println(premium);
	}
	else
	{
	System.out.println("person is not insured");
	}
	
	


}
}

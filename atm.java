class Main
{
	public static void main(String args[] )
	{
	String language1="telugu",lan2="hindi",lan3="english";
	String typeacc="cashwithdrawl",type1="savings";
	int pin=1234,avaamount=2000,amt=1000;
	System.out.println("Insert ATM card");
	if(language1=="telugu" || lan2=="hindi" || lan3=="english")
	{
	System.out.println("Select Language:" + lan3);

		 if(pin==1234)
			{
			System.out.println("Enter 4-digit pin:" +   pin);
			}
		else
			{
			System.out.println(" Please Enter a valid  pin:" );
			}
		
	}
    if(amt>0 && amt<=avaamount)
	{
	System.out.println("amount to withdraw:" +amt);
	}
  else
   {
    System.out.println("Balance is insufficient");
     }
 if(typeacc=="cashwithdrawl" || type1=="savings")
	{
	System.out.println("Account type:" + typeacc);
       }
 else
{
       System.out.println("Enter a valid account type");
}
System.out.println("collect the amount");
System.out.println("Thanks for visiting");
}
}
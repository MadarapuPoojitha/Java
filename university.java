class Main
{
	public static void main(String args [] )
	{
	int main_sub=1,subs_sub=5;
	if(main_sub>=55 && subs_sub>=65)
	{
	System.out.println("passed");
	}
	else if(main_sub<=45 && subs_sub>=55)
	{
	System.out.println("he should get atleast 45 percent in A ");
	}
	else if(main_sub>=65 && subs_sub<=45)
	{
	System.out.println("allowed to reappear in an examination in B to qualify");
	}
	else
	{
	System.out.println("Failed");
	}
}
}
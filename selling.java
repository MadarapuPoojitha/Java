class Main

{
	public static void main(String args[])
	{
	int cost_price=600;
	int selling_price=1900;
	if(cost_price<selling_price)
	{
	int profit=selling_price-cost_price;
	System.out.println(profit);
	}
        else 
	{
	int loss=cost_price-selling_price;
	System.out.println(loss);
	}
}
}
	
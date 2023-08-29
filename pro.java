class Main
{
	public static void main(String args[] )
	{
 	String name="Laptop bag";
        String color="Blue";
        double price=3000;
        double discountoff=10;
        double bank_off=5;
        double discount,b_off;
	double quantity=2;
        double total=quantity*price;
        System.out.println("total:" + total);
        if(quantity<=15)
        {
        discount=(discountoff/100)*price;
        System.out.println("if:"+ discount);
	}
        else
	{
	b_off=(bank_off/100)*price;
        System.out.println("else:" + b_off);
 	}
        }
}
        
        
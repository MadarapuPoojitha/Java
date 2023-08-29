class bag
{
	public static void main(String args[] )
        {
        String a="laptopbag";
        String color="Blue";
        double actualprice=2999;
        double offer=79,couponsoff=10;
        double discount=(offer/100)*actualprice;
        double maxprice=actualprice-discount;
         double coupons=(couponsoff/100)*actualprice;
         double amount=maxprice-coupons;
         System.out.println("ITEM ORDERED =" + a);
         System.out.println("ACTUAL PRICE OF THE BAG = " + actualprice);
         System.out.println("COLOR OF THE BAG = " + color);
         System.out.println("DISCOUNT = " + discount);
         System.out.println("MAXIMUM PRICE = " + maxprice);   
         System.out.println("AMOUNT AFTER APPLYING COUPONS= " + coupons);
         System.out.println("AMOUNT = " + amount);
         
        
         
         }
}     
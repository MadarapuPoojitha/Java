class Laptop
{
	public static void main(String args[] )
        {
        String laptop="HP Intel Core i5 11th Gen";
        double originalprice=56903,maxprice;
         double offer=4,offers=10;
         double discount = (offer/100)*originalprice;
         maxprice=originalprice-discount;
         double bank_offers=(offers/100)*maxprice;
         System.out.println("Product Ordered:" + laptop);
         System.out.println("ORIGINAL PRICE:" + originalprice);
         System.out.println("DISCOUNT PRICE:" + discount);
         System.out.println("MAX PRICE:" + maxprice);
         System.out.println("BANK OFFER:" + bank_offers);
         double amount=maxprice-bank_offers;
         System.out.println(" Total AMOUNT TO PAY:" + (amount-7000));
         
       
       
       
        
        }
}
        
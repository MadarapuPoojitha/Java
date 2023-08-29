class Phone
{
	public static void main(String args[ ] )
        {
        String phone="APPLE iPhone 14(Blue,128 GB)";
        double maxprice=79900;
        double off=14;
        double pack=99;
        double discount=off/100*maxprice;
        System.out.println("DISCOUNT:" +discount);
        maxprice=maxprice-discount;
        System.out.println("MAXPRICE:" + maxprice);
        maxprice=maxprice+pack;
        double bankoffer=5/100.0*maxprice;
         System.out.println("BANK OFFER:"+bankoffer);
         maxprice=maxprice-bankoffer;
         System.out.println("FINAL MAX PRICE:"+(maxprice-7000));
         }
}
     
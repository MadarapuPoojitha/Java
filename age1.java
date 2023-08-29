class Main
{
	public static void main(String args[] )
        {
        int present_year=2023,birth_year=2002,days_month=30;
         int year=12;
          int age = present_year-birth_year;
         int months=year*age%365;
         int days=days_month*months;
         int daily_hours=24;
         int hours=daily_hours*days;
         int min=60;
         int sec=3600;
         int minutes=hours*min;
        int seconds=hours*3600;
         System.out.println(age);
         System.out.println(months);
         System.out.println(days);
         System.out.println(hours);
         System.out.println(minutes);
         System.out.println(seconds);
         
          
          
         }
}
        
        
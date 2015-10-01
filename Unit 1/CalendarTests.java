package Stuff;

import java.util.*;


public class CalendarTests 
{
	public static void main(String[] args) 
	{
	    Scanner scan = new Scanner(System.in);
	    System.out.println ("Enter the number of times that you want to run this program");
	    int t = scan.nextInt();
	   
	    for (int i = 0; i < t; i++) 
	    {
	      System.out.println ("Enter the month");
	      int month = scan.nextInt();
	      
	      System.out.println ("Enter the day");
	      int day = scan.nextInt();
	      
	      System.out.println ("Enter the year");
	      int year = scan.nextInt();
	      
	      MyCalendar myCal = new MyCalendar(year, month, day);
	      
	      System.out.println ("The day of the week is " + myCal.getDayOfWeek ());
	      //Use myCal to compute answer; print answer
    }
	    scan.close();
}
	}


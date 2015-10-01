package Stuff;

import java.util.*;

public class MyCalendar 
{	
	Calendar cal = new GregorianCalendar();
	public  MyCalendar(int d, int m, int y) 
	{
		date = d;
		month = m - 1;
		year = y;	
		cal.set(date,month,year);
	}

	public String getDayOfWeek() 
	{
		int dayOfweek = cal.get(Calendar.DAY_OF_WEEK);
		
		if (dayOfweek == Calendar.SUNDAY) 
		{
			return  "Sunday";
		}
		else if (dayOfweek == Calendar.MONDAY) 
		{
			return "Monday";
		}
		else if (dayOfweek == Calendar.TUESDAY) 
		{
			return "Tuesday";
		}
		else if (dayOfweek == Calendar.WEDNESDAY) 
		{
			return "Wednesday";
		}
		else if (dayOfweek == Calendar.THURSDAY) 
		{
			return "Thursday";
		}
		else if (dayOfweek == Calendar.FRIDAY) 
		{
			return "Friday";
		}
		else 
		{
			return "Saturday";
		}

	}
	
	private int year;
	private int date;
	private int month;
	
}
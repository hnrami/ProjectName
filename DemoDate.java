package com.jiohealth.demoPropeties;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DemoDate {

	
	public static void main(String argc[]) throws Exception {
		
		String date[]=todayDate().split("/");

		System.out.println("firstDayOFmonth:"+getFirstDay(Integer.parseInt(date[0]), Integer.parseInt(date[1])));
		System.out.println("lastdayofmonth"+getLastDay(Integer.parseInt(date[0]), Integer.parseInt(date[1])));
		

		
	}
	
	public static String todayDate() {
	
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd ");
		Date date = new Date();
		return dateFormat.format(date);
	}
	
	public static String getFirstDay(int year, int month) throws Exception
    {
		GregorianCalendar calendar = new GregorianCalendar();
		month = month - 1;
		calendar.set(year, month, 1); 
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		Date date = calendar.getTime();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		return formatter.format(date);
    }
 
    public static String getLastDay(int year, int month) throws Exception
    {
		GregorianCalendar calendar = new GregorianCalendar();
		month = month - 1;
		calendar.set(year, month,1);
		calendar.set(Calendar.DAY_OF_MONTH, (calendar.getActualMaximum(Calendar.DAY_OF_MONTH)));
		Date date = calendar.getTime();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		return formatter.format(date);
    }
}

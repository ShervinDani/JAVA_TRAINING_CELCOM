package com.celcom.day8;
import java.util.Calendar;
public class CalendarExample1 {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(c.YEAR));
		System.out.println(c.get(c.MONTH));
		System.out.println(c.getTime());
		System.out.println(c.getAvailableCalendarTypes());
		System.out.println(c.getCalendarType());
	}

}

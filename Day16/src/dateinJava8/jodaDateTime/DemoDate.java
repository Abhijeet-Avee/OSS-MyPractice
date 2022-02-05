package dateinJava8.jodaDateTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DemoDate {

	public static void main(String[] args) {
		// ---------how to use mordern java date time api--------------------
//		LocalDate date=LocalDate.now();
//		System.out.println(date);
//		System.out.println(date.getMonth());
//		System.out.println(date.getYear());
//		System.out.println(date.getDayOfMonth());
//	
		// ----------custom date------------
//		LocalDate date=LocalDate.of(2011, Month.JANUARY	, 12);
//		
//		System.out.println(date);
//		System.out.println(date.getMonth());
//		System.out.println(date.getYear());
//		System.out.println(date.getDayOfMonth());

		// yyyy-MM-dd
		// dd/MM/yyyy
//		String dateString="2019-11-11";
//		
//		LocalDate date=LocalDate.parse(dateString);
//		
//		System.out.println(date);
//		System.out.println(date.getMonth());
//		System.out.println(date.getYear());
//		System.out.println(date.getDayOfMonth());

		
//		String dateString = "11/02/2019";
//
//		DateTimeFormatter fmt=DateTimeFormatter.ofPattern("dd/MM/yyyy");
//		
//		LocalDate date = LocalDate.parse(dateString, fmt);
//
//		System.out.println(date);
//		System.out.println(date.getMonth());
//		System.out.println(date.getYear());
//		System.out.println(date.getDayOfMonth());
		
		
		
//		LocalDate todayDate = LocalDate.now();
//		LocalDate bday = LocalDate.of(2007, Month.MAY, 11);
//		
//		Period period=Period.between(bday, todayDate);
//		System.out.println(period.getDays());
//		System.out.println(period.getMonths());
//		System.out.println(period.getYears());
		
		
	LocalTime localTime=LocalTime.now();
	System.out.println(localTime);
		

		// joda date and time api: open source project :)

		// Date : util vs sql
		// date is mutable ,performace is bad
//		Date date=new Date(12, 12, 12);
//		System.out.println(date);
	}
}
package desigmPattern.creational;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePOC {
	public static void main(String[] args) throws ParseException {
		//date: Util[otherwise]	vs sql[jdbc]
		//Date is mutable..
//		Date date = new Date(2011, 12, 12);
//		System.out.println(date);
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		Date date = dateFormat.parse("21/11/2021");
		System.out.println(date);
		
		//How to convert util date to sql date; util date--->sql date
		java.sql.Date date2 = new java.sql.Date(date.getTime());
	}
}

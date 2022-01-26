package day1;

import java.util.Scanner;

public class NextDate {
	int day,month,year;
	private static Scanner in;
	private static String date;
	
	public boolean isLeapYear(int year)
	{
		if((year%4 ==0) && (year%400 == 0 || year%100 !=0))
			return true;
		return false;
	}
	
	public void parseDate(String date)
	{
		String []tempD = date.split("/");
		day = Integer.parseInt(tempD[0]);
		month = Integer.parseInt(tempD[1]);
		year = Integer.parseInt(tempD[2]);
	}
	
	public void calDate(String date)
	{
		int noOfDays[] = {-1,31,28,31,30,31,30,31,31,30,31,30,31};
		parseDate(date);
		if(isLeapYear(year)) {
			noOfDays[2]=29;
		}
		day = day + 1;
		if(day>noOfDays[month])
		{
			day = 1;
			month++;
			if(month>12)
			{
				month = 1;
				year++;
			}
		}
		System.out.println("Next date: "+ day+"/"+month+"/"+year);
	}
		
	public static void main(String[] args) {
		
		in = new Scanner(System.in);
		System.out.print("Enter today's date: ");
		date = in.nextLine();
		NextDate n = new NextDate();
		n.calDate(date);
	}
}

package date.time;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class GregorianCalenderExample {

	public static void main(String[] args) {
		GregorianCalendar gregorianCalendar= new GregorianCalendar();
		System.out.println("Date: "+ gregorianCalendar.get(Calendar.DATE)+"/"+gregorianCalendar.get(Calendar.MONTH)+"/"+gregorianCalendar.get(Calendar.YEAR));
		System.out.println("Time: "+ gregorianCalendar.get(Calendar.HOUR)+"/"+gregorianCalendar.get(Calendar.MINUTE)+"/"+gregorianCalendar.get(Calendar.SECOND));
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Year to be checked: ");
		int year = scanner.nextInt();
		scanner.close();
		boolean leapYear = gregorianCalendar.isLeapYear(year);
		System.out.println("Leap Year: "+ leapYear);
		
	}
}

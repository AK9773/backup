package date.time;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateAndTime {

	public static void main(String[] args) {

		Date currentDate = new Date();
		System.out.println(currentDate.toString());
		System.out.println(currentDate.getClass().getSimpleName());
		
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
		String format = simpleDateFormat.format(currentDate);
		System.out.println(format);
		System.out.println("Current Date and time: " + format);

		
		System.out.printf("%s %tB %<te, %<tY", "Date: ", currentDate);

		
		
		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy/MM/dd");
		String date = "2022/06/22";
		try {
			System.out.println("\n" + simpleDateFormat2.parse(date));
			//Thread.sleep(10000);
			//System.out.println(simpleDateFormat2.parse(date));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			long start = System.currentTimeMillis();
			System.out.println(currentDate.toString());
			Thread.sleep(5000);
			System.out.println(currentDate.toString());
			long end = System.currentTimeMillis();
			System.out.println("Time Elapsed: "+ (end-start));
		}
		catch(Exception e){
			
			System.out.println(e.getMessage());
		}
		
		
	}

}

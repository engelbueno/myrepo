package date;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class DateZeroSample {
	public static void main(String[] args) {
		// Requirement: Display current month and day in number.
		// Old Java
		Date date = new Date();
		int monthInNumber = date.getMonth();
		int dayInNumber = date.getDay();
		
		System.out.println(monthInNumber);
		System.out.println(dayInNumber);
		
		// Java 8
		LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		int monthInNumberJava8 = localDate.getMonthValue();
		int dayInNumberJava8 = localDate.getDayOfWeek().getValue();
		
		System.out.println(monthInNumberJava8);
		System.out.println(dayInNumberJava8);
	}
}

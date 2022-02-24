package date;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;

public class LocalDateSample {
	public static void main(String[] args) {
		// Requirement: Display date in YYYY-MM-DD format
		// Old Java
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DATE, 1);
		Date date = c.getTime();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(format.format(date));
		
		// Java 8
		LocalDate tomorrow = LocalDate.now().plusDays(1);
		System.out.println(tomorrow);
		
		LocalDate payday = LocalDate.now()
				.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println(payday);
		
	}
}

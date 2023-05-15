package ch12.sec08;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeCompareExample {

	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd.aHH:mm:ss");
		
		LocalDateTime starDateTime = LocalDateTime.of(2021, 1, 1, 0, 0, 0); 
		System.out.println("시작일: " + starDateTime.format(dtf));
		
		LocalDateTime endDateTime = LocalDateTime.of(2021, 12, 31, 0, 0, 0);
		System.out.println("종료일: " + endDateTime.format(dtf));
		
		if(starDateTime.isBefore(endDateTime)) { //endDateTime보다 이전 날짜인지?
			System.out.println("진행 중 입니다.");
		} else if (starDateTime.isEqual(endDateTime)) { // 같은 날짜인지?
			System.out.println("종료 합니다");
		} else if (starDateTime.isAfter(endDateTime)) { // endDateTime 이후 날짜인지?
			System.out.println("종료 했습니다.");
		}
		
		long remainYear = starDateTime.until(endDateTime, ChronoUnit.YEARS);
		long remainMonth = starDateTime.until(endDateTime, ChronoUnit.MONTHS);
		long remainDay = starDateTime.until(endDateTime, ChronoUnit.DAYS);
		
		System.out.println("남은 해: " + remainYear);
		System.out.println("남은 달: " + remainMonth);
		System.out.println("남은 일: " + remainDay);
	}

}

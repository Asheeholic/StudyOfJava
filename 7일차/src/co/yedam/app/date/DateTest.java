package co.yedam.app.date;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Date date = new Date();
		//System.out.println(System.currentTimeMillis());
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH);
		int day = now.get(Calendar.DAY_OF_MONTH);
		int dayYear = now.get(Calendar.DAY_OF_MONTH);
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		System.out.println(dayYear);
		System.out.println();
		//살아온 일수
		Calendar birth = Calendar.getInstance();
		birth.set(1995, 1 -1, 18); // 월은 하나 빼서
		long dur = now.getTimeInMillis() - birth.getTimeInMillis();
		dur = dur/1000/60/60/24;
		System.out.println("일수 : " + dur);
		//지난기념일 계산
		Calendar memory = Calendar.getInstance();
		memory.set(2013, 2 -1, 16); // 월은 하나 빼서
		long dur2 = now.getTimeInMillis() - memory.getTimeInMillis();
		dur2 = dur2/1000/60/60/24;  // 1000으로 나눠야 '초'부터 시작
		System.out.println("기념일 일수 : " + dur2);
		
		LocalDate currentDate = LocalDate.now();
		System.out.println(currentDate.getYear() + "/" + currentDate.getMonthValue() + "/" + currentDate.getDayOfMonth());
		
		System.out.println(currentDate.plusDays(100)); //100일 후
		
		//
		//Date -> String
		SimpleDateFormat df = new SimpleDateFormat("yyyy.MM.dd EEE G 'at' HH:mm:ss z");
		System.out.println(df.format(now.getTime()));
		
		//String -> Date
		
	}
}

package co.memo.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	//Date -> String
	
	static String format = "yyyy.MM.dd";
	// 정해진 형식에 날짜 타입을 넣어서 스트링으로 제출
	public static String dateToStr(Date date) {
		SimpleDateFormat df = new SimpleDateFormat(format);
		String s = df.format(date);
		return s;
	}
	// 형식을 대입해서 스트링으로 나옴
	public static String dateToStr(Date date, String format) {
		SimpleDateFormat df = new SimpleDateFormat(format);
		String s = df.format(date);
		return s;
	}
	
	//두 날짜 사이의 일수 계산
	public static long durationDay(Date d1, Date d2) {
		long result = 0;
		if (d1.getTime() > d2.getTime()) {
			result = d1.getTime() - d2.getTime();			
		} else {
			result = d2.getTime() - d1.getTime();
		}
		result = result/1000/60/60/24;
		return result;
	}
	// 특정날과 다른 특정날의 차이 일수
	public static long durationDay(String s1, String s2) {
		SimpleDateFormat df = new SimpleDateFormat(format);
		Date d1;
		Date d2;
		long result = 0;
		try {
			d1 = df.parse(s1); // 클래스에 맞게 분석해서 리턴함
			d2 = df.parse(s2);
			if (d1.getTime() > d2.getTime()) {
				result = d1.getTime() - d2.getTime();			
			} else {
				result = d2.getTime() - d1.getTime();
			}
			result = result/1000/60/60/24;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return result;
	}
	// 그 달의 최대 일수
	public static int lastDay(int year, int month) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month+1, 1);
		int a = cal.getActualMaximum(Calendar.DAY_OF_MONTH); // 설정된 날짜에서 클래스 상수를 이용해서 가져옴.
		
		return a;
		
	}
}

package pkg.other;

import java.util.Date;

import pkg.friend.util.DateUtil;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(DateUtil.dateToStr(new Date()));
		System.out.println(DateUtil.dateToStr(new Date(), "yyyy"));
		System.out.println(DateUtil.durationDay(new Date(), new Date(2021, 5, 20)));
		System.out.println(DateUtil.durationDay("2021.06.03", "2021.06.02"));
		System.out.println(DateUtil.lastDay(2021, 3));
	}

}

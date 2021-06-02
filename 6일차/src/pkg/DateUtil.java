package pkg;

public class DateUtil {
	
	//접근제어자 private > default > protected 			> public
	//								다른패키지 - 상속
	
	public static String curDate() {
		return ""; // 정적 메소드 안에서는 일반적 인스턴스 필드를 가져올 수 없음.
		// 정적 필드만 가져올 수 있음
	}
	
	
}

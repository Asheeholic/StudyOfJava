package co.friend.util;

import java.text.SimpleDateFormat;
import java.util.Scanner;

import co.friend.model.Friend;

public class ScannerUtil {
	static Scanner scanner = new Scanner(System.in);
	
	public static int readInt(String prompt) { // 시그니쳐
		System.out.print(prompt+ ">");
		return readInt();
	}
	
	public static int readInt() {
		int result = 0;
		while(true) {
			try {
				String temp = scanner.next();
				result = Integer.parseInt(temp);
				break;
			} catch (Exception e) {
				System.out.println("숫자 형식이 아닙니다.");
			}
		}
		return result;
	} // 예외처리, while, 
	public static String readStr(String prompt) { // 프롬프트 출력
		System.out.print(prompt);
		System.out.print(">");
		return readStr();
	}
	
	public static String readStr() {
		String result = "";
		try {
			result = scanner.next();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public static String readDate(String prompt) { // 프롬프트 출력
		System.out.print(prompt);
		System.out.print(">");
		return readStr();
	}
	
	public static String readDate() {
		String result = "";
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
		do {
			try {
				result = scanner.next();
				df.parse(result.trim()); // trim : 공백 제거
				break;
			} catch (Exception e) {
				System.out.println("'yyyyMMdd' 날짜 형식이 아닙니다.");
			}
		} while(true);
		return result;
	}
	
	public static Friend readFriend() {
		System.out.println("구분, 이름, 전화번호>");
		String result = scanner.next();
		String[] arr = result.split(","); 
		Friend friend = new Friend(); // 배열을 넣어서 하는방법도 가능
		// Friend friend = new Friend(arr); 이럴 경우 배열을 넣게 만드는 생성자를 만들어야함.
		friend.setGubun(arr[0]);
		friend.setName(arr[1]);
		friend.setTel(arr[2]);
		return friend;
	}
}

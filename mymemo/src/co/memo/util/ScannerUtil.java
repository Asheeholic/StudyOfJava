package co.memo.util;

import java.text.SimpleDateFormat;
import java.util.Scanner;

import co.memo.model.Memo;

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
				String temp = scanner.nextLine();
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
			System.out.print("내용 > ");
			result = scanner.nextLine();
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
				System.out.print("날짜 >");
				result = scanner.nextLine();
				df.parse(result.trim()); // trim : 공백 제거
				break;
			} catch (Exception e) {
				System.out.println("'yyyyMMdd' 날짜 형식이 아닙니다.");
			}
		} while(true);
		return result;
	}
	
	public static Memo readMemo() {
		System.out.print("날짜>");
		String date = scanner.nextLine();
		System.out.print("내용>");
		String content = scanner.nextLine();
		Memo memo = new Memo(date, content); // 배열을 넣어서 하는방법도 가능
		// Friend friend = new Friend(arr); 이럴 경우 배열을 넣게 만드는 생성자를 만들어야함.
//		memo.setDate(date);
//		memo.setContent(content);
		return memo;
	}
	
	public static String readContent(String prompt) { // 프롬프트 출력
		System.out.print(prompt);
		System.out.print(">");
		return readContent();
	}
	
	public static String readContent() {
		StringBuffer result = new StringBuffer();
		try {
			String a = "";
			while (true) {
				a = scanner.nextLine();
				if (a == null || a.trim().equals(".end")) {
					break;
				}
				result.append(a).append("\n");
			}
		} catch (Exception e) {
			System.out.println("제대로 입력되지 낳았습니다.");
		}
		return result.toString();
	}
}

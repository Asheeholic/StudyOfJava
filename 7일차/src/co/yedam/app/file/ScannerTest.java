package co.yedam.app.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerTest {	
		
	public static void main(String[] args) throws FileNotFoundException {
		//String str = "1 hi"; // 백준문제 푸는법
		Scanner scanner = new Scanner(new FileInputStream("d:/temp/f.dat"));
		//int a = scanner.nextInt();
		while(true) {
			try {
			String b = scanner.nextLine();
			System.out.println(b);
			} catch(Exception e) {
				break;
			}
		}
	} // 스캐너는 성능이 더떨어지지만 더 편한점이 있음. 마치 파이썬처럼.
}

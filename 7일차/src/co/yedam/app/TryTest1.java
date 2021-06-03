package co.yedam.app;

import java.util.Scanner;

public class TryTest1 {

	public static void main(String[] args) {
		
		try {
			//NullPointerException
			String data = null;
			System.out.println(data.charAt(0));
		} catch(Exception e) {
//			e.printStackTrace();
//			System.out.println(e.getMessage());
		}
		try {
			//ArrayIndexOutOfBoundsException
			int[] arr = new int[5];
			System.out.println(arr[5]);
		} catch(Exception e) {
//			e.printStackTrace();
//			System.out.println(e.getMessage());
		}
		int a = 0;
		
		while(true) {
			try {
				System.out.print("입력> ");
				Scanner scanner = new Scanner(System.in);
				a = scanner.nextInt();
				if(a < 5) {
					break;
				}
			} catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
			
		System.out.println("a: " + a);
		System.out.println("The End \'ㅅ\'");
	}

}

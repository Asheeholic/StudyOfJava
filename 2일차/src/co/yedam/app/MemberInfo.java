package co.yedam.app;

import java.util.Scanner;

public class MemberInfo {

	String name;
	String id;
	String tel;
	double height;
	double weight;
	double bimando;
	Scanner scanner = new Scanner(System.in);

	void heightWeightInput() {
		System.out.println("[필수 정보 입력]");

		System.out.print("1. 키cm : ");
		height = scanner.nextDouble();
		height = height / 100;

		System.out.print("2. 몸무게 : ");
		weight = scanner.nextDouble();

	}

	String bmi() {
		bimando = weight / (height * height);
		String result;

		if (bimando < 18.5) {
			result = "저체중";
		} else if (bimando < 23) {
			result = "정상";
		} else if (bimando < 25) {
			result = "과체중";
		} else {
			result = "비만";
		}

		return result;
	}

	void input() {
		// 코드 작성
		System.out.println("[필수 정보 입력]");

		System.out.print("1. 이름 : ");
		name = scanner.next();

		System.out.print("2. 주민번호 앞 6자리 : ");
		id = scanner.next();

		System.out.print("3. 전화번호 : ");
		tel = scanner.next();

		System.out.println();

	}

	void print() {
		System.out.println("[입력한 내용]");
		System.out.println(name);
		System.out.println(id);
		System.out.println(tel);
	}

}

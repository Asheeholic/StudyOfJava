package co.yedam.app.baseball;

import java.util.Random;
import java.util.Scanner;

/*
 * 임의의 수 3개
 * 사용자 수 입력
 * 스트라이크, 볼 카운트 로직
 */
public class BaseBallApp {
	
	int s;
	int b;
	int c1, c2, c3;
	int u1, u2, u3;
	
	Scanner sc = new Scanner(System.in);
	Random random = new Random();
	
	void makeRnd() {
		// 난수 3개 만들기 c1 = ___;
		c1 = random.nextInt(10);
		c2 = random.nextInt(10);
		c3 = random.nextInt(10);
	}
	
	void input() {
		// 스캐너
		System.out.print("아무 숫자 3개 입력해 주세요! (예시 : 1 2 3) : ");
		u1 = sc.nextInt();
		u2 = sc.nextInt();
		u3 = sc.nextInt();
	}
	
	void count() {
		// s, b 카운트
		if (c1 == u1) {
			s++;
		} else if (c1 == u2 || c1 == u3) {
			b++;
		}
		
		if (c2 == u2) {
			s++;
		} else if (c2 == u1 || c2 == u3) {
			b++;
		}
		
		if (c3 == u3) {
			s++;
		} else if (c3 == u1 || c3 == u2) {
			b++;
		}
		
		System.out.println(String.format("%d스트라이크! %d볼!", s, b));
		System.out.println();
	}
	
	void start() {
		System.out.println("게임을 시작합니다! \n");
		makeRnd();
		System.out.println("1부터 9까지 있는 3개의 난수가 설정되었습니다!");
		System.out.println("마지막 도전은 10번째 입니다!");
		// System.out.println(c1 + " " + c2 + " " + c3); 랜덤숫자 테스트
		int count = 0;
		while(s<3 && count < 10) {
			s = b = 0;
			count++;
			System.out.println(String.format("%d번째 도전입니다!", count));
			input();
			count();
		}
	}
}

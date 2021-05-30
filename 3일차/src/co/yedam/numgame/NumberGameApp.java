package co.yedam.numgame;

import java.util.Scanner;

public class NumberGameApp {
	// 컴 임의의 수 (1~10)
	Scanner scanner = new Scanner(System.in);
	int comNum;
	int myNum;
	void init() {
		this.comNum = (int)(Math.random() * 10) + 1;
	}
	// 사용자가 수를 입력 (잘못 입력하면 다시 쓰게 하기)
	
	void input() {
		System.out.print("(1~10)의 숫자를 입력해 주세요! > ");
		this.myNum = scanner.nextInt();
	}
	// 높다 낮다/false 출력하기
	boolean confirm() {
		boolean check = false;
		if (this.comNum == this.myNum) {
			check = true;
			System.out.println("맞추셨습니다! 대단하시군요!");
		}
		return check;
	}
	// 반복
	void start() {
		init();
		int count = 0;
		System.out.println("총 도전의 기회는 5번!\n컴퓨터가 제시한 1~10 중 숫자를 맞춰 보세요!");
		while(true) {
			count++;
			if (count < 6) {
				System.out.printf("%d번째 도전! ", count);
			} else {
				System.out.println("패배.. ㅠ");
				System.out.printf("컴퓨터의 숫자는 사실 \"%d\" !\n", this.comNum);
				break;
			}
			input();
			if(confirm()) {
				break;
			} else {
				System.out.println("아깝게 틀리셨네요... ㅠㅠ");
			}
		}
		System.out.println("게임 끝!");
	}
}

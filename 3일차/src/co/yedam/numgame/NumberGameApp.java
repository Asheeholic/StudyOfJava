package co.yedam.numgame;

public class NumberGameApp {
	// 컴 임의의 수 (1~10)
	void init() {
		
	}
	// 사용자가 수를 입력 (잘못 입력하면 다시 쓰게 하기)
	void input() {
		
	}
	// 높다 낮다/false 출력하기
	boolean confirm() {
		boolean check = true;
		return check;
	}
	// 반복
	void start() {
		init();
		while(true) {
			input();
			if(confirm()) {
				break;
			}
		}
	}
	
}

package co.yedam.star;

public class StarApp {
	
	// 직각 삼각형 출력
	void draw(int a) {
		for(int i=1; i<=a; i++) {
			System.out.println(pad('#', i));
		}
	}
	// 역삼각형
	void drawInvert(int a) {
		for(int i=a; i>0; i--) {
			System.out.println(pad('#', i));
		}
	}
	
	// 이등변 삼각형 {
	void drawEq(int a) {
		for (int i=1; i<=a; i++) {
			System.out.println(pad(' ', a-i) + pad('#', i*2-1));
		}
	}
	
	void drawEqInvert(int a) {
		for (int i=a; i>0; i--) {
			System.out.println(pad(' ', a-i) + pad('#', i*2-1));
		}
	}
	
	
	
	// 모양"*"과 개수10를 넘기면 --> "**********" 
	String pad(char s, int cnt) {
		String result = "";
		for (int i=0; i<cnt; i++) {
			result += s;
		}
		
		return result;
	}
}

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
	
	void tree(char c, int a) {
		for (int i=1; i<=a; i++) {
			System.out.println(pad(' ', (3*a)-4 -i) + pad(c, i*2-1));
		}
		for (int i=1; i<=a; i++) {
			System.out.println(pad(' ', (2*a)-2 -i) + pad(c, (2*a)+(i*2)-5));
		}
		for (int i=1; i<=a; i++) {
			System.out.println(pad(' ', a-i) + pad(c, (4*a)+(i*2)-9));
		}
		for (int i=1; i<=3; i++) {
			System.out.println(pad(' ', (3*a)-6) + pad(c, 3));
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

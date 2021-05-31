package co.yedam.test;

// 클래스 : 필드 + 메서드 + 생성자

// 컨트롤 + / 는 선택한 줄들을 주석화
public class Calc {
	
	// on 1. 리턴값 없음, 매개변수 없음
	void turnOn() {
		System.out.println("계산기 on!");
	}
	//덧셈 2. 리턴값 없고 매개 변수 있음
	void sum(int a, int b) {							// 두개의 비슷한 매서드가 서로 다른 타입을 
		System.out.println("int 매서드");				// 넣을경우 자동으로 인식해 골라서 실행해줌 
		System.out.println("두 수의 합 : " + (a+b));	// 매개변수가 모두 integer일 경우
	}
	void sum(double a, double b) {						// 매개변수중 하나라도 double일 경우
		System.out.println("double 매서드");
		System.out.println("두 수의 합 : " + (a+b));
	}
	//3. 리턴도 있고 매개변수가 있음.
	int sum2(int a, int b) {
		return a + b;
	}
	
	//4. 가변인수 --> 매개변수가 여러개 일때 가능한것들.
	int sum3(int ... arr) {
		int result = 0;
		
		for (int i=0; i<arr.length; i++) {
			result += arr[i];
		}
		
		return result;
	}
}

package 배열;

import java.awt.Point;

/*
 * 객체배열 : 배열의 요소타입이 객체인 경우
 */
public class 객체배열 {
	
	public static void main(String[] args) {
		
		Score[] a;
		a = new Score[10];
		a[0] = new Score("홍길동", 100, 80, 40);
		a[1] = new Score("김유신", 100, 70, 60);
		a[2] = new Score("박박박", 50, 80, 50);
		
		
		for (int i=0; i<a.length; i++) {
			if (a[i] != null) { // 앞으로 널포인터 에러가 많이 보이므로 이런 if 잘 쓰길 바람.
				System.out.println(a[i].name);				
			}
		}
		
		//선언과 동시에 초기화
		Score[] b = {
				new Score("홍길동", 100, 80, 40),
				new Score("김유신", 100, 70, 60),
				new Score("박박박", 50, 80, 50)
				}; // 원리는 같음
		
		// 이름과 총점을 출력
		for (int i=0; i<b.length; i++) {
			if(b[i] != null) {
				System.out.println(b[i].name + " " + b[i].total);
			}
		}
		// || 같음		// in : 확장 for문 
		for (Score score : b ) {
			System.out.println(score.name + " " + score.total);
		}
		
		// 객체배열
		// (import)포인트 값을 저장 할 수 있는 생성자 클래스임
		Point[] c = {new Point(10, 10),
				new Point(10,30), new Point(30,10), new Point(30, 30)};
		
		for (Point i : c) {
			System.out.println(i.x +", "+ i.y);
		}
//		for i in c:
//			print(i.x, i.y) 파이썬과 상당히 흡사
		
		// 얕은 복사 : arraycopy, shallow copy
		// 얕은 복사는 복사된 배열이나 원본 배열이 변경될때 함께 변경된다. 연산자는 얕은 복사를 수행함.
		// 깊은 복사 : Deep copy
		// 깊은 복사는 새로운 메모리 공간에 값을 복사하는것이기에 원본 배열이 변경되어도 바뀌지 않음
		// 대체적으로 arr[].clone()을 사용하거나 혹은 for문을 돌며 넣어 줘도 됨.
		
		
	}

}
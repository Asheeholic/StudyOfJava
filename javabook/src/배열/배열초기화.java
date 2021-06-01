package 배열;

/*
 * 배열은 크기고정
 * 순차적으로 데이터를 저장하고 읽는 용도
 * 추가 삭제 번거로움
 */
public class 배열초기화 {

	public static void main(String[] args) {		
		//1차원 배열
		//배열 선언
		int[] a; // 객체 -> new 힙 메모리 할당 해야함
		a = new int[10];
		//초기화
		a[0] = 10; // 0~9
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50; 
		
		//삭제(인덱스 다음부터 앞으로 이동)
		for(int i=2; i<a.length; i++) {
			a[i-1] = a[i];
		}
		//배열 출력
		for (int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println();
		
		int[] b = {1,2,3}; // new int[3] {1,2,3}
		System.out.println("크기: " + b.length);
	}

}

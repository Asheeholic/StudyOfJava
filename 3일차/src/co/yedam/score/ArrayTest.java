package co.yedam.score;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr = new int[10]; // 배열 요소 개수 설정 
		//int[] arr2 = {1,2,3};// 배열의 개수가 미리 정해짐, new int[3]가 생략됨
		
		// new 는 힙 영역에 저장되고
		// var 는 스택 영역에 저장되고
		// 메소드는 메모리의 큰 부분에 저장됨
		
		//System.out.println(arr); // 메모리 영역 출력
		//System.out.println(arr2);
		//Scanner scan = new Scanner(System.in);
		
		ArrayApp app = new ArrayApp();
		app.init();
		app.total();
		app.max();
		app.min();
		app.print();		
		
	}
}

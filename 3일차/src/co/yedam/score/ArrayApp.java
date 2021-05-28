package co.yedam.score;

public class ArrayApp {
	int[] arr = new int[10];
	// 배열의 초기값 지정
	void init() {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*1000) + 1;			
		}		
	}
	
	// 배열 출력
	
	void print() {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");		
		}
		System.out.println();
	}
	//합계 출력
	void total() {
		int total = 0;
		for (int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		System.out.println("합계 : " + total);
	}
	// 최대값
	void max() {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("최대값 : " + max);		
	}
	// 최소값
	
	void min() {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("최소값 : " + min);		
	}
}

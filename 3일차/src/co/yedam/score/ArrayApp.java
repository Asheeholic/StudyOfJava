package co.yedam.score;

import java.util.Scanner;

// 클래스 선언
public class ArrayApp {
	
	// 배열의 초기값 지정
	int[] arr;					//성적
	int stundentNum;			//학생수
	
	Scanner scanner = new Scanner(System.in);
	
	void init() {
		System.out.print("학생수 > ");
		stundentNum = scanner.nextInt();
		arr = new int[stundentNum];
	}
	
	void input() {
		for (int i=0; i< arr.length; i++) {
			System.out.printf("score[%d] > ", i);
			arr[i] = scanner.nextInt();
		}
	}
	
	// 배열 출력
	
	void print() {
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("score[%d] > %d", i, arr[i]);	
			System.out.println();
		}
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
	
	void avg() {
		double avg;
		int total = 0;
		for (int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		avg = (double)total / arr.length;
		System.out.println("평균 : " + avg);	
	}
	
	public static void main(String[] args) {
		ArrayApp app = new ArrayApp();
		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		int selectNo = 0;
		while(run) {
			
			System.out.println("====================================================");
			System.out.println("1. 학생수 2. 점수입력 3. 점수리스트 4. 분석. 5. 종료");
			System.out.println("====================================================");
			System.out.print("선택 > ");
			selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				app.init();
			} else if (selectNo == 2) {
				app.input();
			} else if (selectNo == 3) {
				app.print();
			} else if (selectNo == 4) {
				app.max();
				app.min();
				app.total();
				app.avg();
			} else if (selectNo == 5) {
				System.out.println("프로그램을 종료합니다!");
				break;
			} else {
				System.out.println("선택 숫자를 잘못 입력 하셨습니다.");
			}
		}
		scanner.close();
	}
}

package co.yedam.app.score;

import java.util.Scanner;

/*
 * 성적 처리 프로그램
 * 국어, 영어, 수학 입력
 * 총점, 평균, 등급 계산
 */
public class ScoreApp {
	int kor;
	int eng;
	int mat;
	int sum;
	float avg;
	char grade; // 수 음 미 양 가

	// 성적 입력
	void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("국어 : ");
		kor = scanner.nextInt();
		System.out.print("영어 : ");
		eng = scanner.nextInt();
		System.out.print("수학 : ");
		mat = scanner.nextInt();
		scanner.close();
		return;
	}

	// 합계 계산
	int getSum() {
		sum = kor + eng + mat;
		return sum;
	}

	// 평균 계산

	float getAvg() {
		avg =  (kor + eng + mat) / 3;
		return avg;
	}
	
	boolean isPass() {
		// 평균이 60 이상이면 true
		// 아니면 false;
		if ((kor + eng + mat) / 3 > 60) {
			return true;
		} else {
			return false;
		}
	}

	char getGrade() {
		switch ((int) ((kor + eng + mat) / 3) / 10) {
		case 10: // 10과 9는 결과가 같으므로 무시 해도 됨
		case 9:
			grade = '수';
			break;
		case 8:
			grade = '우';
			break;
		case 7:
			grade = '미';
			break;
		case 6:
			grade = '양';
			break;
		default:
			grade = '가';
			break;
		}
		return grade;
	}
}

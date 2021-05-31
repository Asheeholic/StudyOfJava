package co.yedam.app.score;

import java.util.Scanner;

/*
 * 성적 처리 프로그램
 * 국어, 영어, 수학 입력
 * 총점, 평균, 등급 계산
 */
public class ScoreApp {
	private int kor;
	private int eng;
	private int mat;
	private int sum;
	private float avg;
	private char grade; // 수 음 미 양 가
	
	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

//	public void setAvg(float avg) {
//		this.avg = avg;
//	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

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

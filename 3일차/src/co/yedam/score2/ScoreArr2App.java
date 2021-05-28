package co.yedam.score2;

public class ScoreArr2App {
	
	//3차원 배열
			// 국어, 영어, 수학
	int[][] arr = {
			{100,90,80},
			{10,20,30},
			{50,50,50},
			{30,30,30},
			};
	
	void print() {
		for(int i=0 ; i<arr.length; i++) {
			for(int j=0 ; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	int getSbjCnt(int no) {
		return arr[no].length;
	}
	
	// 입력한 번호의 한 학생의 총점 구하는 앱
	int stdTotal(int a) {
		int result = 0;
		for (int i=0; i<arr[a].length; i++) {
			result += arr[a][i];
		}
		return result;
	}
	
}

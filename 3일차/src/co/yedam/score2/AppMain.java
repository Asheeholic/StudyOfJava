package co.yedam.score2;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScoreArr2App score2 = new ScoreArr2App();

		for (int i = 0; i < score2.arr.length; i++) {
			System.out.print((i+1) + "번 학생의 점수 합계 : ");
			System.out.println(score2.stdTotal(i));
			
			System.out.print((i+1) + "번 학생의 과목 수 : ");
			System.out.println(score2.arr[i].length);
		}
		
		System.out.println(score2.getSbjCnt(2));
	}

}

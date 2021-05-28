package co.yedam.score;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScoreArrApp score = new ScoreArrApp();
		//score.print();
		System.out.printf("총점 = %04d\n", score.total());
		//System.out.printf("평균 = %.2f", score.avg());// 혼공자 91페이지
		//score.printAll();
	} // end main

} // end class

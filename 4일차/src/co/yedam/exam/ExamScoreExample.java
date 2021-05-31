package co.yedam.exam;

public class ExamScoreExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExamScore examScore = new ExamScore(
				"한재호", 55, 55, 55);
		System.out.println(
				examScore.isPass() ? "합격" : "불합격");
	}

}

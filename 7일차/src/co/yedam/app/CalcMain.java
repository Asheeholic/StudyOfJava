package co.yedam.app;

public class CalcMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=0;		
		int c = 0;
		try {
			c = Calc.div(a, b);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(c);
	}

}

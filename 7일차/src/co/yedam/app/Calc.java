package co.yedam.app;

public class Calc {
	
	public static int add(int a, int b) {
		 return a+b;
	}
	
	public static int div(int a, int b) throws Exception { // 직접하든 밖에서 하든 해야함.
		int c = 0;
//		try {
//			c = a/b;
//			return c;			
//		} catch(Exception e) {
//		}
		c = a/b;
		return c;
	}
}

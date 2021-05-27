package co.yedam.app;

/*
 * 연산자 테스트
 * 논리 : and(&&), or(||)
 * a++ =>  a=a+1
 * 조건 ? t결과 : f결과 ==> if (t) {} else {}
 */
public class OperatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1;
		int y = 1;

		int result1 = ++x + 10;
		int result2 = y++ + 10;

		System.out.println(String.format("x=%d 결과=%d", x, result1)); // x=2 결과=12
		System.out.println(String.format("y=%d 결과=%d", y, result2)); // y=2 결과=11
		
		// 논리 연산
		System.out.println (x>0 && y>0 );
		System.out.println( x==0 && y==0 );
		System.out.println( !(x==0 && y==0 ) );
		System.out.println( !(x==0) || !(y==0));
		
		
		//삼항연산
		System.out.println(x>0 && y>0 ? "둘다 양수" : "아님");
		System.out.println(x%2==0 && y%2==0 ? "둘다 짝수" : "아님");
		
	}

}

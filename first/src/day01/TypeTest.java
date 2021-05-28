package day01;

/*
 * 데이터형 연습
 * 	1		2 	   4     8       4       8
 * byte > short > int > long > float > double
 * 		  char
 * boolean
 */
public class TypeTest {
	public static void main(String[] args) {
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
		long a = 2247483647L; // long은 마지막에 l, L이라고 넣어야함 int는 필요없
		System.out.println(a);
		float f = 0.123456789f; // float은 마지막에 f, F라고 넣어야함 double은 필요없 /7자리
		System.out.println(f);
		double d = 0.1234567890123456789; // 15자리
		System.out.println(d);
		// 2진법 > 10진법
		int b2 = 0b11111;
		System.out.println(b2);

		int b8 = 0111; // 0 + 8진수 : 017 등, 0x + 16진수 : 0xBFF 등
		System.out.println(b8);
		int b16 = 0xff + 0xff;
		System.out.println(b16);
		// 10진수를 8진수로 변환
		System.out.println(b8 + " " + Integer.toOctalString(b8));

		// char

		System.out.println("============================");
		char c1 = '가';
		System.out.println((int)c1); // 10진수
		System.out.println(Integer.toHexString(c1)); //16진수
		char c2 = '\uac01'; // '각' 유니코드 / u는 유니코드를 알려줌
		int c3 = 44033; // '각' 유니코드 10진법
		System.out.println(c2);
		System.out.println((char)c3); // 정수를 char형으로
		
		
	}
}

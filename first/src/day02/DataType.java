package day02;

public class DataType {
	void sum(int a, int b) {
		System.out.println(a + b);
	}
	void suml(long a, long b) {
		System.out.println("long " + (a + b));
	}
	void sumd(double a, double b) {
		System.out.println("double " + (a + b));
	}
	void upper(char a) {
		int b = a - 32;
		System.out.println("char " + (char)b );
	}
	void sum8(int a, int b) {
		System.out.println("8진수 합 " + Integer.toOctalString(a + b));
	}
	void sum16(int a, int b) {
		System.out.println("16진수 합 " + Integer.toHexString(a + b));
	}
}

package day01;

/*
 * �������� ����
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
		long a = 2247483647L; // long�� �������� l, L�̶�� �־���� int�� �ʿ��
		System.out.println(a);
		float f = 0.123456789f; // float�� �������� f, F��� �־���� double�� �ʿ�� /7�ڸ�
		System.out.println(f);
		double d = 0.1234567890123456789; // 15�ڸ�
		System.out.println(d);
		// 2���� > 10����
		int b2 = 0b11111;
		System.out.println(b2);

		int b8 = 0111; // 0 + 8���� : 017 ��, 0x + 16���� : 0xBFF ��
		System.out.println(b8);
		int b16 = 0xff + 0xff;
		System.out.println(b16);
		// 10������ 8������ ��ȯ
		System.out.println(b8 + " " + Integer.toOctalString(b8));

		// char

		System.out.println("============================");
		char c1 = '��';
		System.out.println((int)c1); // 10����
		System.out.println(Integer.toHexString(c1)); //16����
		char c2 = '\uac01'; // '��' �����ڵ� / u�� �����ڵ带 �˷���
		int c3 = 44033; // '��' �����ڵ� 10����
		System.out.println(c2);
		System.out.println((char)c3); // ������ char������
		
		
	}
}

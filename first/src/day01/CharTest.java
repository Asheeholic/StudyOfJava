package day01;

public class CharTest {

	public static void main(String[] args) {
		
		// ��ҹ���
		char c1 = 'A'; // '\uac00' 0xac00
		int c2 = c1 + 32;
		System.out.println( c2 + " " + (char)c2 );
		
		char c3 = '\uac00';
		char c4 = 0xac00;
		char c5 = '��'; // ���� ����ǥ �ؾ���
		char c6 = 44032;
		System.out.println(c3 + c4 + c5 + c6); // 176128
		System.out.println(c3 + " " + c4 + " " + c5 + " " + c6); // �� �� �� ��
		
		String s = "�ȳ�\"\n\n �ϼ���\\"; // \" > " ǥ��
		System.out.println(s);
		
	}

}

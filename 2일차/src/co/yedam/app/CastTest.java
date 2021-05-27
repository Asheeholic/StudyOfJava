package co.yedam.app;

import java.util.Scanner;

/*
 * Casting: cast operator (type)
 * essence:         byte < short < int   < long
 * real number: 	               float < double
 * 
 * String --------> byte	: Byte.parseByte(str);
 * 					short	: Short.parseShort(str);
 * 					int		: Interger.parseInt(str);
 * 					long	: Long.parseLong(str);
 * 					float	: Float.parseFloat(str);
 * 					double	: Double.parseDouble(str);
 * 					boolean	: Boolean.parseBoolean(str);
 * 
 * DataType ------> String.valueOf(basicType) 
 */
public class CastTest {

	public static void main(String[] args) {
		// Auto Casting if a < b
		int a = 10;
		long b = a;
		System.out.println(b);
		
		// strict Casting if b > a
		a = (int)b;
		
		// char(one of strings) <-> int(code)
		char c = 'Z';
		System.out.println((int)c);
		int d = 97;
		System.out.println((char)d);
		
		// real number -> int or long
		double e = 10.5;
		long f = (long)e;
		System.out.println(f);
		
		// int into double, double into string
		double g = 5 + 10.5;
		String h = "hi" + g;
		System.out.println(h);
		System.out.println("hi" + 5 + 10); // hi510
		System.out.println(5 + 10 + "hi"); // 15hi
		
		// 5 / 2
		// int i = 5 / (double)2; compile error 
		double i = 5 / (double)2;
		
		System.out.println(i); // 2.5
		System.out.println( (int)5 / (int)2 ); // 2
		System.out.println( (int)5 / (double)2); // 2.5
		
		// string -> int
		String s1 = "123";
		int j = Integer.parseInt(s1);
		System.out.println(j);
		
		// int > String
		String s2 = String.valueOf(10.5);
		System.out.println(s2);
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("�Է� : ");
		String greet = scanner.next();
		
		System.out.println(greet);
		scanner.close();
	}

}

package 클래스;

public class StringEqual {

	public static void main(String[] args) {
		
		String s1 = "hello";			 	// 상수 "hello"
		String s2 = "hello";
		
		String s3 = new String("hello"); 	// new 힙
		String s4 = new String("hello");
		
		System.out.println( s1 == s2 );  	//true
		System.out.println( s3 == s4 );  	//false
		System.out.println( s1 == s3 );  	//false
		
		System.out.println( s1.equals(s3) );
		System.out.println( s3.equals(s4) );

		StringBuffer sb = new StringBuffer("hello world"); // 수정하기위해서 주로 쓰는것
		sb.insert(5, "!!!");
		System.out.println(sb.toString());
		sb.replace(0, 5, "hi");
		System.out.println(sb.toString().equals("")); // 그냥 sb.equals()가 아님
		
		
	}
}

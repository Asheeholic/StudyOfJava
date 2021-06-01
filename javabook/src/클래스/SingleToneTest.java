package 클래스;

public class SingleToneTest {

	public static void main(String[] args) {
		Calculator c1 = Calculator.getInstance();
		// c1 = new Calculator(); private로 막아놓음
		c1.add(10, 20);
		
		Calculator c2 = Calculator.getInstance();
		c2.add(10, 20);
		
		System.out.println(c1 == c2);
		// 참조하는것이 다르므로 false
		// 싱글톤은 같은걸 참고하게 되므로 true
	}

}

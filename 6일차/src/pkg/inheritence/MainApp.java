package pkg.inheritence;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a = new D();  		//자동 형변환
		int temp = ((D)a).sd;	//강제 형변환
		
		A o = new D();
		temp = ((D)o).sd; // 런타임 오류
		
		A aa = new A();
		
		
		System.out.println( a instanceof A); // 모두 트루
		System.out.println( a instanceof B);
		System.out.println( a instanceof D);
		System.out.println( a instanceof X);
		System.out.println( aa instanceof D);
		
		B b = new B();
		b = new D();
		//b = new C(); 에러, 부모자식 아님.
		
	}

}

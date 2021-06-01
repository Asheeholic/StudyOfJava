package 클래스;

public class ClacStaticTest {

	public static void main(String[] args) {
		// 정적멤버는 객체 생성 하지 않고도 클래스 이름으로 접근 가능
		// final로 적혀진 static 변수는 변경 불가.
		//CalcStatic.PI = 3.141592;
		System.out.println(CalcStatic.PI_INT);
		System.out.println(CalcStatic.add(10, 20));
		
		System.out.println(Long.MAX_VALUE);
		
		CalcStatic c1 = new CalcStatic();
		CalcStatic c2 = new CalcStatic();
		
		
		// 아래는 권장하지 않음 deprecated
//		System.out.println(c1.pi);
//		System.out.println(c2.pi);

	}

}

package 도형;

public class AppMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s1 = new Rect(4,5); // 부모타입 자식객체 참조가능
		execute(s1);
		
		s1 = new Circle(5); // 현재 서클 형
		execute(s1);
	
	}
	public static void execute(Shape s) {
		if ( s instanceof Drawable ) {
			((Drawable)s).draw();	
		} 
		if ( s instanceof Movable ) {
			((Movable)s).move(); //강제 형변환
		}
		s.area(); // 다형성 : 참조 대상의 메서드 호출
	}
}

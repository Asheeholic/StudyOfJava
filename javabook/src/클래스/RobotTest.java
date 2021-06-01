package 클래스;

public class RobotTest {

	public static void main(String[] args) {

		//2. 객체생성
		Robot r = new Robot(2, 4, "한재호");
		r.setArm(5);
		r.setLeg(3);
		System.out.println(r.getArm());
		System.out.println(r.getLeg());
		
		Robot r2 = new Robot(2, 2);
		//3. 객체사용(메서드 호출)
		r2.print();
	}

}

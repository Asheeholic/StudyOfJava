package 클래스;

public class Robot {
	
	//필드
	//private : 클래스 내부에서만 사용 가능
	//필드는 주로 private
	private int arm;
	private int leg;
	private String name;
	
	//setter : 필드값을 변경 할 수 있음 (메서드를 통해)
	public void setArm(int arm) {
		this.arm = arm;
	}
	
	public void setLeg(int leg) {
		this.leg = leg;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	//getter : 필드값을 조회 할 수 있음 (메서드를 통해)
	public int getArm() {
		return this.arm;
	}
	
	public int getLeg() {
		return this.leg;
	}
	
	public String getName() {
		return this.name;
	}
	
	// 생성자는 오버로딩 가능
	// 기본 생성자
	public Robot() {}; // 컴파일러가 기본적으로 만들어주는 생성자
	
	public Robot(int arm, int leg) {
		this.arm = arm; // this 는 자기자신을 객체를 참조하는 참조변수
		this.leg = leg;
	}
	
	public Robot(int arm, int leg, String name) {
		this.arm = arm; // this 는 자기자신을 객체를 참조하는 참조변수
		this.leg = leg;
		this.name = name;
	}
	
	// 일반 메서드
	// default는 같은 패키지 내에서만 사용가능
	// public을 사용해야 외부 패키지에서 사용 가능함.
	public void print() {
		System.out.printf("arm : %d, leg : %d, name: %s", arm, leg, name);
	}

	@Override  
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		//return super.equals(obj);
		Robot r2 = ((Robot)obj); // 오버라이딩 해서 타입을 바꿔서 쓰는 방식이 되게 자주 쓰임.
		return r2.arm == this.arm && r2.leg == this.leg;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		//return super.toString();
		return "arm:" + this.arm + ", "+ "leg:" + this.leg;
	}
	
	
	
}

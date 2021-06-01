package 상속;

public class DmbCellPhone extends CellPhone {
	// 필드
	int channel;
	//생성자
	public DmbCellPhone() {
		super(null, null); // cellphone 기본생성자 막았을경우 생성자로 이동
		System.out.println("DmbCellPhone 기본생성자");
	}
	public DmbCellPhone(String model, String color, int channel) {
		super(model,color); // 생략되어있음 // cellphone 기본생성자 막았을경우
//		this.model = model; // super가 되어있을경우 생략 가능
//		this.color = color; // super는 항상 제일 위로
		this.channel = channel;
		System.out.println("DmbCellPhone 생성자");
	}
	
	void turnOnDmb() {
		System.out.println("채널" + channel);
	}
	void turnOffDmb() {
		System.out.println("DMB 방송수신을 멈춥니다.");
	}
	void changeChannelDmb(int channel) {
		System.out.println("채널" + channel + "번으로 바꿉니다.");
	}
	
	@Override //오버라이드 // 오버로딩은(중복정의)
	//상속받은 메서드를 재정의 해서 수정
	void powerOn() {
		//super.powerOn();
		System.out.println("Dmb 전원 on");
	}
	
	
}

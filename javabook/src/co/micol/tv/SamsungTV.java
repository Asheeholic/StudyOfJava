package co.micol.tv;

public class SamsungTV implements RemoteControl {

	
	public SamsungTV() {
		System.out.println("SamsungTV 객체생성");
	}
	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("삼성 TV On");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("삼성 TV Off");
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("삼성 TV V-up");
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("삼성 TV V-down");
	}

}

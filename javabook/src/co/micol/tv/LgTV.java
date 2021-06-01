package co.micol.tv;

public class LgTV implements RemoteControl{
	
	public LgTV() {
		System.out.println("LGTV 객체생성");
	}
	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("LGTV On");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("LGTV Off");
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("LGTV V up");
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("LGTV V down");
	}
	
}

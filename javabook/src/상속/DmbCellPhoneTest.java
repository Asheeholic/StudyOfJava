package 상속;

public class DmbCellPhoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DmbCellPhone phone = new DmbCellPhone();
		
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);
		
		System.out.println("모델" + dmbCellPhone.model);
		System.out.println("색깔" + dmbCellPhone.color);

		System.out.println("채널" + dmbCellPhone.channel);
		
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(100);
		dmbCellPhone.turnOffDmb();
		dmbCellPhone.powerOff();
	}

}

package co.micol.tv;

public class MainApp {
	// 명령행 인수
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SamsungTV tv = new SamsungTV();
		//LgTV tv = new LgTV();
		
		/*
		 * 1. 부모타입의 참조변수가 지식객체를 참조할 수 있다.
		 * 2. 다형성 : 참조하는 대상의 메서드가 호출.
		 * 				코드는 같더라도 참조대상에 따라서 실행결과가 다르게 나옴.
		 *  아ㅏㅇ아ㅣ아아아아아아아아주 중요함..
		 */
		RemoteControl tv = (RemoteControl) BeanFactory.getBean(args[0]);
		//RemoteControl tv = new LgTV();
		
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();
	}

}

package pkg.friend;

public class AppMain {

	public static void main(String[] args) {
		Friend f = new CompanyFriend("회사", "홍길동", "1111", "과장");
		f.print();
		
		Friend f1 = new SchoolFriend("학교", "홍길동", "2222", "2021-01-01");
		f1.print();
		
		//다형성 (상속받고 오버로딩)
		//1. 부모타입의 참조변수가 자식객체를 참조가능
		//2. 메서드 실행하면 참조하는 대상의 메서드가 실행
		FriendManager manager = new FriendManager();
		manager.selectAll();
		for ( Friend fr : manager.friends ) {
			if (fr instanceof SchoolFriend) {
				fr.print();
			}
		}
	}

}

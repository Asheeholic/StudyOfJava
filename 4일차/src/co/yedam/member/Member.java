package co.yedam.member;

public class Member {
	String name;
	String id;
	String password;
	int age;
	
	//생성자
	Member(String id, String password, String name, int age) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
	}
	
	//모든 필드를 초기화하는 생성자
	Member() {}

	@Override
	public String toString() {
		return "Member [name=" + name + ", id=" + id + ", password=" + password + ", age=" + age + "]";
	}
	
	
	//toString
}

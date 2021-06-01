package co.yedam.app.bookrent.complete;

public class Member {
	String name;
	String phone;
	
	public Member() {
		this("이름 없음", "번호 없음");
	}
	public Member(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "Member [name=" + name + ", phone=" + phone + "]";
	}
	
	
}

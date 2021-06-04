package co.friend.model;

public class Friend { //final을 넣어버리면 상속이 불가능해짐.
	protected String gubun; // final 넣으면 값을 초기화 시켜주거나 하나 넣어줘야함. 넣을시 변경불가.
	protected String name;
	protected String tel;
	// TODO : 생성자를 최대한 다양한 방식으로 만들어보기.
	public Friend() {}
	public Friend(String gubun, String name, String tel) {
		super();
		this.gubun = gubun;
		this.name = name;
		this.tel = tel;
	}
	
	public void print() { // final 넣어버리면 상속이 되어도 메소드 오버라이딩 불가능
		System.out.printf("친구 : %20s %20s %20s\n", gubun, name, tel);
	}
	
	public String getGubun() {
		return gubun;
	}

	public void setGubun(String gubun) {
		this.gubun = gubun;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "Friend [gubun=" + gubun + ", name=" + name + ", tel=" + tel + "]";
	}
	
}
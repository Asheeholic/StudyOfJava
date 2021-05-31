package co.yedam.member;

import java.util.Scanner;

public class MemberService {
	Scanner scanner = new Scanner(System.in);
	Member[] members = new Member[10];
	int cnt = 0;
	
	//회원가입
	
	void insert(String id, String password, String name, int age) {
		members[cnt++] = new Member(id, password, name, age);
	} // **다시보기
	
	void insert() {
		System.out.print("id > ");
		String id = scanner.next();
		System.out.print("password > ");
		String password = scanner.next();
		System.out.print("이름 > ");
		String name = scanner.next();
		System.out.print("나이(숫자) > ");
		int age = scanner.nextInt();
		
		members[cnt++] = new Member(id, password, name, age);	
	}
	//회원 리스트
	void printList() {
		for (int i=0; i<cnt ; i++ ) {
			System.out.print(i + "\t");
			System.out.print(members[i].id + "\t");
			System.out.print(members[i].password + "\t");
			System.out.print(members[i].name + "\t");
			System.out.println(members[i].age);
		}
	}
	
	void printMember() {
		System.out.print("번호 > ");				
		int tag = scanner.nextInt();
		if (tag >= cnt) {
			System.out.println("할당된 번호 외의 번호를 입력하셨습니다.");
		} else {
			System.out.print(tag + "\t");
			System.out.print(members[tag].id + "\t");
			System.out.print(members[tag].password + "\t");
			System.out.print(members[tag].name + "\t");
			System.out.println(members[tag].age);
		}
	}
	
	// login(id, pw) : id:hong pw:12345 나머지는 false
	// if(id=="hong") --> if(id.equals("hong")
	void login() {
		System.out.print("id > ");
		String id = scanner.next();
		System.out.print("password > ");
		String password = scanner.next();		
		boolean result = false;
		for (int i=0; i<cnt; i++) {
			if(id.equals(members[i].id) && password.equals(members[i].password)) {
				result = true;
				break;
			}
		}
		System.out.println(result ? "로그인되었습니다." : "id 또는 패스워드 틀림");
	}
	
	void printbyId() {
		System.out.print("id > ");
		String id = scanner.next();
		for (int i=0; i<cnt ; i++) {
			if (id.equals(members[i].id)) {
				System.out.print(members[i].id + "\t");
				System.out.print(members[i].password + "\t");
				System.out.print(members[i].name + "\t");
				System.out.println(members[i].age);
			}
		}
	}
	// logout(id) : "로그아웃"
	
	void logout(String id) {
		System.out.println("로그아웃 되었습니다");
	}
	
}

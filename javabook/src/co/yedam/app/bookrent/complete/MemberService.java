package co.yedam.app.bookrent.complete;

import java.util.Scanner;

public class MemberService implements Service {
	
	Member[] members;
	int cnt;
	int maxCnt = 10;
	
	Scanner scanner = new Scanner(System.in);

	public MemberService() {
		members = new Member[maxCnt];
	}

	@Override
	public void input() {
		if(cnt > maxCnt) {
			System.out.println("더 이상 추가할 수 없습니다.");
			return;
		}
		System.out.printf("이름 > ");
		String title = scanner.next();
		System.out.print("전화번호 > ");
		String author = scanner.next();
		members[cnt++] = new Member(title, author); 
		System.out.println("등록된 건수:" + cnt);
	}

	@Override
	public void update() {
		System.out.printf("수정할 번호>");
		int idx = scanner.nextInt();
		if(idx >= cnt-1) {
			System.out.println("없는 번호입니다.");
			return;
		}
		System.out.print("전화번호 > ");
		String phone = scanner.next();
		members[idx].setPhone(phone); 
		System.out.println("수정되었습니다.");
	}

	@Override
	public void delete() {
		System.out.printf("삭제할 번호>");
		int idx = scanner.nextInt();
		if(idx > cnt-1) {
			System.out.println("없는 번호입니다.");
			return;
		}
		for(int i=idx; i<cnt-1; i++) {
			members[i] = members[i+1];
		}
		cnt--;
		System.out.println("삭제되었습니다.");
	}

	@Override
	public void selectAll() {
		System.out.println(String.format("%-20s %-20s", "이름", "전화번호"));
		System.out.println("================================================================");
		for(int i=0; i<cnt; i++) {
			System.out.println(String.format("%-20s %-20s", members[i].getName(), members[i].getPhone()));
		}
		System.out.println("================================================================");
	}

	@Override
	public void selectOne() {
		System.out.printf("조회할 번호>");
		int idx = scanner.nextInt();
		if(idx > cnt-1) {
			System.out.println("없는 번호입니다.");
			return;
		}
		System.out.println(String.format("도서명:%s   저자:%s", members[idx].getName(), members[idx].getPhone()));
	}
}

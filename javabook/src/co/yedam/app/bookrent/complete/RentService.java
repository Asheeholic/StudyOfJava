package co.yedam.app.bookrent.complete;

import java.util.Scanner;

public class RentService implements Service {
	
	Rent[] rents;
	int cnt;
	int maxCnt = 10;
	
	Scanner scanner = new Scanner(System.in);

	public RentService() {
		rents = new Rent[maxCnt];
	}

	@Override
	public void input() {
		if(cnt > maxCnt) {
			System.out.println("더 이상 추가할 수 없습니다.");
			return;
		}
		System.out.printf("이름 > ");
		String name = scanner.next();
		System.out.print("도서명 > ");
		String title = scanner.next();
		rents[cnt++] = new Rent(name, title); 
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
		System.out.print("이름 > ");
		String name = scanner.next();
		rents[idx].setName(name); 
		System.out.print("도서명 > ");
		String title = scanner.next();
		rents[idx].setTitle(title); 
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
			rents[i] = rents[i+1];
		}
		cnt--;
		System.out.println("삭제되었습니다.");
	}

	@Override
	public void selectAll() {
		System.out.println(String.format("%-20s %-20s %-20s", "이름", "도서명", "날짜"));
		System.out.println("================================================================");
		for(int i=0; i<cnt; i++) {
			System.out.println(String.format("%-20s %-20s %-20s", rents[i].getName(), rents[i].getTitle(), rents[i].getDate()));
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
		System.out.println(String.format("이름:%s   도서명:%s  날짜:%s", rents[idx].getName(), rents[idx].getTitle(), rents[idx].getDate()));
	}
}

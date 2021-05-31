package co.yedam.member;

import java.util.Scanner;

public class MemberServiceExample {

	public static void main(String[] args) {
		MemberService app = new MemberService();
		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		int selectNo = 0;
		while(run) {
			System.out.println("===============================================================");
			System.out.println("1. 등록 2. 전체조회 3. 번호로조회 4. 로그인 5. id로 조회 6.종료");
			System.out.println("===============================================================");
			System.out.print("입력 > ");
			selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				app.insert();
			} else if (selectNo == 2) {
				app.printList();
			} else if (selectNo == 3) {
				app.printMember();
			} else if (selectNo == 4) {
				app.login();
			} else if (selectNo == 5) {
				app.printbyId();
			} else if (selectNo == 6){
				System.out.println("프로그램을 종료합니다!");
				break;
			} else {
				System.out.println("선택 숫자를 잘못 입력 하셨습니다.");
			}
		}
		scanner.close();
	}
}

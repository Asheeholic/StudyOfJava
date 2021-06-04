package co.friend.view;

import java.util.List;

import co.friend.access.FriendList;
import co.friend.model.Friend;
import co.friend.util.ScannerUtil;

public class FriendCliApp {
	FriendList friendList = new FriendList();
	
	public void start() {
		int menunum;
		do {
			menuTitle(); // 메뉴출력
			menunum = ScannerUtil.readInt("입력"); // 메뉴선택
			switch (menunum) {
			case 1: insert(); 	break;
			case 2: update(); 	break;
			case 3: delete(); 	break;
			case 4: selectAll();break;
			case 5: findName(); break;
			case 6: findTel(); 	break;			
			}
		} while (menunum != 0);
	}
	

	private void insert() {
		// TODO Auto-generated method stub
		Friend friend = ScannerUtil.readFriend();
		friendList.insert(friend);
	}
	// 요소 업데이트
	private void update() {
		// TODO Auto-generated method stub
		Friend friend = new Friend();
		friend.setName(ScannerUtil.readStr());
		friend.setTel(ScannerUtil.readStr());
		friendList.update(friend);
	}
	// 이름으로 리스트 요소 삭제
	private void delete() {
		// TODO Auto-generated method stub
		String name = ScannerUtil.readStr();
		friendList.delete(name);
	}
	// 검색
	private void findName() {
		// TODO Auto-generated method stub
		String name = ScannerUtil.readStr();
		Friend friend = friendList.selectOne(name);
		System.out.println(friend);

	}
	private void findTel() {
		// TODO Auto-generated method stub
		String tel = ScannerUtil.readStr();
		Friend friend = friendList.findTel(tel);
		System.out.println(friend);
		
	}
	// 모든 요소 출력
	private void selectAll() {
		// TODO Auto-generated method stub
		List<Friend> list = friendList.selectAll();
		for(Friend friend : list) {
			System.out.println(friend);
		}
	}

	public void menuTitle() {
		System.out.println("=====친구 관리====");
		System.out.println("|1. 친구추가     |");
		System.out.println("|2. 친구수정     |");
		System.out.println("|3. 친구삭제     |");
		System.out.println("|4. 전체조회     |");
		System.out.println("|5. 이름으로 조회|");
		System.out.println("|6. 번호로 조회  |");
		System.out.println("|0. 종료         |");

	}
}

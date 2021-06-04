package co.memo.view;

import java.util.List;

import co.memo.access.MemoList;
import co.memo.model.Memo;
import co.memo.util.ScannerUtil;


public class MemoCliApp {
	MemoList memoList = new MemoList();
	
	public void start() {
		int menunum;
		do {
			menuTitle(); // 메뉴출력
			menunum = ScannerUtil.readInt("입력"); // 메뉴선택
			switch (menunum) {
			case 1: insert(); 		break;
			case 2: update(); 		break;
			case 3: delete(); 		break;
			case 4: selectAll();	break;
			case 5: findDate(); 	break;
			case 6: findContent(); 	break;			
			}
		} while (menunum != 0);
	}
	

	private void insert() {
		// TODO Auto-generated method stub
		Memo memo = ScannerUtil.readMemo();
		memoList.insert(memo);
	}
	// 요소 업데이트
	private void update() {
		// TODO Auto-generated method stub
		Memo memo = new Memo();
		memo.setDate(ScannerUtil.readDate());
		memo.setContent(ScannerUtil.readStr());
		memoList.update(memo);
	}
	// 이름으로 리스트 요소 삭제
	private void delete() {
		String date = ScannerUtil.readDate();
		memoList.delete(date);
	}
	// 검색
	private void findDate() {
		String date = ScannerUtil.readDate();
		Memo memo = memoList.selectOne(date);
		System.out.println(memo);
	}
	private void findContent() {
		// TODO Auto-generated method stub
		String content = ScannerUtil.readStr();
		Memo memo = memoList.findContent(content);
		System.out.println(memo);
		
	}
	// 모든 요소 출력
	private void selectAll() {
		// TODO Auto-generated method stub
		List<Memo> list = memoList.selectAll();
		for(Memo memo : list) {
			System.out.println(memo);
		}
	}

	public void menuTitle() {
		System.out.println("=====메모 관리====");
		System.out.println("|1. 메모등록     |");
		System.out.println("|2. 메모수정     |");
		System.out.println("|3. 메모삭제     |");
		System.out.println("|4. 메모전체조회 |");
		System.out.println("|5. 날짜검색     |");
		System.out.println("|6. 내용검색     |");
		System.out.println("|0. 종료         |");

	}
}

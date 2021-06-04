package co.memo.access;

import java.util.ArrayList;

import co.memo.model.Memo;

public interface MemoAccess {
	//등록
	public void insert(Memo memo); //자동으로 추상 메소드이며, public이 생략됨.
	
	//수정
	public void update(Memo memo);
	
	//삭제
	public void delete(String date);
	
	//전체조회
	public ArrayList<Memo> selectAll();
	
	//단건조회
	public Memo selectOne(String date);
	
	//전화번호 검색
	public Memo findContent(String content);
}

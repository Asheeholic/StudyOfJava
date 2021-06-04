package co.friend.access;

import java.util.ArrayList;

import co.friend.model.Friend;

/**
 * 
 * @author admin
 * 인터페이스 : 상수필드 + 추상메서드
 * 메서드 : public abstract
 */
// 친구 관리 개발시 표준을 정해줌. 
public interface FriendAccess {
	
	String MODEL = "";  // pulic static final 이 생략됨.
	//등록
	public void insert(Friend friend); //자동으로 추상 메소드이며, public이 생략됨.
	
	//수정
	public void update(Friend friend);
	
	//삭제
	public void delete(String name);
	
	//전체조회
	public ArrayList<Friend> selectAll();
	
	//단건조회
	public Friend selectOne(String name);
	//전화번호 검색
	public Friend findTel(String name);
}

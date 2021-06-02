package pkg.friend;

import java.util.List;

public class FriendManager implements FriendAccess {
	Friend[] friends = new Friend[5];
	
	public FriendManager () {
		friends[0] = new CompanyFriend("예담회사", "순이", "010-2222-6666");
		friends[1] = new SchoolFriend("교담초등", "돌이", "010-3333-6666");
		friends[2] = new SchoolFriend("주담초등", "명이", "010-4444-6666");
		friends[3] = new CompanyFriend("캬담회사", "똘똘이", "010-5555-6666");
		friends[4] = new CompanyFriend("꾸꾸담회사", "James", "010-7777-6666");
	}
	
	@Override
	public void insert(Friend friend) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Friend friend) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Friend friend) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List selectAll() {
		System.out.println("Friend Manager out");
		return null;
	}

	@Override
	public Friend selectOne(Object key) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}

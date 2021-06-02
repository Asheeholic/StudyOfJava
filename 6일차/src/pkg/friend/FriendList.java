package pkg.friend;

import java.util.ArrayList;
import java.util.List;

public class FriendList implements FriendAccess {
	List<Friend> friends;

	// 생성자 만들기
	public FriendList() {
		friends = new ArrayList<Friend>();
	}

	@Override
	public void insert(Friend friend) {
		// TODO Auto-generated method stub
		friends.add(friend);
	}

	@Override
	public void update(Friend friend) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(String name) {
		// TODO Auto-generated method stub

	}

	@Override
	public void selectAll() {
		System.out.println("Friend List out");
	}

	@Override
	public Friend selectOne(String name) {
		for (Friend f : friends) {
			if (f.getName().equals(name)) { // contains
				return f;
			}
		}

		return null;
	}

}

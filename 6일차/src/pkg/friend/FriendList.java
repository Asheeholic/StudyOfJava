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
		for (Friend f : friends) {
			if (f.getName().equals(friend.name)) {
				f.setGubun(friend.gubun);
				f.setTel(friend.tel);
			}
		}
	}

	@Override
	public void delete(String name) {
		for (Friend f : friends) {
			if (f.getName().equals(name)) {
				friends.remove(f);
			}
		}
	}

	@Override
	public void selectAll() {
		System.out.printf("%10s %10s %10s\n", "구분", "이름", "전화번호");
		for (Friend f : friends) {
			System.out.printf("%10s %10s %10s\n", f.getGubun(), f.getName(), f.getTel());
		}
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

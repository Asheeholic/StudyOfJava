package pkg;

public class MemberInfo {
	private static MemberInfo memberInfo = new MemberInfo();
	static MemberInfo getInstance() {
		return memberInfo;
	}  //  this is singleTone!
	
	private MemberInfo() {}
	
	String[] names = new String[10];
	
	void print() {
		for (String i : names) {
			System.out.println(i);
		}
		System.out.println();
	}
}

package pkg;

public class MemberInfoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberInfo member1 = MemberInfo.getInstance();
		member1.names[0] = "홍길동";

		MemberInfo member2 = MemberInfo.getInstance();
		member2.names[1] = "김기자";

		MemberInfo member3 = MemberInfo.getInstance();
		member3.names[2] = "한재호";

		member1.print();
		member2.print();
		member3.print();
		
		System.out.println(member1.equals(member2) && member1.equals(member3));

	}

}

package co.yedam.app;

public class MemberInfoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberInfo member = new MemberInfo();
		
		member.input();
		member.heightWeightInput();
		
		member.print();
		System.out.println(member.bmi());
	}

}

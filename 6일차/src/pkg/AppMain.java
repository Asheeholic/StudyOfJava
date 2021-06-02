package pkg;

public class AppMain {
	
	void print() {
		System.out.println("=======");
		printName(); // 정적메소드를 인스턴스 메소드 안에서 부르는건 가능함.
	}
	
	static void printName() {
		System.out.println("한재호");
	}
	
	public static void main(String[] args) {
		Count count1 = new Count();
		Count.cnt1++;
		count1.cnt2++;
		
		Count count2 = new Count();
		Count.cnt1++;
		count2.cnt2++;
		
		Count count3 = new Count();
		Count.cnt1++;
		count3.cnt2++;
		
		System.out.println(count1.cnt1 + " : " + count1.cnt2);
		System.out.println(count2.cnt1 + " : " + count2.cnt2);
		System.out.println(count3.cnt1 + " : " + count3.cnt2);
		
		
	}

}

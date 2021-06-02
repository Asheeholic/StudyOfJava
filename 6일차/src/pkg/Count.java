package pkg;

public class Count {
	public static int cnt1; // 스태틱은 그냥 퍼블릭
	int cnt2;
	
	public void setCnt2(int cnt2) {
		if (cnt2 < 0) {
			cnt2 = 0;
		}
		this.cnt2 = cnt2;
	}
	
	public int getCnt2() {
		return cnt2; // this.cnt2가 왜 안되지?
	}
	
}

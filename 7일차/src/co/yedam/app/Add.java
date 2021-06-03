package co.yedam.app;

public class Add {

	public static void main(String[] args) {
		
		String data1 = null;
		String data2 = null;
		
		try {
			data1 = args[0];
			data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 / value2;
			System.out.println(result);
		} catch(NumberFormatException e) {
			System.out.println("숫자 입력");
			return;
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("매개변수는 두개가 필요합니다.");
			return;
		} catch(Exception e) { // 커다란 범위의 에러 캐치는 제일 마지막으로 해야함.
			System.out.println(e.getMessage());
		}
	}

}

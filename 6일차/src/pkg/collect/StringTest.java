package pkg.collect;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello everybody!!";
		char c = str.charAt(1);
		System.out.println("인데스 위치의 한글자:" + c);
		System.out.println(str.substring(6,11)); // 이것만 꺼내고 출력
		System.out.println(str.contains("body")); // 포함하는가
		System.out.println(str.endsWith("!!")); // 이걸로 끝나는가
		System.out.println(str.startsWith("he")); // 이걸로 시작하는가

		String num = "201030-1231234";
		String[] arr = num.split("-");
		System.out.println(arr[0]);
		System.out.println(arr[1].charAt(0));
		
		String path = "c:/temp/image/a.jpg";
		int pos = path.indexOf("/");
		int pos2 = path.lastIndexOf("/");
		int pos3 = path.lastIndexOf("/", pos2+1); // 다음 위치부터 시작
		System.out.println(pos + " " + pos2);
		
		//마지막 .의 위치 +1 부터 끝까지 : lastIndexOf, sub
		
		
		//System.out.println("확장자 : " + path.substring(path.lastIndexOf(".") + 1));
		
		System.out.println("파일명 : " + StringUtil.getFileName(path));
		System.out.println("확장자 : " + StringUtil.getExtention(path));
		System.out.println("경로 : " + StringUtil.getPath(path));
		
		String b = "문자열 문자    문자";
		//String d = new String(b.getBytes(), "euc-kr");
		
		b = b.replace("문자", "숫자");
		System.out.println(b);
	}

}

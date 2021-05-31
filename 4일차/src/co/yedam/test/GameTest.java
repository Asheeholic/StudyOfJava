package co.yedam.test;

/*
 * project - export - java안에 jar - 저장 (워크스페이스 안에 저장)
 * 다른 project - build path - configure Build path - classPath에서 add jar.
 */
import co.yedam.app.gugudan.GugudanApp;

public class GameTest {
	// 공식적으로 필드는 private
	// 메소드는 public
	public static void main(String[] args) {
		GugudanApp game = new GugudanApp();
		game.printDan(0); // 퍼블릭을 이용해서 불러왔음
		// game.printAll(); 퍼블릭을 하지 못한것은 불러오지 못함 / 컴파일 에러
	}

}

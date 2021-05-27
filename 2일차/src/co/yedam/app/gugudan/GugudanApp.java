package co.yedam.app.gugudan;

public class GugudanApp {

	/*
	 * for( int i=1 ; i<10 ; i++ ) { for ( int j=1 ; j<10 ; j++) {
	 * System.out.println(i + " * " + j + " = " + (i*j)); } }
	 */
	// 입력받은 단만 출력
	void printDan(int a) {
		for (int i = 1; i < 10; i++) {
			System.out.print(a + " * " + i + " = " + (a * i));
		}
		System.out.println();
	}

	void printAll() {
		for (int j = 1; j < 10; j++) {
			for (int i = 2; i < 10; i++) {
				System.out.print(i + " * " + j + " = " + (i * j) + "\t");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	void printAllReverse() {
		for (int j = 9; j > 0; j--) {
			for (int i = 9; i > 1; i--) {
				System.out.print(i + " * " + j + " = " + (i * j)+ "\t");
			}
			System.out.println();
		}
		System.out.println();
	}

	void printRange(int a, int b) {
		if ( a < b ) {
			for ( ; a < (b + 1); a++) {
				for (int j = 1; j < 10; j++) {
					System.out.print(a + " * " + j + " = " + (a * j)+ "\t");
				}
			}
		} else if ( a == b ) {
			for (int i = 1; i < 10; i++) {
				System.out.println(a + " * " + i + " = " + (a * i));
			}
		} else {
			for ( ; b < (a + 1); b++) {
				for (int j = 1; j < 10; j++) {
					System.out.print(b + " * " + j + " = " + (b * j)+ "\t");
				}
			}
		}
		
		System.out.println();

	}

}

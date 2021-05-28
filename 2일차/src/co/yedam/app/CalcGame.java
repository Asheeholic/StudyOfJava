package co.yedam.app;

import java.util.Scanner;

/*
 * Game
 * The Four Fundamental Arithmetic Operation
 */
public class CalcGame {
	double a;
	double b;

	int sum(int cnt) {
		int result = 0;
		result = cnt * (cnt+1) / 2;
		
		return result;
	}
	
	void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("입력 : ");
		String s1 = scanner.next();

		System.out.print("입력 : ");
		String s2 = scanner.next();

		a = Double.parseDouble(s1);
		b = Double.parseDouble(s2);
		scanner.close();
	}

	// two int addition method(function)
	double add() {
		double c = a + b;
		return c;
	}

	// share of two number 5 / 2 = 2
	double share() {
		return (int) a / (int) b;
	}

	// divide of two number 5/2 = 2.5
	double div() {
		return a / b;
	}

	// rest of dividing two number 5 % 2 = 1
	double rest() {
		return (int) a % (int) b;
	}

}

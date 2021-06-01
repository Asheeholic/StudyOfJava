package co.yedam.emp;

import java.util.Scanner;

public class EmployeeApp {
	int empNum;
	Scanner scanner = new Scanner(System.in);
	Employee[] arr;

	public void init() {
		System.out.print("사원수 입력 > ");
		empNum = scanner.nextInt();
		arr = new Employee[empNum];
	}

	public void input() {
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d번 사번 입력 > ", i);
			int employeeId = scanner.nextInt();

			System.out.printf("%d번 이름 입력 > ", i);
			String name = scanner.next();

			System.out.printf("%d번 부서번호 입력 > ", i);
			int departmentId = scanner.nextInt();

			System.out.printf("%d번 급여 입력 > ", i);
			int salary = scanner.nextInt();

			System.out.printf("%d번 이메일 입력 > ", i);
			String email = scanner.next();

			System.out.printf("%d번 입력 완료!\n", i);

			arr[i] = new Employee(employeeId, name, departmentId, salary, email);
		}
	}

	public void print() {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i].employeeId + "\t");
			System.out.print(arr[i].name + "\t");
			System.out.print(arr[i].departmentId + "\t");
			System.out.print(arr[i].departmentName + "\t");
			System.out.println(arr[i].email);
		}
	}

	public String search(int id) {
		String result = "없습니다.";
		for (int i = 0; i < arr.length; i++) {
			if (id == arr[i].employeeId) {
				result = arr[i].name;
			}
		}
		return result;
	}

	public int sum() {
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			result += arr[i].salary;
		}
		return result;
	}

}

package co.yedam.exam;

// 사원정보
public class Employee {
	int employeeId;
	String name;
	int departmentId;
	String departmentName; // 10: 인사, 20: 개발, 30: 영업(기본값)
	int salary;
	String email;

	public Employee(int employeeId, String name, int departmentId, int salary, String email) {
		this.employeeId = employeeId;
		this.name = name;
		this.departmentId = departmentId;
		if (this.departmentId == 0) {
			this.departmentId = 30;
		}
		if (this.departmentId == 10) {
			this.departmentName = "인사";
		} else if (this.departmentId == 20) {
			this.departmentName = "개발";
		} else if (this.departmentId == 30) {
			this.departmentName = "영업";
		} else {
			this.departmentName = "없음";
		}

		this.salary = salary;
		this.email = email;
	}

	Employee() {
		this(0, null, 0, 0, null);
	}

	Employee(int employeeId, String name) {
		this(employeeId, name, 0, 0, null);
	}

	Employee(int employeeId, String name, String email) {
		this(employeeId, name, 0, 0, email);
	}

	Employee(int employeeId, String name, int salary) {
		this(employeeId, name, 0, salary, null);
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", departmentId=" + departmentId
				+ ", departmentName=" + departmentName + ", salary=" + salary + ", email=" + email + "]";
	}

}

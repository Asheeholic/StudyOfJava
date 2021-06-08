package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

// 문자열을 포함해서 다른 클래스는 무조건 기본으로 null값을 가짐
public class SqliteConnect {
	// 필드로 선언
	static PreparedStatement psmt; // 스태틱으로 선언해야함. 왜? 물어보기
	static ResultSet rs;
	static Connection conn;

	// 1. 조회 2. 입력 3. 수정 4. 삭제 5. 전체리스트(각각 기능을 분리) => 메소드로 기능분리.

	// 전체리스트
	public static ArrayList<Person> getPersonList() {
		ArrayList<Person> personList = new ArrayList<>();
		connect(); // Connection 객체 연결;
		String sql = "select * from person"; // 쿼리
		try {
			psmt = conn.prepareStatement(sql); // 쿼리 명령문 입력후 저장. 걍 공식임
			rs = psmt.executeQuery(); // 쿼리의 실행 결과를 가져오는 부분. 걍 공식임
			while (rs.next()) { // true시 rs값에 데이터를 가져옴. next()는 있으면 그다음 데이터를 계속 가져옴. 없을경우 false
				Person person = new Person(); // 이전 변수 선언 후, 새로 넣어주는 과정
				person.setId(rs.getInt("id"));
				person.setName(rs.getString("name"));
				person.setAge(rs.getInt("age"));
				person.setPhone(rs.getString("phone"));
				personList.add(person); // 리스트에 Book에 입력한 값을 넣어줌.
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return personList;
	}

	// 한건 조회
	public static Person getPerson(int id) { // 항상 커넥션 개체가 있어야함.
		connect(); // ?는 입력이 되게 한다.
		String sql = "select * from person where id = ?"; // 헷갈릴 수 있으니 외워야함. 하나의 약속인가?
		Person p = null;
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, id); // 첫번째 매개변수는 ?를 의미함. 두번째는 큰 메소드의 매개변수
			rs = psmt.executeQuery(); // select 할때만 사용.
			if (rs.next()) {
				p = new Person();
				p.setId(rs.getInt("id"));
				p.setName(rs.getString("name"));
				p.setAge(rs.getInt("age"));
				p.setPhone(rs.getString("phone"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		return p;
	}

	// 입력기능
	public static void insertPerson(int id, String name, int age, String phone) {
		connect();
		String sql = "insert into person values(?, ?, ?, ?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, id);
			psmt.setString(2, name);
			psmt.setInt(3, age);
			psmt.setString(4, phone);
			int r = psmt.executeUpdate();// insert, update, delete 할 때 사용. 건수마다 건수가 리턴이 됨.
			System.out.println(r + "건 입력.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}

	}
	// 수정기능						401            name      
//	public static void updatePerson(int id, String column, String value) {
//		connect();
//		// sql 입력 양식
//		String sql = "update person set %s = ? where id = ?";
//		// sql양식에 있는 %s에다가 속성(컬럼)을 대입
//		sql = String.format(sql, column);
//		
//		// sql 입력 후 진행과정
//		try {
//			psmt = conn.prepareStatement(sql);
//			//sql 명령문에 있는 ? 에 대입 과정
//			psmt.setInt(2, id);
//			if (column.equals("age")) {
//				psmt.setInt(1, Integer.parseInt(value));
//			} else {
//				psmt.setString(1, value);
//			}
//			int r = psmt.executeUpdate();
//			System.out.println(r + "건 수정.");
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
//			close();
//		}
//	}
	public static void updatePerson(Person p) {
		connect();
		String sql = "update person set name = ?, age = ?, phone = ? where id=?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, p.getName());
			psmt.setInt(2, p.getAge());
			psmt.setString(3, p.getPhone());
			psmt.setInt(4, p.getId());
			int r = psmt.executeUpdate();// insert, update, delete 할 때 사용. 건수마다 건수가 리턴이 됨.
			System.out.println(r + "건 수정 되었습니다.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
	}
	// 삭제기능
	public static void deletePerson(int id) {
		connect();
		String sql = "delete from person where id = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, id);
			int r = psmt.executeUpdate();
			System.out.println(r + "건 삭제.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
	}
	// 이름으로 검색 메소드
	public static ArrayList<Person> getPersonByName(String name) {
		connect();
		String sql = "select * from person where name = ?";
		ArrayList<Person> personList = null;
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, name);
			rs = psmt.executeQuery();
			personList = new ArrayList<>();
			while (rs.next()) {
				Person person = new Person(); 
				person.setId(rs.getInt("id"));
				person.setName(rs.getString("name"));
				person.setAge(rs.getInt("age"));
				person.setPhone(rs.getString("phone"));
				personList.add(person); 
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		
		return personList;
	}
	// 연결
	public static void connect() {
//		Connection conn = null; //자바와 spl 통로
		String url = "jdbc:sqlite:C:/sqlite/db/sample.db";// db를 쓰기위한 작업
		try {
			conn = DriverManager.getConnection(url);
			System.out.println("연결성공!!");

//			PreparedStatement psmt = conn.prepareStatement("select * from person"); // 쿼리를 실행하고 받아오는것
//			ResultSet rs = psmt.executeQuery(); // 결과값.
//			
//			while(rs.next()) { // true시 rs값에 데이터를 가져옴. next()는 있으면 그다음 데이터를 계속 가져옴. 없을경우 false
//				System.out.printf("id: %3d, name: %10s, age: %3d, phone: %10s\n",
//						rs.getInt("id"), rs.getString("name"),
//						rs.getInt("age"), rs.getString("phone")); // 속성값을 안에 넣어주는것.
//			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
//		finally {
//			if( conn != null ) {
//				try {
//					conn.close();
//				} catch (SQLException e) {
//					e.printStackTrace();
//				}
//			}
//		}
	}

	public static void close() {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (psmt != null) {
			try {
				psmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("1. 전체리스트 2. 입력 3. 수정 4. 삭제 5. 한건조회 6. 이름조회 9. 종료");
			int menu = sc.nextInt();
			if (menu == 1) {
				// 전체리스트
				System.out.println("<조회 결과>");
				ArrayList<Person> list = getPersonList(); // 결과값을 반환해서 받아줌. 타입이 중요함.
				for (Person person : list) {
					System.out.println(person);
				}
			} else if (menu == 2) {
				// 입력
				System.out.print("아이디를 입력하세요. > ");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.print("이름을 입력하세요. > ");
				String name = sc.nextLine();
				System.out.print("나이를 입력하세요. > ");
				int age = sc.nextInt();
				sc.nextLine();
				System.out.print("전화번호를 입력하세요. > ");
				String phone = sc.nextLine();

				insertPerson(id, name, age, phone);
			} else if (menu == 3) {
				// 수정
//				System.out.print("조회할 아이디를 입력하세요. > ");
//				int id = sc.nextInt();
//				System.out.print("변경할 속성을 입력하세요. > ");
//				String column = sc.next();
//				System.out.print("값을 입력하세요. > ");
//				String value = sc.next();
//				sc.nextLine();
//				
//				updatePerson(id, column, value);
				
				System.out.println("조회할 아이디를 입력하세요");
				int searchId = sc.nextInt();
				sc.nextLine();
				Person p = getPerson(searchId);
				
				if (p == null) {
					System.out.println("존재하지 않는 아이디입니다.");
					continue;
				}
				System.out.print("변경할 이름 : ");
				String changedName = sc.nextLine();
				System.out.print("변경할 나이 : ");
				String changedAge = sc.nextLine();
				System.out.print("변경할 전화번호 : ");
				String changedPhone = sc.nextLine();
				if(!changedName.equals("")) {
					p.setName(changedName);
				}
				if(!changedAge.equals("")) {
					p.setAge(Integer.parseInt(changedPhone));
				}
				if(!changedPhone.equals("")) {
					p.setPhone(changedPhone);
				}
				
				updatePerson(p);
				
			} else if (menu == 4) {
				// 삭제
				System.out.print("삭제할 아이디를 입력하세요. > ");
				int searchId = sc.nextInt();
				sc.nextLine();
				deletePerson(searchId);
			} else if (menu == 5) {
				// 한건조회
				System.out.print("조회할 아이디를 입력하세요. > ");
				int searchId = sc.nextInt();
				sc.nextLine();
				Person p = getPerson(searchId);
				if (p == null) {
					System.out.println("조회된 값이 없습니다.");
				} else {
					System.out.println(p);
				}
			} else if (menu == 6) {
				// 이름으로 조회
				System.out.println("조회할 이름을 입력하세요. >");
				String name = sc.next();
				ArrayList<Person> p = getPersonByName(name);
				if (p.size() == 0) { // ArrayList 길이 메소드
					System.out.println("조회된 값이 없습니다.");
				} else {
					System.out.println(p);
				}
			} else if (menu == 9) {
				break;
			} else {
				System.out.println("번호를 잘못 입력 하셨습니다.");
			}

		} // end of while

		sc.close();
		System.out.println("정상적인 종료.");

	} // end of main()
} // end of class

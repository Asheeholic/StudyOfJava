package co.yedam.app.bookrent.complete;

public class Rent {
	
	String name;
	String title;
	String date = "2021";
	
	public Rent() {
		this("이름 없음", "책 제목 없음", "날짜 미기입");
	}
	
	public Rent(String name, String title) {
		this(name, title, "2021");
	}
	
	public Rent(String name, String title, String date) {
		this.name = name;
		this.title = title;
		this.date = date;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDate() {
		return date;
	}

	@Override
	public String toString() {
		return "Rent [name=" + name + ", title=" + title + ", date=" + date + "]";
	}
	
}

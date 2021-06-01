package 도형;

public abstract class Shape { //클래스도 abstract 해줘야함
	int w;
	double result;
	
	public Shape() {}
	public Shape(int w) {
		this.w = w;
	}
	
	public void print() {
		System.out.println("그려진다.");
	}
	
	public abstract void area() ;// 추상메서드는 바디가 없음 : {}
}

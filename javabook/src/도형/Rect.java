package 도형;

public class Rect extends Shape implements Drawable, Movable{
	private int h;
	
	public Rect(int h, int w) {
		super(w);
		this.h = h;
		// this.w = w;
	}
	
	public void area() {
		System.out.println("사각형 넓이");
		result = h * w;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Rect draw");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("moving");
	}
}

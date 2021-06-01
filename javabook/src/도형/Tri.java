package 도형;

public class Tri extends Shape implements Drawable{
	private int h;
	
	public Tri(int h, int w) {
		super(w);
		this.h = h;
		//this.w = w;
	}

	@Override
	public void area() {
		System.out.println("삼각형 면적");
		result = h * w /2;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("tri draw");
	}
}

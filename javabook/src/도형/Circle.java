package 도형;

public class Circle extends Shape implements Drawable{
	
	public Circle (int w) {
		super(w);
		//this.w = w;
	}
	
	public void area() {
		System.out.println("원 넓이");
		result = w * w * 3.14 ;
	}
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("circle draw");
	}
}

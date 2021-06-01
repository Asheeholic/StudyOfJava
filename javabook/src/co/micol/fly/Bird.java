package co.micol.fly;

public class Bird extends Animal implements Flyer{
	
	public Bird() {}
	
	public void run() {}
	
	public void eat() {} // 오버라이드 필수
	
	public void takeOff() {}
	public void fly() {}
	public void land() {}
	public void layEggs() {}
}

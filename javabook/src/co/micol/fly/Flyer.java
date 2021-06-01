package co.micol.fly;
//인터페이스
/*
 * 1. 다중 상속이 가능
 * 2. 모든 메서드가 추상메서드
 * 3. 개발표준을 정해주는것.
 * 4.
 */

public interface Flyer {

	void takeOff(); //public abstract가 생략되어있음

	void fly();

	void land();

}
package co.yedam.test;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		
		myCar.company = "르노삼성자동차";
		myCar.color = "정열의 레드";
		
		System.out.println("제작회사: " + myCar.company);
		System.out.println("모델명: " + myCar.model);
		System.out.println("색깔: " + myCar.color);
		System.out.println("최고속도: " + myCar.maxSpeed);
		System.out.println("현재속도: " + myCar.speed);
				
		myCar.speed = 60;
		System.out.println("수정된 속도:" + myCar.speed);
		
		//생성자
		Car youCar = new Car("르노", "SM6", "블루");
		System.out.println(youCar.toString()); //toString은 자동호출
		//"코나, 100"
		Car miniCar = new Car("코나", 0);
		System.out.println(miniCar.toString());
		
	}

}

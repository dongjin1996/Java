package ch06.sec14;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
//		myCar.speed;
		
		myCar.setSpeed(10);
		System.out.println(myCar.getSpeed());
		
		myCar.setStop(true);
		System.out.println(myCar.isStop());
		
	}

}

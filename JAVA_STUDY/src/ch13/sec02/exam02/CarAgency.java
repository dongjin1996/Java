package ch13.sec02.exam02;

public class CarAgency implements Rentable<Car>{

	@Override
	public Car rent() { //리턴 타입이 Car가 되어야 한다.
		return new Car();
	}
	
}

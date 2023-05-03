package ch08.sec12;

public class InstanceofExample {

	public static void main(String[] args) {
		
		
		Taxi taxi = new Taxi();
		Bus bus = new Bus();
		
		ride(taxi);
		System.out.println();
		ride(bus);
	}
	
	public static void ride(Vehicle vehicle) {
		//vehicle 객체가 bus객체를 참조하는가? => 자동타입변환 되었는가?
		if(vehicle instanceof Bus) {			
			//강제타입변환(자식객체가 부모객체를 참조하는것)
			Bus bus = (Bus) vehicle;
			//자식클래스에 있는 고유의 메소드와 필드를 사용 가능
			bus.checkFare();
		}
		
		vehicle.run();
	}
}

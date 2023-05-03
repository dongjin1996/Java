package ch08.sec08;

public class MultiInterfaceImplExample {

	public static void main(String[] args) {
		RemoteControl rc = new SmartTelevision();
		//RemoteControl에 선언된 메소드만 사용가능
		rc.turnOn();
		rc.turnOff();
		
		Searchable searchable = new SmartTelevision();
		//Searchable에 선언된 메소드만 사용가능
		searchable.search("https://www.naver.com");
	}

}

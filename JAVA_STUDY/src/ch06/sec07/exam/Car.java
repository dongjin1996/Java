package ch06.sec07.exam;

//설계도
public class Car {
	//필드(멤버변수)
	String company;
	String model;
	String color;
	int maxSpeed;
	int speed;
	
	//생성자 
	Car(String m, String c, int s) {
		//주로 필드 초기화를 할때 쓴다.
		//this : 이 클래스 => Car 클래스 => Car 클래스 안에 있는 필드
		model = m;
		color = c;
		maxSpeed = s;
	}
}

package ch07.sec02;

public class Phone {
	//필드 선언
	public String model;
	public String color;
	
	//생성자 선언
	public Phone() {
		System.out.println("Phone() 생성자 실행");
	}
	
	public Phone(String model, String color) {
		this.model = model; //super 자체가 부모 클래스 
		this.color = color;
		System.out.println("Phone(String model, String color) 생성자 실행");
	}
	
	//메소드 선언
	public void bell() {
		System.out.println("벨이 울립니다.");
	}

	public void sendVoice(String message) {
		System.out.println("나: " + message);
	}
	
	public void receiveVoice(String message) {
		System.out.println("상대방: " + message);	
	}
	
	public void hangup () {
		System.out.println("전화를 끊습니다.");	
		
	}
	
}

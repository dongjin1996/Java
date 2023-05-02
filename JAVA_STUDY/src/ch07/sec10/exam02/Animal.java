package ch07.sec10.exam02;

public abstract class Animal {
	String owner;
	
	
	
	//일반메소드
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	//추상메소드 (선언만) =>구현은? => 자식클래스에서 오버라이드
	public abstract void sound();
}

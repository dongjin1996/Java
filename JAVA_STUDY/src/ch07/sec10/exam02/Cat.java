package ch07.sec10.exam02;

public class Cat extends Animal{

	//중요. 추상클래스가 부모클래스일대 추상메소드가 있으면
	//반드시 오버라이드(재정의)를 해야한다.
	
	@Override
	public void sound() {
		System.out.println("야옹");
	}
			
}

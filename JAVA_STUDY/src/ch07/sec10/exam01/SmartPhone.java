package ch07.sec10.exam01;

public class SmartPhone extends Phone{
	SmartPhone(String owner) {
		
		//중요. 추상클래스가 부모일땐 반드시 부모클래스의 생성자를 호출해야 한다.
		super(owner); //부모 생성자 호출
	}
	
	//메소드
	void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
	
	
	
}

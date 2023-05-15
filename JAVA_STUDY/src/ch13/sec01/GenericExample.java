package ch13.sec01;

public class GenericExample {

	public static void main(String[] args) {
		Box<String> box1 = new Box<String>(); //중요, 제네릭 타입은 클래스나 인터페이스만 올수있다.
		box1.content = "안녕하세요";
		System.out.println(box1.content);
	}

}

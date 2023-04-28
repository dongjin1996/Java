package ch07.sec06.package2;

import ch07.sec06.package1.A;

//패키지가 달라도 상속은 가능하다.
public class D extends A {
	
	//생성자
	public D() {
		//부모클래스 생정자를 호출한다.
		super();
	}
	
	public void method1() {
		//부모 클래스의 필드를 바꾼다.
		super.field = "value";
		
		//부모 클래스의 메소드를 호출한다.
		this.method();
		
		// => 이 모든게 가능한 이유는 protected 접근제한자는 상속관계일때 접근 가능
	}
	
	public void method2() {
		//protected를 생성자에 사용하면 직접 객체를 생성해서 사용하는 것은 안된다.
		A a = new A();
		a.field = "value";
		a.method();
	}
}

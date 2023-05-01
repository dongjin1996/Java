package ch07.sec09;

public class InstanceofExample {
	//main 메소드에서 바로 호출하기 위해 static을 사용
	public static void personInfo(Person person) {
		System.out.println(person.name);
		person.walk();
		
		//person이 참고하는 객체가 student인지 확인
		//person person = new Student(); 인지 확인
		if(person instanceof Student) {
			//강제타입변환
			Student student = (Student)person;
			
			//자식클래스가 가지고 있는 고유의 메소드와 필드 사용 가능
			System.out.println(student.studentNo);
			student.study();
		}
	}
	
	public static void main(String[] args) {
		Person p1 = new Person("홍길동");
		personInfo(p1);
		
		System.out.println();
		
		//자동타입변환
		Person p2 = new Student("김길동", 10);
		personInfo(p2);
	}
}

package ch13.sec04;

public class GenericExample {
	//Number의 하위클래스만 사용가능
	public static <T extends Number> boolean compare(T t1, T t2) {
		
		//타입 파라메터의 타임출력
		System.out.println("compare(" + t1.getClass().getSimpleName() + "," + t2.getClass().getSimpleName() + ")");
		
		double v1 = t1.doubleValue(); // 기본타입인 double타입으로 값을 돌려준다.
		double v2 = t2.doubleValue();
		
		return (v1 == v2);
	}
	
	public static void main(String[] args) {
		boolean result1 = compare(4.5, 4.5);
		System.out.println(result1);
		System.out.println();
	}
}

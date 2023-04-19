package ch02.sec05;

public class BooleanExample {

	public static void main(String[] args) {
		boolean stop = false;
		
		if(stop) {
			System.out.println("중지합니다.");
		} else {
			System.out.println("시작합니다.");
		}
		
		int x = 10;
		boolean result1 = (x == 20); //결과값이 같지 않으니 false
		boolean result2 = (x != 20); //결과값이 맞으니 true
		
		System.out.println(result1);
		System.out.println(result2);
	}

}

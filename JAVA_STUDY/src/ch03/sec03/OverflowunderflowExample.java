package ch03.sec03;

public class OverflowunderflowExample {

	public static void main(String[] args) {
		// overflow: 값의 최대 허용 범위를 벗어난다.
		byte var1 = 125;
		
		for(int i=0; i<5; i++) {
			var1++; //1씩증가
			System.out.println("var1: " + var1);
		}
		
		
		// underflow: 값의 최소 허용 범위를 벗어난다.
		
		byte var2 = -125;
		for(int i=0; i<5; i++) {
			var2--;
			System.out.println("var2: " + var2);
		}
		
	}

}

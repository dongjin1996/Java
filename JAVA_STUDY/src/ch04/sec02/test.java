package ch04.sec02;

public class test {

	public static void main(String[] args) {
		int sum1 = 0;
		
		for(int i=0; i<=100; i++) {
			sum1 = sum1 + i % 3;
		}
		System.out.println(sum1);
//			System.out.println(i);
		
	}

}

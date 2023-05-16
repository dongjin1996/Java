package ch16.sec01;

public class LambdaExample {

	public static void main(String[] args) {
		//익명구현객체 + 매개변수 = 람다 (함수)
		action((x, y -> {
			int result = x + y;
			System.out.println("result: " + result);
		});
	}
	
	public static void action(Calculable calculable) {
		int x = 10;
		int y = 4;
		calculable.calculable(x, y);
	}

}

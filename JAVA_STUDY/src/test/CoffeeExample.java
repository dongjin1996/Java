package test;

public class CoffeeExample {

	public static void main(String[] args) {
		String[] plus = {"카푸치노", "초코라떼", "바닐라라떼"};
		Coffee coffee = new Coffee("초코라떼", 2, 3);
		
		coffee.shotadd(2);
		
		coffee.sweetadd(3);
		
		coffee.made(1);
	}
	
}

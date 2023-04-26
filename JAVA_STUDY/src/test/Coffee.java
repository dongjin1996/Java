package test;

public class Coffee {
	double water = 100; //물량 L
	double coffeebean = 100; //원두량 kg
	String plus;  // 맛
	int shot;   //샷 추가 (1~3)
	int sweet;  //시럽 추가 (1~5)
	
	Coffee(String plus, int shot, int sweet) {
		this.plus = plus;
		this.shot = shot;
		this.sweet = sweet;
	}
	
	
	//샷 추가 
	void shotadd(int shot) {
		this.shot = shot;
	}
	
	
	//시럽 추가
	
	void sweetadd(int sweet) {
		this.sweet = sweet;
	}
	
	void made(int count) {
		water = water - (0.5 * count);
		coffeebean = coffeebean - (0.1 * count);
		
		System.out.println("커피가 " + plus + " 맛으로 " + count + "잔 나왔습니다.");
		System.out.println("샷 추가:" + shot + "번");
		System.out.println("시럽 추가:" + sweet + "번");
		System.out.println("남은 물의 양:" + water + "L");
		System.out.println("남은 원두의 양:" + coffeebean + "kg");

		
	}
	
	
	
	
	
}

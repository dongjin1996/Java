package question;

public class Marine {
	int x = 0, y = 0; // Marine의 위치좌표(x,y)
	int hp = 60; // 현재 체력
	static int weapon = 6; // 공격력
	static int armor = 0; // 방어력
	
	//참고. 정적필드의 값을 변경하는 메소드가 있으면 그 메소드도 정적메소드로 만들어주는게 좋다.
	//공격력 증가
	static void weaponUp() {
		weapon++;
	}
	
	//방어력 증가
	static void armorUp() {
		armor++;
	}
	
	//캐릭터의 위치 움직임
	void move(int x, int y) {
		this.x = x; // this.x는 인스턴스 변수, x는 지역변수
		this.y = y; // this.y는 인스턴스 변수, y는 지역변수
	}

}
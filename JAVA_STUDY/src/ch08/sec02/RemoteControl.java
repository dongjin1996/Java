package ch08.sec02;

public interface RemoteControl {
	//인터페이스는 상수와 추상메소드로 구성된다 => 불완전한 클래스 => 오로지 상속만을위해 쓰인다.
	
	//상수 => 인터페이스는 public static final을 안붙여도 모든 필드를 상수로 인식한다.
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상메소드
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	//디폴트 메소드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음처리 합니다.");
			setVolume(MIN_VOLUME); //추상메소드 호출
		} else {
			System.out.println("무음해제 합니다.");
		}
	}
	
	//정적 메소드
	static void changeBattery() {
		System.out.println("리모컨 건전지를 교환합니다.");
	}
}

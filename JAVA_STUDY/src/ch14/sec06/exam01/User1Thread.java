package ch14.sec06.exam01;

public class User1Thread extends Thread{
	
	private Calculator calculator;
	
	public User1Thread() {
		setName("User1Thread"); //스레드 이름 지정
	}
	
	public void setCalculator(Calculator calculator) { //동기화 메소드
		this.calculator = calculator;
	}
	
	@Override
	public void run() {
		calculator.setMemory1(100);
	}

}

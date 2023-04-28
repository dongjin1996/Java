package question;

//계좌
public class Account {
	//개체 = 속성 + 기능
	//계좌 = (계좌소유자이름, 계좌번호, 잔고) + 기능 (getter, setter)
	
	//속성 => 필드
	private String ano; //계좌번호
	private String owner; //계좌 소유자 이름
	private int balance; //잔고
	
	//생성자
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}

	//메소드
	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	
}

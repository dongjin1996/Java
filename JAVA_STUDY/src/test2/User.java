package test2;

public class User {
	protected String userName; //유저이름
	protected int userID; //유저아이디
	protected int attack; //공격력
	protected int magic; //마력
	protected int armor; //방어력
	protected int range; //사거리
	protected int healthPoint; //체력
	
	public User() {}
	
	public User(String userName, int userID) {
		this.userName = userName;
		this.userID = userID;
	}
	
	public void attackPoint() {}
	
	public void magicPoint() {}
	
	public void armorPoint() {}
	
	public void rangePoint() {}
	
	public void healthPoint() {}
	
	public String showUserinfo() {
		return userName + "의 정보" ;
	}
	
}

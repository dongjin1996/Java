package test2;

public class Warrior extends User{

	public Warrior(String userName, int userID) {
		super(userName, userID);
		this.attack = 100;
	}

	@Override
	public void healthPoint() {
		
		super.healthPoint();
	}
	

}

package hospital;

public class Score {
	private int customerID; //환자번호
	private Bleed bleed; // 수축기/이완기
	private int blood; // 혈압
	
	public Score(int customerID, Bleed bleed, int blood) {
		this.customerID = customerID;
		this.bleed = bleed;
		this.blood = blood;
		
	}

	@Override
	public String toString() {
		
		return "환자번호:" + this.customerID + ", " + bleed.getBloodName() + ":" + blood;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public Bleed getBleed() {
		return bleed;
	}

	public void setBleed(Bleed bleed) {
		this.bleed = bleed;
	}

	public int getBlood() {
		return blood;
	}

	public void setBlood(int blood) {
		this.blood = blood;
	}
	
	
	
}

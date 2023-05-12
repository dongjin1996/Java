package Ophthalmology;

public class Score {
	private int customerID; //환자번호
	private Eyes eyes; // 검사하는 눈
	private double vision; // 시력
	
	public Score(int customerID, Eyes eyes, double vision) {
		this.customerID = customerID;
		this.eyes = eyes;
		this.vision = vision;
		
	}

	@Override
	public String toString() {
		
		return "환자번호:" + this.customerID + ", " + eyes.getEyeName() + ":" + vision;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public Eyes getEyes() {
		return eyes;
	}

	public void setEyes(Eyes eyes) {
		this.eyes = eyes;
	}

	public double getVision() {
		return vision;
	}

	public void setVision(int vision) {
		this.vision = vision;
	}
	
	
	
}

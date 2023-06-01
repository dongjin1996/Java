package hospital;

import java.util.ArrayList;

public class Customer {
	//필드
	private int customerID; //환자번호
	private String customerName; //환자이름
	private String age; //학생/ 성인구분
	private Bleed majorBleed;
	private Bleed subBleed;
	private ArrayList<Score> scoreList = new ArrayList<>();
	
	
	//생성자
	public Customer(int customerID, String customerName, Bleed majorBleed, String age) {
		this.customerID = customerID;
		this.customerName = customerName;
		this.majorBleed = majorBleed;
		this.subBleed = subBleed;
		this.age = age;
	}
	
	//환자가 검사한 혈압 저장
	public void addBloodScore(Score score) {
		scoreList.add(score);
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public ArrayList<Score> getScoreList() {
		return scoreList;
	}

	public void setScoreList(ArrayList<Score> scoreList) {
		this.scoreList = scoreList;
	}

	public Bleed getMajorBleed() {
		return majorBleed;
	}

	public void setMajorBleed(Bleed majorBleed) {
		this.majorBleed = majorBleed;
	}

	public Bleed getSubBleed() {
		return subBleed;
	}

	public void setSubBleed(Bleed subBleed) {
		this.subBleed = subBleed;
	}
	
	
}

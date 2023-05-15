package Ophthalmology;

import java.util.ArrayList;

public class Customer {
	//필드
	private int customerID; //환자번호
	private String customerName; //환자이름
	private Eyes majorEye; //주시안
	private String age; // 학생/성인구분
	private ArrayList<Score> scoreList = new ArrayList<>(); 
	
	//생성자
	public Customer(int customerID, String customerName, Eyes majorEye, String age) {
		this.customerID = customerID;
		this.customerName = customerName;
		this.majorEye = majorEye;
		this.age = age;
	}
	
	//환자가 검사한 눈의 시력 저장
	public void addEyesScore(Score score) {
		scoreList.add(score);
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
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

	public Eyes getMajorEye() {
		return majorEye;
	}

	public void setMajorEye(Eyes majorEye) {
		this.majorEye = majorEye;
	}

	public ArrayList<Score> getScoreList() {
		return scoreList;
	}

	public void setScoreList(ArrayList<Score> scoreList) {
		this.scoreList = scoreList;
	}
	
	
}

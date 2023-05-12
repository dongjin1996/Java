package Ophthalmology;

import java.util.ArrayList;

import utils.Define;

public class Eyes {
	private String EyeName; // 검사한 눈 
	private int EyeID; // 눈의 코드
	private int EyeType; //시력 산출 방법
	private ArrayList<Customer> customerList = new ArrayList<>();
	
	public Eyes(String EyeName, int EyeID) {
		this.EyeName = EyeName;
		this.EyeID = EyeID;
		this.EyeType = Define.LEFT_EYE;
	}
	
	public void register(Customer customer) {
		customerList.add(customer);
	}

	public String getEyeName() {
		return EyeName;
	}

	public void setEyeName(String eyeName) {
		EyeName = eyeName;
	}

	public int getEyeID() {
		return EyeID;
	}

	public void setEyeID(int eyeID) {
		EyeID = eyeID;
	}

	public int getEyeType() {
		return EyeType;
	}

	public void setEyeType(int eyeType) {
		EyeType = eyeType;
	}

	public ArrayList<Customer> getCustomerList() {
		return customerList;
	}

	public void setCustomerList(ArrayList<Customer> customerList) {
		this.customerList = customerList;
	}
	
	
}

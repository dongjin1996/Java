package hospital;

import java.util.LinkedList;

public class Bleed {
	private String BloodName; //혈압 수축기/이완기
	private int BloodID; // 혈압 코드
	private int BloodType;  //혈압 산출 방법
	private LinkedList<Customer> customerList = new LinkedList<>();
	
	public Bleed(String BloodName, int BloodID) {
		this.BloodName = BloodName;
		this.BloodID = BloodID;
	} 
	
	public void register(Customer customer) {
		customerList.add(customer);
	}

	public String getBloodName() {
		return BloodName;
	}

	public void setBloodName(String bloodName) {
		BloodName = bloodName;
	}

	public int getBloodID() {
		return BloodID;
	}

	public void setBloodID(int bloodID) {
		BloodID = bloodID;
	}

	public int getBloodType() {
		return BloodType;
	}

	public void setBloodType(int bloodType) {
		BloodType = bloodType;
	}

	public LinkedList<Customer> getCustomerList() {
		return customerList;
	}

	public void setCustomerList(LinkedList<Customer> customerList) {
		this.customerList = customerList;
	}
	
	
	
	
	
	
}

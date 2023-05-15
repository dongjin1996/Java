package Ophthalmology;

import java.util.ArrayList;

public class Ophthalmology {
	
	private static Ophthalmology instance = null;
	private static String OPHTHALMOLOGY_NAME = "Clean Eye";
	private ArrayList<Customer> customerList = new ArrayList<>();
	private ArrayList<Eyes> eyesList = new ArrayList<>();
	
	private Ophthalmology() {};
	
	public static Ophthalmology getInstance() {
		if (instance == null) {
			instance = new Ophthalmology();
		}
		return instance; 
	}
	
	//환자 등록
	public void addCustomer(Customer customer) {
		customerList.add(customer);
	}
	
	//검사 하는 눈
	public void addEyes(Eyes eyes) {
		eyesList.add(eyes);
	}
	
	//병원 이름 출력
	public static String getOPHTHALMOLOGY_NAME() {
		return OPHTHALMOLOGY_NAME;
	}


	//병원에 등록한 환자 출력
	public ArrayList<Customer> getCustomerList() {
		return customerList;
	}
	
	//검사하러온 눈 방향 출력
	public ArrayList<Eyes> getEyesList() {
		return eyesList;
	}
	

}

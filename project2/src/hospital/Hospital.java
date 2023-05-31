package hospital;

import java.util.ArrayList;
import java.util.LinkedList;

public class Hospital {
	
	private static Hospital instance = null;
	private static String HOSTPITAL_NAME = "Clean blood";
	private LinkedList<Customer> customerList = new LinkedList<>();
	private ArrayList<Bleed> BloodsList = new ArrayList<>();
	
	private Hospital() {};
	
	public static Hospital getInstance() {
		if (instance == null) {
			instance = new Hospital();
		}
		return instance;
	}
	
	
	//환자 등록 
	public void addCustomer(Customer customer) {
		customerList.add(customer);
	}
	
	//혈액 검진 
	public void addBleed(Bleed bleed) {
		BloodsList.add(bleed);
	}

	
	//병원 이름 출력
	public static String getHOSTPITAL_NAME() {
		return HOSTPITAL_NAME;
	}
	
	//병원에 등록한 환자 출력 
	public LinkedList<Customer> getCustomerList() {
		return customerList;
	}
	
	//검사하러온 혈압 출력
	public ArrayList<Bleed> getBloodsList() {
		return BloodsList;
	}
	
	
	
}

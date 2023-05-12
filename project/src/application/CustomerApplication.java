package application;

import Ophthalmology.*;
import Ophthalmology.report.GenerateEyesReport;
import grade.Vision;
import utils.Define;


public class CustomerApplication {
	Ophthalmology cleanEye = Ophthalmology.getInstance();
	Eyes LeftEye; //왼쪽 눈
	Eyes RightEye; //오른쪽 눈
	GenerateEyesReport gradeReport = new GenerateEyesReport();
	
	
	public static void main(String[] args) {
		CustomerApplication test = new CustomerApplication();
		test.createEyes(); // 
		test.createCustomer();
		
		String report = test.gradeReport.getReport();
		System.out.println(report);
	}
	
	//검진 하는 눈 생성
	public void createEyes() {
		LeftEye = new Eyes("왼쪽 눈", Define.LEFT);
		RightEye = new Eyes("오른쪽 눈", Define.RIGHT);
		
		cleanEye.addEyes(LeftEye);
		cleanEye.addEyes(RightEye);
	}
	
	//환자 생성 메소드
	public void createCustomer() {
		Customer customer1 = new Customer(1001, "김아무", LeftEye);
		Customer customer2 = new Customer(1002, "신아무", RightEye);
		Customer customer3 = new Customer(1003, "윤아무", LeftEye);
		Customer customer4 = new Customer(1004, "정아무", RightEye);
		
		//환자 등록
		cleanEye.addCustomer(customer1);
		cleanEye.addCustomer(customer2);
		cleanEye.addCustomer(customer3);
		cleanEye.addCustomer(customer4);
		
		// 눈 검진
		LeftEye.register(customer1);
		LeftEye.register(customer2);
		LeftEye.register(customer3);
		LeftEye.register(customer4);
		RightEye.register(customer1);
		RightEye.register(customer2);
		RightEye.register(customer3);
		RightEye.register(customer4);
		
		// 시력 검사결과 등록
		
		//김아무의 양쪽 눈 시력 검진 결과 등록
		addVisionForCustomer(customer1, LeftEye, 1.0);
		addVisionForCustomer(customer1, RightEye, 1.2);
		
		//신아무의 양쪽 눈 시력 검진 결과 등록
		addVisionForCustomer(customer2, LeftEye, 1.5);
		addVisionForCustomer(customer2, RightEye, 1.3);
		
		//윤아무의 양쪽 눈 시력 검진 결과 등록
		addVisionForCustomer(customer3, LeftEye, 0.7);
		addVisionForCustomer(customer3, RightEye, 0.5);
		
		//정아무의 양쪽 눈 시력 검진 결과 등록
		addVisionForCustomer(customer4, LeftEye, 1.5);
		addVisionForCustomer(customer4, RightEye, 1.3);
				
				
		
		
		}
	// 환자가 시력 검사 결과 등록하는 메소드
	
	public void addVisionForCustomer(Customer customer, Eyes eyes, double vision) {
		Score score = new Score(customer.getCustomerID(), eyes, vision);
		customer.addEyesScore(score); //해당 환자의 시력을 저장
		System.out.println(score.toString());
	
	}
	
}

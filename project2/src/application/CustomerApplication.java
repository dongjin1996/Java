package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import hospital.*;
import hospital.report.GenerateBloodReport;
import utils.Define;

public class CustomerApplication {
	Hospital cleanBlood = Hospital.getInstance();
	Bleed systolic; //수축기
	Bleed relaxation; //이완기
	GenerateBloodReport gradeReport = new GenerateBloodReport();
	
	
	public static void main(String[] args) {
		CustomerApplication test = new CustomerApplication();
		test.createBlood();
		test.createCustomer();
		
		String report = test.gradeReport.getReport();
		System.out.println(report);
		
		//검진 날짜를 구해준다.
		LocalDateTime now = LocalDateTime.now(); 
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd.aHH:mm:ss");
		
		System.out.println("마지막검진 날짜와 시간:" + now.format(dtf));
	}
	
	
	//혈압 검진 수축기.이완기
	public void createBlood() {
		systolic = new Bleed("수축기", Define.systolic);
		relaxation = new Bleed("이완기", Define.relaxation);
		
		cleanBlood.addBleed(systolic);
		cleanBlood.addBleed(relaxation);
	}
	
	//환자 생성 메소드
	public void createCustomer() {
		Customer customer1 = new Customer(1001, "김아무", systolic, "성인");
		Customer customer2 = new Customer(1002, "신아무", relaxation, "학생");
		Customer customer3 = new Customer(1003, "정아무", systolic, "성인");
		Customer customer4 = new Customer(1004, "윤아무", relaxation, "학생");
		
		//환자 등록
		cleanBlood.addCustomer(customer1);
		cleanBlood.addCustomer(customer2);
		cleanBlood.addCustomer(customer3);
		cleanBlood.addCustomer(customer4);
		
		//혈액 검진
		systolic.register(customer1);
		systolic.register(customer2);
		systolic.register(customer3);
		systolic.register(customer4);
		relaxation.register(customer1);
		relaxation.register(customer2);
		relaxation.register(customer3);
		relaxation.register(customer4);
		
		//혈액 검사 결과 등록
		
		//김아무의 혈액 검진 결과 등록
		addBloodForCustomer(customer1, systolic, 112);
		addBloodForCustomer(customer1, relaxation, 79);
		
		//신아무의 양쪽 눈 시력 검진 결과 등록
		addBloodForCustomer(customer2, systolic, 131);
		addBloodForCustomer(customer2, relaxation, 82);
		
		//정아무의 양쪽 눈 시력 검진 결과 등록
		addBloodForCustomer(customer3, systolic, 140);
		addBloodForCustomer(customer3, relaxation, 94);
		
		//윤아무의 양쪽 눈 시력 검진 결과 등록
		addBloodForCustomer(customer4, systolic, 152);
		addBloodForCustomer(customer4, relaxation, 104);
	}
	
	public void addBloodForCustomer(Customer customer, Bleed bleed, int blood) {
		Score score = new Score(customer.getCustomerID(), bleed, blood);
		customer.addBloodScore(score); //해당 환자의 혈압을 저장
		System.out.println(score.toString());
	}

}

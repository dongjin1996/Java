package hospital.report;

import java.util.ArrayList;
import java.util.LinkedList;

import grade.Blood;
import grade.Relaxation;
import grade.Systolic;
import hospital.Bleed;
import hospital.Customer;
import hospital.Hospital;
import hospital.Score;
import utils.Define;

public class GenerateBloodReport {
	Hospital hospital = Hospital.getInstance();
	
	public static final String RESULT = " 혈압 검진 결과표\t\t\n";
	public static final String TITLE = " 혈압 \t\t\n";
	public static final String HEADER = "이름 | 환자번호 | 학생/성인| 수축기/이완기 |결과  \n";
	public static final String LINE = "==============================================\n";
	public static final String LINE2 = "--------------------------------------------\n";
	private StringBuffer buffer = new StringBuffer();
	
	//헤더, 몸통, 푸터 메소드
	
	public String getReport() {
		ArrayList<Bleed> BleedList = hospital.getBloodsList();
		
		for(Bleed bleed : BleedList) {
			makemain();
			makeHeader(bleed);
			makeBody(bleed);
			makeFooter();			
		}
		
		return buffer.toString();
	}
	
	//검진 결과표 메소드
	public void makemain() {
		buffer.append(GenerateBloodReport.LINE);
		buffer.append("\t" + hospital.getHOSTPITAL_NAME());
		buffer.append(GenerateBloodReport.RESULT);
	}
	
	
	//헤더 메소드
	public void makeHeader(Bleed bleed) {
		buffer.append(GenerateBloodReport.LINE);
		buffer.append("\t\t" + bleed.getBloodName());
		buffer.append(GenerateBloodReport.TITLE);
		buffer.append(GenerateBloodReport.LINE2);
		buffer.append(GenerateBloodReport.HEADER);
		buffer.append(GenerateBloodReport.LINE);
	}
	
	
	//몸통 메소드 
	public void makeBody (Bleed bleed) {
		LinkedList<Customer> customerList = bleed.getCustomerList();
		
		for(Customer customer : customerList) {
			buffer.append(customer.getCustomerName()); //환자이름
			buffer.append(" | ");
			buffer.append(customer.getCustomerID()); //환자번호
			buffer.append(" | ");
			buffer.append(customer.getAge()); // 학생/성인구분
			buffer.append("   | ");
			buffer.append(customer.getMajorBleed().getBloodName()); //수축기. 이완기
			buffer.append(" | ");
			
			//환자의 혈압상태 
			
			getScoreGrade(customer, bleed.getBloodID());
			buffer.append(" \n ");
			buffer.append(GenerateBloodReport.LINE);
		}
		
	}
	
	public void getScoreGrade(Customer customer, int bloodID) {
		ArrayList<Score> scoreList = customer.getScoreList();
		
		int majorID = customer.getMajorBleed().getBloodID();
		
		Blood[] blood = {new Systolic(), new Relaxation()};
		
		for(Score score : scoreList) {
			if(score.getBleed().getBloodID() == majorID) {
				String grade;
				
				if(score.getBleed().getBloodID() == majorID) {
				grade = blood[Define.systolic_blood].getBlood(score.getBlood());
			} else {
				grade = blood[Define.relaxation_blood].getBlood(score.getBlood());
			}
				
				buffer.append(score.getBlood());
				buffer.append(" | ");
				buffer.append(grade);
				buffer.append(" | ");
			}
		}
	}

	
	//푸터 메소드
	public void makeFooter() {
		buffer.append("\n");
	}
}

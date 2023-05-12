package Ophthalmology.report;

import java.util.ArrayList;

import Ophthalmology.*;
import utils.Define;
import grade.*;


public class GenerateEyesReport {
	Ophthalmology ophthalmology = Ophthalmology.getInstance(); 
	
	public static final String TITLE = " 시력 \t\t\n";
	public static final String HEADER = "이름 | 환자번호 | 주시안 | 시력 |\t결과  \n";
	public static final String LINE = "=======================================\n";
	private StringBuffer buffer = new StringBuffer();
	
	//헤더, 몸통, 푸터 메소드
	
	public String getReport() {
		ArrayList<Eyes> eyesList = ophthalmology.getEyesList(); 
		
		for(Eyes eyes : eyesList) {
			makeHeader(eyes);
			makeBody(eyes);
			makeFooter();
		}
		
		return buffer.toString();
	}
	
	
	//헤더 메소드 
	public void makeHeader(Eyes eyes) {
		buffer.append(GenerateEyesReport.LINE);
		buffer.append("\t" + eyes.getEyeName());
		buffer.append(GenerateEyesReport.TITLE);
		buffer.append(GenerateEyesReport.HEADER);
		buffer.append(GenerateEyesReport.LINE);
	}
	
	//몸통 메소드
	public void makeBody (Eyes eyes) {
		ArrayList<Customer> customerList = eyes.getCustomerList();
		
		for(Customer customer : customerList) {
			buffer.append(customer.getCustomerName()); //환자이름
			buffer.append(" | ");
			buffer.append(customer.getCustomerID()); //환자번호
			buffer.append(" | ");
			buffer.append(customer.getMajorEye().getEyeName()); // 환자의 주 시안
			buffer.append(" | ");
			
			//환자의 시력, 시력상태(안경착용권장여부)
			
			getScoreGrade(customer, eyes.getEyeID());
			buffer.append(" \n ");
			buffer.append(GenerateEyesReport.LINE);
			
		}
	
	}
	public void getScoreGrade(Customer customer, int eyesID) {
		ArrayList<Score> scoreList = customer.getScoreList();
		
		int majorID = customer.getMajorEye().getEyeID();
		
		Vision[] vision = {new LeftEyeVision(), new RightEyeVision()};
		
		for(Score score : scoreList) {
			if(score.getEyes().getEyeID() == eyesID) {
				String grade;
				
				if(score.getEyes().getEyeID() == majorID) {
					grade = vision[Define.RIGHT_EYE].getVision(score.getVision());
				}else {					
					grade = vision[Define.LEFT_EYE].getVision(score.getVision());
				}
				
				buffer.append(score.getVision());
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

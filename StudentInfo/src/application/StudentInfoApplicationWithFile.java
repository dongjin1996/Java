package application;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import school.School;
import school.Score;
import school.Student;
import school.Subject;
import school.report.GenerateGradeReport;
import utils.Define;

public class StudentInfoApplicationWithFile {
	School goodSchool = School.getInstance(); //학교 객체 생성 (싱글톤)
	Subject korean;
	Subject math;
	
	GenerateGradeReport gradeReport = new GenerateGradeReport();
	
	public static void main(String[] args) throws FileNotFoundException {
		StudentInfoApplicationWithFile test = new StudentInfoApplicationWithFile();
		test.createSubject();
		test.createStudent();
		
		String report = test.gradeReport.getReport();
		System.out.println(report);
		
	}

	public void createSubject() {
		korean = new Subject("국어", Define.KOREA);
		math = new Subject("수학", Define.MATH);
		
		goodSchool.addSubject(korean);
		goodSchool.addSubject(math);
	}
	
	public void createStudent() throws FileNotFoundException {
		FileInputStream is = new FileInputStream("studentinfo.txt");
		//File is = null;
		Scanner scanner = new Scanner(is);
		
		String name;
		int id;
		int koreanScore;
		int mathScore;
		int majorCode;
		Student student = null;
		
		try(is; scanner) { //try -catch문이 끝나면 자동으로 리소스를 닫아준다.
//			is = new File("studentifo.txt");
			
		
			
			while(scanner.hasNextLine()) { //라인에 데이터가 있으면 실행
				name = scanner.next();
				id = scanner.nextInt();
				koreanScore = scanner.nextInt();
				mathScore = scanner.nextInt();
				majorCode = scanner.nextInt();
				
				if(majorCode == Define.KOREA) {
					//국어국문과인 학생을 생성한다.
					student = new Student(id, name, korean);
				} else if(majorCode == Define.MATH) {
					student = new Student(id, name, math);
				} else {
					System.out.println("존재하지 않는 과목 입니다.");
					return;
				}
				
				goodSchool.addStudent(student); //학교에 등록
				korean.register(student); //국어 수강신청
				math.register(student); //수학 수강신청
				
				//시험 점수 등록
				addScoreForStudent(student, korean, koreanScore);
				addScoreForStudent(student, math, mathScore);
			}
			
			//scanner.close();
			//is.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	//학생의 시험점수를 등록하는 메소드
	public void addScoreForStudent(Student student, Subject subject, int point) {
		Score score = new Score(student.getStudentID(), subject, point);
		student.addSubjectScore(score); //해당 학생의 점수를 저장
		System.out.println(score.toString());
	}
	
}

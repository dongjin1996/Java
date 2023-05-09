package school.report;

import java.util.ArrayList;

import grade.BasicEvaluation;
import grade.GradeEvaluation;
import grade.MajorEvaluation;
import school.School;
import school.Score;
import school.Student;
import school.Subject;
import utils.Define;

public class GenerateGradeReport {
	School school = School.getInstance(); //school 싱글톤 객체 생성
	
	public static final String TITLE = "수강생 학점 \t\t\n";
	public static final String HEADER = "이름 | 학번 | 필수과목 | 점수    \n"; 
	public static final String LINE = "------------------------------------\n";
	private StringBuffer buffer = new StringBuffer();
	
	//헤더, 몸통, 푸터를 합쳐주는 메소드
	public String getReport() {
		ArrayList<Subject> subjectList = school.getSubjectList(); //학교에 개설된 과목 리스트를 불러온다
		
		//학교에 개설된 과목을 하나씩 가져온다.
		for(Subject subject : subjectList) {
			makeHeader(subject);
			makeBody(subject);
			makeFooter();	
		}
		
		return buffer.toString(); //StringBuffer => String 타입으로 변경해준다.
	}
	
	//헤더를 만들어주는 메소드
	public void makeHeader(Subject subject) {
		//str += GenerateGradeReport.LINE; 
		buffer.append(GenerateGradeReport.LINE);
		buffer.append("\t" + subject.getSubjectName()); //과목명
		buffer.append(GenerateGradeReport.TITLE);
		buffer.append(GenerateGradeReport.HEADER);
		buffer.append(GenerateGradeReport.LINE);
	}
	
	//몸통을 만들어주는 메소드
	public void makeBody (Subject subject) {
		//해당 과목을 수강신청한 학생 리스트를 가져온다.
		ArrayList<Student> studentList = subject.getStudentList();
		
		for(Student student : studentList) {
			buffer.append(student.getStudentName()); //학생이름
			buffer.append(" | ");
			buffer.append(student.getStudentID()); //학생학번
			buffer.append(" | ");
			buffer.append(student.getMajorSubject().getSubjectName()); //학생 필수과목
			buffer.append(" | ");
			
			//학생별 수강과목의 점수, 학점 계산
			getScoreGrade(student, subject.getSubjectID());
			buffer.append(" \n ");
			buffer.append(GenerateGradeReport.LINE);
		}
	}
	
	//학생의 수강과목 점수와 학점을 얻는 메소드
	public void getScoreGrade(Student student, int subjectID) {
		//학생이 수강한 과목의 점수 리스트(국어, 수학)
		ArrayList<Score> scoreList = student.getScoreList();
		
		//해당 학생의 필수과목 코드
		//Subject majorSubject = student.getMajorSubject();
		
		//필수과목 코드를 가져온다.
		int majorID = student.getMajorSubject().getSubjectID(); // *이해
		
		//GradeEvaluation gradeEvaluation1 = new MajorEvaluation();
		//GradeEvaluation gradeEvaluation2 = new BasicEvaluation();
		
		//GradeEvaluation 타입의 배열에 BasicEvaluation객체의 MajorEvaluation객체를 저장한다.
		// *이해
		GradeEvaluation[] gradeEvaluation = {new BasicEvaluation(), new MajorEvaluation()};
		
		for(Score score : scoreList) {
			//점수에 해당하는 과목의 과목코드를 얻어온다.
			if(score.getSubject().getSubjectID() == subjectID) {
				String grade;
				
				// *이해
				//필수과목일때 학점산출
				if(score.getSubject().getSubjectID() == majorID) {
					 grade = gradeEvaluation[Define.SAB_TYPE].getGrade(score.getPoint());
				} else { //일반과목일때 학점산출
					 grade = gradeEvaluation[Define.AB_TYPE].getGrade(score.getPoint());
				}
				
				buffer.append(score.getPoint());
				buffer.append(":");
				buffer.append(grade);
				buffer.append(" | ");
			}
		}
		
	}
	
	//푸터를 만들어주는 메소드
	public void makeFooter() {
		buffer.append("\n"); //줄바꿈
	}
	
}

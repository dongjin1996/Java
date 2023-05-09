package school;

//어느 학생이 어느 과목 점수가 몇점이다.
public class Score {
	private int studentID; //학번
	private Subject subject; //과목
	private int point; //점수
	
	public Score(int studentID, Subject subject, int point) {
		this.studentID = studentID;
		this.subject = subject;
		this.point = point;
	}

	@Override
	public String toString() { //toSting(): 클래스의 정보를 출력할때 사용
		
		return "학번:" + this.studentID + ", " + subject.getSubjectName() + ":" + point;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
	
	
}

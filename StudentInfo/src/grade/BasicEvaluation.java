package grade;

public class BasicEvaluation implements GradeEvaluation{
	
	//학점 구하는 메소드
	@Override
	public String getGrade(int point) {
		String grade; //학점
		
		if(point >= 90 && point <= 100) {  // 90 ~ 100점
			grade = "A";
		} else if(point >= 80 && point <= 89) { // 80 ~ 89점
			grade = "B";
		} else if(point >= 70 && point <= 79) { // 70 ~ 79점
			grade = "C";
		} else if(point >= 55 && point <= 69) { // 55 ~ 69점
			grade = "D";
		} else {
			grade = "F";
		}
		
		return grade;
	}
	
}

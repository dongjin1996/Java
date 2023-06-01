package grade;

public class Systolic implements Blood{
 
	@Override
	public String getBlood(int point) {
		String blood;
		//이완기
		if(point < 80) {
			blood = "정상";
		} else if (point >= 80  && point <= 89) {
			blood = "고혈압전단계";
		} else if (point >= 90 && point <= 99) {
			blood = "고혈압 1단계";
		} else if (point > 100) {
			blood = "고혈압 2단계";
		} else {
			blood = "측정불가";
		}
		
		return blood;
	}
}

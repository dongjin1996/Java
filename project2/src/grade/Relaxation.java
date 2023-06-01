package grade;

public class Relaxation implements Blood{

	@Override
	public String getBlood(int point) {
		String blood;
		//수축기
		if(point < 120) {
			blood = "정상";
		} else if (point >= 120  && point <= 139) {
			blood = "고혈압전단계";
		} else if (point >= 140 && point <= 159) {
			blood = "고혈압 1단계";
		} else if (point > 160) {
			blood = "고혈압 2단계";
		} else {
			blood = "측정불가";
		}
		
		return blood;
	}

}

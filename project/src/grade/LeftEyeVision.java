package grade;

public class LeftEyeVision implements Vision{

	@Override
	public String getVision(double point) {
		String vision; 
		
		if(point >= 1.5 && point <= 1.3) {
			vision = "좋음";
		} else if ( point >= 1.2 && point <= 1.0 ) {
			vision = "보통";
		} else if ( point >= 0.9 && point <= 0.4) {
			vision = "안경착용권고";
		} else if ( point >= 0.3 && point <= 0.1) {
			vision = "안경착용필수";
		} else {
			vision = "돋보기 착용";
		}
		
		return vision;
	}

}

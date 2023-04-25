package ch05.sec09;

public class ArrayCopyExample {

	public static void main(String[] args) {
		String[] oldstrArray = {"JAVA", "array", "copy"};
		String[] newStrArray = new String[5];
		
		//system.arraycopy (원본배열, 원본배열 시작 인덱스, 
		// 새배열, 새배열 붙여넣기 시작인덱스, 복사 항목수)
		System.arraycopy(oldstrArray, 0, newStrArray, 0, oldstrArray.length);
		
		for(int i=0; i<newStrArray.length; i++) {
			System.out.println(newStrArray[i]);
		}
	}

}

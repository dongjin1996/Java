package ch05.sec09;

public class ArrayCopyByforExample {

	public static void main(String[] args) {
		int[] oldIntArray = {1, 2, 3};
		int[] newIntArray = new int [5];
		
		//배열 복사 
		for(int i=0; i<oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		
		//newIntArray의 값 출력
		for(int i=0; i<newIntArray.length; i++) {
			System.out.println(newIntArray[i]);
		}
		
	}

}

package ch12.sec05;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class StringTokenizerExample {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String data = "자바";
		
		//인코딩(컴퓨터가 알아볼수 있는 언어로 변경) | UTF-8을 제일 많이 쓴다.
		byte[] arr1 = data.getBytes("EUC-KR"); //문자열 => byte배열로 변경 ( UTF-8로 인코딩)
		System.out.println("arr1: " + Arrays.toString(arr1));
		
		//디코딩(사람이 알아볼 수 있는 언어로 변경)
		String str1 = new String(arr1, "EUC-KR"); //byte 배열 => 문자열로 변경
		System.out.println("str: " + str1);
		
		
	}

}

package ch18.sec04.exam01;

import java.io.*;

public class WriteExample {

	public static void main(String[] args) {
		try {
			Writer writer = new FileWriter("C:/Temp/test.txt");
			
			char a = 'A';
			writer.write(a);
			
			char b = 'B';
			writer.write(b);
			
			char[] arr = {'C', 'D', 'E'};
			writer.write(arr);
			
			//문자열 출력
			writer.write("FGH");
			
			//버퍼에 잔류하는 모든 문자열들을 출력하고 버퍼를 비움
			writer.flush();
			writer.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

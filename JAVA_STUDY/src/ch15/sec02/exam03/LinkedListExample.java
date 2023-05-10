package ch15.sec02.exam03;

import java.util.*;

public class LinkedListExample {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		LinkedList<String> list2 = new LinkedList<String>();
		
		long startTime; //시작시간
		long endTime; //끝시간
		
		startTime = System.nanoTime(); //시간 측정
		
		for(int i=0; i<10000; i++) {
			list1.add(0, "list값");
		}
		
		endTime = System.nanoTime();
		System.out.printf("%-17s %8d ns \n", "ArrayList 걸린 시간: ", (endTime-startTime) );
		
		
		startTime = System.nanoTime(); //시간 측정
		
		for(int i=0; i<10000; i++) {
			list2.add(0, "list값");
		}
		
		endTime = System.nanoTime();
		System.out.printf("%-17s %8d ns \n", "LinkedList 걸린 시간: ", (endTime-startTime) );

	}

}

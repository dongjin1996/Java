package ch15.sec04.exam02;

import java.util.*;

public class HashtableExapmle {

	public static void main(String[] args) {
		Map<String, Integer> map = new Hashtable<>();
		
		Thread threadA = new Thread() {

			@Override
			public void run() {
				for(int i=1; i<=1000; i++) {
					map.put(String.valueOf(i), i);					
				}
			}
			
		};
		
		Thread threadB = new Thread() {

			@Override
			public void run() {
				for(int i=1001; i<=2000; i++) {
					map.put(String.valueOf(i), i);		
			}
			
		}
		
		};
		
		//스레드 실행
		threadA.start();
		threadB.start();
		
		try {
			threadA.join();
			threadB.join();
		} catch (Exception e) {
		}
		
		//저장된 총 엔트리 수 얻기
		int size = map.size();
		System.out.println("총 엔트리 수 :" + size);
		System.out.println();
		
	}

 }


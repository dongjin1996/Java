package ch15.sec03.exam02;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet<Member> set = new HashSet<Member>();
		set.add(new Member("홍길동", 30));
		set.add(new Member("홍길동", 30));
		
		System.out.println("총 객체수 :" + set.size());
	}

}

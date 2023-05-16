package java_modeling.ch01.asso3;

import java.util.ArrayList;

public class Student {
	//필드
	private String name;
	//학생 한명은 여러개의 성적을 가질수 있다.
	private ArrayList<Transcript> transcripts; 
	
	//생성자
	public Student(String name) {
		this.name = name;
		transcripts = new ArrayList<>();
	}
	
	//수강신청 추가
	public void addTranscript(Transcript transcript) {
		transcript.add(transcript);
	} 
	
	
}
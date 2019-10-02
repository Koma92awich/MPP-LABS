package problem4;

import java.util.*;

public class Student {
	String id;
	String name;
	List<TranscriptEntry> grades;
	
	public Student() {
		grades = new ArrayList<TranscriptEntry>();
	}
	
	public Transcript getTranscript() {
		return new Transcript(grades, this);
		
	}
	
}

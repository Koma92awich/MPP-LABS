package problem4;
import java.util.*;

/** Shows how the design in this package of classes
 *  allows you to navigate in the way that the class
 *  diagram suggests
 */
public class Main {	
	StudentSectionFactory factory = new StudentSectionFactory();
	Student bob = factory.createStudent("1", "bob");
	Student tim = factory.createStudent("2", "tim");
	Student allen = factory.createStudent("3", "allen");
	Student[] students = {bob, tim, allen};
	Section bio1 = factory.createSection(1, "bio1");
	Section bio2 = factory.createSection(2, "bio2");
	Section math = factory.createSection(3, "math");
	
	public static void main(String[] args) { 
		Main m = new Main();
		m.readDataFromDb();
		
		System.out.println(m.getTranscript(m.tim));
		System.out.println("Grades for math section:\n " + m.getGrades(m.math));
		System.out.println("Courses that Tim took: " + m.getCourseNames(m.tim));
		System.out.println("Students who got A's: " + m.getStudentsWith("A"));
		
		
	}
	
	
	private Transcript getTranscript(Student s) {
		return s.getTranscript();
	}
	private List<String> getCourseNames(Student s) {
		List<TranscriptEntry> all = s.grades;
		List<String> courseNames = new ArrayList<>();
		for(TranscriptEntry te : all) {
			courseNames.add(te.section.courseName);
		}
		return courseNames;
	}
	private List<String> getGrades(Section s) {
		List<String> grades  = new ArrayList<>();
		for(TranscriptEntry t : s.gradeSheet) {
			grades.add(t.grade);
		}
		return grades;
	}
	private List<String> getStudentsWith(String grade) {
		List<String> studentNames = new ArrayList<>();
		for(Student s : students) {
			boolean found = false;
			for(TranscriptEntry te : s.grades) {
				if(!found) {
					if(te.grade.equals(grade)) {
						found = true;
						studentNames.add(s.name);
					}
				}
			}
		}
		return studentNames;
	}
	
	private void readDataFromDb() {
		factory.newTranscriptEntry(bob, bio1, "A");
		factory.newTranscriptEntry(bob, math, "B");
		factory.newTranscriptEntry(tim, bio1, "B+");
		factory.newTranscriptEntry(tim, math, "B");
		factory.newTranscriptEntry(allen, math, "B");
		factory.newTranscriptEntry(allen, bio2, "B+");
	}
	


}

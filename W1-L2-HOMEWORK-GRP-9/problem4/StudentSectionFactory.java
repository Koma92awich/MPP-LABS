/**
 * 
 */
package problem4;

/**
 * @author SARFO PHILIP
 *
 */
public class StudentSectionFactory {
	
	
	/**
	 * Create a new section
	 * @param secNum
	 * @param courseName
	 * @return
	 */
	public Section createSection(int secNum,String courseName) {
		Section section = new Section();
		section.courseName = courseName;
		section.sectionNumber = secNum;
		return section;
	}
	
	/**
	 * Create a New Student
	 * @param id
	 * @param name
	 * @return
	 */
	public Student createStudent(String id,String name) {
		Student student = new Student();
		student.id = id;
		student.name = name;
		return student;
	}
	
	/**
	 * 
	 * @param s
	 * @param sect
	 * @param grade
	 */
	public void newTranscriptEntry(Student s,Section sect,String grade) {
		TranscriptEntry transcriptEntry = new TranscriptEntry();
		transcriptEntry.grade = grade;
		transcriptEntry.section = sect;
		transcriptEntry.student = s;
		
		s.grades.add(transcriptEntry);
		sect.gradeSheet.add(transcriptEntry);
	}
	

}

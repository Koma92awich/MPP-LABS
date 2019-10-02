package problem2A;

public class GradeReport {
	private String grade;
	private Student student;
	
	//package level access
	GradeReport(String grade) {
		this.grade = grade;
		this.student = new Student(this);
	}
	
	
	public String getGrade() {
		return grade;
	}
	
	public void setStudent(Student student) {
		this.student = student;
	}
	
	

}

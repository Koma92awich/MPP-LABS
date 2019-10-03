package problem2A;

public class StudentGradeFactory {
	public static Student createStudent(String name) {
		if(name == null)
			throw new IllegalArgumentException("Name cannot be null");
		
		GradeReport gradeReport = new GradeReport("A");
		
		//Student set in grade report
		Student student =  new Student(gradeReport);
		
		student.setName(name);
		
		return student;
	}
	
	
}

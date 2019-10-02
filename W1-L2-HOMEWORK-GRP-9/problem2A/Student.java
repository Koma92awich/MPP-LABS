package problem2A;

public class Student {
	private String name;
	private GradeReport gradeReport;
	
	//package level
	Student(GradeReport gradeReport) {
		this.gradeReport = gradeReport;
	}
	
    public void setName(String name) {
		this.name = name;
	}
    
    public String getName() {
		return name;
	}
	
	
	@Override
	public String toString() {
		return "Name: "+name+" GradeReport: "+gradeReport.getGrade();
	}
	
}

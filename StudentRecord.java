public class StudentRecord {

	// Properties outlined 
	private Student student;
	
	private Module module;
	
	private double[] marks;
	
	private double finalScore;
	
	private Boolean isAboveAverage;

	//Get Functions with data later in the array 
	public Student getStudents() {
		return this.student;
	}
	public Module getModule() {
		return this.module;
	}
	public double[] getMarks() {
		return this.marks;
	}
	public double getFinalScore() {
		for(int i = 0; i<this.marks.length; i++){
			double[] finalScore = this.getModule().getModuleDescriptor().getContinuousAssignmentWeights();
		return this.finalScore;
	}

// Call Method to later initialise the University Module 
	public StudentRecord(Student student, Module module, double[] marks, double[] finalScore) {
		this.student = student;
		this.module = module;
		this.marks = marks;
		this.finalScore = finalScore;
	}

}

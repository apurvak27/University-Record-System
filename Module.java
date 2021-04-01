public class Module {
	
	// Properties outlined 
	private int year;

	private byte term;

	private ModuleDescriptor module;

	private StudentRecord[] records;

	private double finalAverageGrade;
	

	// Get Functions with data later in the array 
	public int getYear() {
		return this.year;
	}
	public byte getTerm() {
		return this.term;
	}
	public ModuleDescriptor getModule() {
		return this.module;
	}
	public StudentRecord[] getRecords() {
		return this.records;
	}
	public double finalAverageGrade(){
		double totalGrade = 0;
		for(int i = 0; i<this.records.length; i++){
			gradecompile = this.getStudentRecord().getfinalScore()
			double[] finalAverageGrade = gradecompile / this.records.length;
			return finalAverageGrade;
		}
	}

	// Functions to later initialise the array 
	public void setYear(int year) {
		this.year = year;
	}
	public void setTerm(byte term) {
		this.term = term;
	}
	public void setModuleDescriptor(ModuleDescriptor module) {
		this.module = module;
	}
	public void setRecords(StudentRecord[] records) {
		this.records = records;
	}
	public void setFinalAverageGrade(double finalAverageGrade) {
		this.finalAverageGrade = finalAverageGrade;
	}

	// Call Method to later initialise the University module 
	public Module(int year, byte term, ModuleDescriptor module, StudentRecord[] records, double finalAverageGrade) {
		this.year = year;
		this.term = term;
		this.module = module;
		this.records = records;
		this.finalAverageGrade = finalAverageGrade;
	}
	
}


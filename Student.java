public class Student {
	
	// Properties
	private int id;

	private String name;

	private char gender;

	private double gpa;	
	
	private StudentRecord[] records;
	
	// Get Functions
	public int getID() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public char getGender() {
		return this.gender;
	}
	public double getgpa() {
		return this.gpa;
	}
	public StudentRecord[] getStudentRecords() {
		return this.records;
	}

	// Functions to initialise the array 
	public void setID(int id) {
		this.id = id;
	}
	public void setname(String name) {
		this.name = name;
	}
	public void setgender(char gender) {
		this.gender = gender;
	}
	public void setgpa(double gpa) {
		this.gpa = gpa;
	}
	public void setStudentRecord(StudentRecord[] records) {
		this.records = records;
	}

	// Call Method to later initialise the University Module 
	public Student(int id, String name, char gender, double gpa, StudentRecord[] records) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.gpa = gpa;
		this.records = records;
	}


}



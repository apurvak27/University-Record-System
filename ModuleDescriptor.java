public class ModuleDescriptor {
	// Properties
	private String code;

	private String name;

	private double[] continuousAssignmentWeights;

	// Generate Functions
	public String generate_code() {
		return this.code;
	}
	public String generate_name() {
		return this.name;
	}
	public double[] generate_continuousAssignmentWeights() {
		return this.continuousAssignmentWeights;
	}

	// Functions set to later initialise array 
	public void set_name(String name) {
		this.name = name;
	}
	public void set_code(String code){
		this.code = code;
	}
	public void set_continuousAssignmentWeights(double[] continuousAssignmentWeights){
		this.continuousAssignmentWeights = continuousAssignmentWeights;
	}

	// Call Method to later initialise the University Module 
	public ModuleDescriptor(String code, String name, double[] continuousAssignmentWeights) {
		this.code = code;
		this.name = name;
		this.continuousAssignmentWeights = continuousAssignmentWeights;
	}

}
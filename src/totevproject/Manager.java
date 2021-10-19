package totevproject;

public class Manager extends Employee{

	private String depName;

	public Manager(String sSN, String name, double salary, String depName) {
		super(sSN, name, salary);
		this.depName = depName;
	}

	public String getDepName() {
		return depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}
	
	
	
}

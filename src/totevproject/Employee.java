package totevproject;

public class Employee {

	private static String SSN;
	private static String name;
	private static double Salary;
	public Employee(String sSN, String name, double salary) {
		super();
		SSN = sSN;
		this.name = name;
		Salary = salary;
	}
	public static String getSSN() {
		return SSN;
	}
	public static void setSSN(String sSN) {
		SSN = sSN;
	}
	public static String getName() {
		return name;
	}
	public static void setName(String name) {
		Employee.name = name;
	}
	public static double getSalary() {
		return Salary;
	}
	public static void setSalary(double salary) {
		Salary = salary;
	}
	
	
}

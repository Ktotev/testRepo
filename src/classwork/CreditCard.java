package classwork;

public class CreditCard {
	private String firstName;
	private String lastName;
	private String cardNumber;
	private double balance;
	
	public CreditCard(String firstName, String lastName, String cardNumber, double balance) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.cardNumber = cardNumber;
		this.balance = balance;
	}
	
	public void printName() {
		System.out.print(this.firstName + " " + this.lastName);
	}
	
	
	
	
	

}

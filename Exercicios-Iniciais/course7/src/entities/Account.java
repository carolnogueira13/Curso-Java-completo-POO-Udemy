package entities;

public class Account {
	
	private int number;
	private String name;
	private double balance;
	
	
	public Account(int number, String name) {
		this.number = number;
		this.name = name;
	}


	public Account(int number, String name, double inicialDeposit) {
		this.number = number;
		this.name = name;
		deposit(inicialDeposit); // Pq a conta inicia com o depósito inicial, protege o contrutir caso a regra de depósito mudar
	}


	public int getNumber() {
		return number;
	}



	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getBalance() {
		return balance;
	}

	public void deposit(double value) {
		balance += value;
	}
	
	public void withdraw(double value) {
		balance -= value + 5.00;
	}
	
	public String toString() {
		return "Account "
				+ number 
				+ ", Holder: "
				+ name 
				+ ", Balance: $"
				+ String.format("%.2f", balance);
	}
	
	
	

}

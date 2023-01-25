package entities;

public final class SavingAccount extends Account {
	
	private Double interestRate;
	
	public SavingAccount() {
		super();
	}

	public SavingAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalanced() {
		balance += balance * interestRate;
	}
	
	@Override
	public final void withDraw(double amount) {
		balance -= amount;
	}
}

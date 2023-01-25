package entities;

public class CompanyPerson extends Person {

	private int numberOfEmployees;
	
	public CompanyPerson() {
		super();
	}
	
	
	public CompanyPerson(String name, Double anualIncome, int numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}


	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}


	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}


	@Override
	public double taxespaid() {
		if (numberOfEmployees < 10) {
			return getAnualIncome() * 0.16;
		}
		else {
			return getAnualIncome() * 0.14;
		}
	}

}

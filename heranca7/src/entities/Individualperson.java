package entities;

public class Individualperson extends Person {

	private Double healthExpenditures;
	
	public Individualperson() {
		super();
	}
	
	public Individualperson(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}


	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double taxespaid() {
		double taxes = 0.0;
		if (getAnualIncome() < 20000.0) {
			taxes += getAnualIncome() * 0.15;
		}
		else {
			taxes += getAnualIncome() * 0.25;
		}
		
		if (healthExpenditures != null ) {
			taxes -= healthExpenditures * 0.5;
		}
		return taxes;
	}

}

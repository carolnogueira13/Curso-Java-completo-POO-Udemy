package model.entities;

import java.time.LocalDate;

public class Installament {
	
	private LocalDate duaDate;
	private Double amount;
	
	public Installament(LocalDate duaDate, Double amount) {
		this.duaDate = duaDate;
		this.amount = amount;
	}

	public LocalDate getDuaDate() {
		return duaDate;
	}

	public void setDuaDate(LocalDate duaDate) {
		this.duaDate = duaDate;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	
	
	
	

}

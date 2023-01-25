package model.entities;

import model.exception.DomainException;

public class Account {
	
	private Integer number;
	private String holder;
	private Double balance;
	private Double withDraw;
	
	public Account(Integer number, String holder, Double balance, Double withDraw) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withDraw = withDraw;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}


	public Double getWithDraw() {
		return withDraw;
	}

	public void setWithDraw(Double withDraw) {
		this.withDraw = withDraw;
	}
	
	public void deposit(Double amount) {
		balance += amount;
	}
	
	public void withDraw(Double amount) {
		if (amount > withDraw) {
			throw new DomainException("The ammount exceeds withdraw limit.");
		}
		if (amount > balance) {
			throw new DomainException("Not enought balance.");
		}
		balance -= amount;
	}
	
	
	
	

}

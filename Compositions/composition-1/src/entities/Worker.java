package entities;

import java.util.ArrayList;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
	private Department department;
	private List<HourContract> contracts = new ArrayList<>(); // Pq é uma composição do tipo "1 para muitos" então precisa ser uma lista
	
	public Worker() {
		
	}

	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

	
	public void addContract(HourContract contract) {
		contracts.add(contract); // Adicionar na lista o contrato
	}
	
	public void removeContract(HourContract contract) {
		contracts.remove(contract); //  Remover o contrato do trabalhador
	}
	
	public Double income(int month, int year) {
		double sum = baseSalary;
		for (HourContract c : contracts) {
			if (c.getDate().getMonthValue() == month && c.getDate().getYear() == year ) {
				sum += c.totalValue();
			}
	
		}
		return sum;
	}

	
	

}

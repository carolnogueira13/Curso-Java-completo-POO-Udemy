package model.services;

import java.time.LocalDate;

import model.entities.Contract;
import model.entities.Installament;

public class ContractService {
	
	private OnlinePaymentService onlinepaymentservice;
	
	public ContractService(OnlinePaymentService onlinepaymentservice) {
		this.onlinepaymentservice = onlinepaymentservice;
	}
	

	public void processContract(Contract contract, Integer months) {
		
		for (int i= 1; i <= months; i++) {
			LocalDate duaDate = contract.getDate().plusMonths(i);
			double amount = contract.getTotalValue() / months;
			amount += onlinepaymentservice.interest(amount, i);
			amount += onlinepaymentservice.paymentFee(amount);
			Installament installamnt = new Installament(duaDate, amount);
			contract.getInstalaments().add(installamnt);	
			
		}
		
	}

}

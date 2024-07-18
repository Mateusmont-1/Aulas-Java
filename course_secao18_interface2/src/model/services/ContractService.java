package model.services;

import java.util.Calendar;
import java.util.Date;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {
	private OnlinePaymentService onlinePaymentService;
	
	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	public void processContract(Contract contract, Integer months) {
		double baseAmount = contract.getValueContract()/ months;
		for(int i=1; i<=months; i++) {
			
			double amount = baseAmount;
			amount = onlinePaymentService.interest(amount, i);
			amount = onlinePaymentService.paymentFee(amount);
			
			Date dueDate = addMonths(contract.getDateContract(), i);
			
			contract.addInstallments(new Installment(dueDate, amount));
	        }
	    }

	private Date addMonths(Date date, int months) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MONTH, months);
		return cal.getTime();
	}
}

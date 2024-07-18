package model.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {
	private Integer numberContract;
	private Date dateContract;
	private Double valueContract;
	
	private List<Installment> installments = new ArrayList<Installment>();
	
	public Contract() {
	}

	public Contract(Integer numberContract, Date dateContract, Double valueContract) {
		this.numberContract = numberContract;
		this.dateContract = dateContract;
		this.valueContract = valueContract;
	}

	public Integer getNumberContract() {
		return numberContract;
	}

	public void setNumberContract(Integer numberContract) {
		this.numberContract = numberContract;
	}

	public Date getDateContract() {
		return dateContract;
	}

	public void setDateContract(Date dateContract) {
		this.dateContract = dateContract;
	}

	public Double getValueContract() {
		return valueContract;
	}

	public void setValueContract(Double valueContract) {
		this.valueContract = valueContract;
	}

	public List<Installment> getInstallments() {
		return installments;
	}

	public void addInstallments(Installment installment) {
		installments.add(installment);
	}
	
	public void removeInstallments(Installment installment) {
		installments.remove(installment);
	}
	
}

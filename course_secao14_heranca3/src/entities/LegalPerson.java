package entities;

public class LegalPerson extends Person{
	protected Integer numberEmployees;
	
	public LegalPerson() {
	}
	
	
	public LegalPerson(String name, Double annualIncome, Integer numberEmployees) {
		super(name, annualIncome);
		this.numberEmployees = numberEmployees;
	}
	
	
	public Integer getNumberEmployees() {
		return numberEmployees;
	}


	public void setNumberEmployees(Integer numberEmployees) {
		this.numberEmployees = numberEmployees;
	}


	@Override
	public double incomeTax() {
		Double tax = null;
		if(numberEmployees > 10) {
			tax = 0.14;
		}
		else {
			tax = 0.16;
		}
		
		return annualIncome * tax;
	}

}

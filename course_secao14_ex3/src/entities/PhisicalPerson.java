package entities;

public class PhisicalPerson extends Person{
	
	protected Double spentHealth;
	
	public PhisicalPerson() {
	}
	
	public PhisicalPerson(String name, Double annualIncome, Double spentHealth) {
		super(name, annualIncome);
		this.spentHealth = spentHealth;
	}

	public Double getSpentHealth() {
		return spentHealth;
	}

	public void setSpentHealth(Double spentHealth) {
		this.spentHealth = spentHealth;
	}

	@Override
	public double incomeTax() {
		Double tax = null;
		if(annualIncome < 20000.00) {
			tax = 0.15;
		}
		else {
			tax = 0.25;
		}
		
		return (annualIncome * tax) - (spentHealth *0.5);
	}

}
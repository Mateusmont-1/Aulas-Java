package entities;

public class OutsourcedEmployee extends Employee{
	
	protected Double additionalCharge;
	
	public OutsourcedEmployee() {
		super();
	}

	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	public Double payment() {
		Double salary = super.payment();
		salary += (additionalCharge * 1.1);
		return salary;
		// return (valuePerHour * hours) + (additionalCharge * 1.1);
	}
}

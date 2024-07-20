package entities;

public class ImportedProduct extends Product{
	protected Double customsFee;
	
	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}

	@Override
	public String priceTag() {
		return name + " $ " + String.format("%.2f", totalPrice()) + "(Customs fee: " + customsFee + ")";
	}
	
	protected Double totalPrice() {
		return price + customsFee;
	}
	
}
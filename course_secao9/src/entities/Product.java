package entities;

public class Product {
	
	private String name;
	private double price;
	private int quantity;
	
	public Product() {
		
	}
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public double ValorTotalNoEstoque() {
		return price * quantity;
	}
	public void AddProduto(int quantity) {
		this.quantity += quantity;
	}
	public void RemoverProduto(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name 
			+", $ "
			+ String.format("%.2f", price)
			+ ", "
			+ quantity
			+ " unidades, total: $"
			+ String.format("%.2f", ValorTotalNoEstoque());
	}
}

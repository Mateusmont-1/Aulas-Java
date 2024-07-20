package entities;

public class Funcionario {
	private Integer id;
	private String name;
	private Double salary;
	
	public Funcionario(Integer id, String name, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}
	
	public void increaseSalary(double percentage) {
		this.salary += this.salary * percentage / 100.0;
	}
	
	public String toString() {
		return this.id
				+ " , "
				+ this.name
				+ " , "
				+ String.format("%.2f", this.salary);
	}
	
}
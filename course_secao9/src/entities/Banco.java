package entities;

public class Banco {
	private int numero_conta;
	private String name;
	private double saldo;
	
	public Banco(int numero_conta, String name, double saldo) {
		this.numero_conta = numero_conta;
		this.name = name;
		this.saldo = saldo;
	}

	public Banco(int numero_conta, String name) {
		this.numero_conta = numero_conta;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumero_conta() {
		return numero_conta;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void Deposito(double saldo) {
		this.saldo += saldo;
	}
	
	public void Saque(double saldo) {
		this.saldo -= saldo + 5.0;
	}
	
	public String toString() {
		return "Conta " +
				numero_conta +
				", Titular: " +
				name +
				", Saldo: R$ " +
				saldo;
	}
}

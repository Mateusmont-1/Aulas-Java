package entities;

public class Funcionario {
	public String nome;
	public double salarioBruto;
	public double taxa;
	
	public double SalarioLiquido() {
		return salarioBruto - taxa;
	}
	public void AumentoSalarial(double porcentagem) {
		salarioBruto += salarioBruto * porcentagem / 100.0;
	}
	public String toString() {
		return nome
			+ ", $ "
			+ SalarioLiquido();
	}
}

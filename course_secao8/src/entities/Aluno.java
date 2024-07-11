package entities;

public class Aluno {
	public String nome;
	public double n1;
	public double n2;
	public double n3;
	
	public double media() {
		return n1 + n2 + n3;
	}
	
	public double pontosFaltando() {
		if (media() < 60.0) {
			return 60.0 - media();
		}
		else {
			return 0.0;
		}
	}

}

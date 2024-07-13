package entities;

public class Quarto_aluguel {
	private String name;
	private String email;
	private boolean ocupacao;
	private int id_quarto;
	
	public Quarto_aluguel(String name, String email, boolean ocupacao, int id_quarto) {
		super();
		this.name = name;
		this.email = email;
		this.ocupacao = ocupacao;
		this.id_quarto = id_quarto;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isOcupacao() {
		return ocupacao;
	}

	public void setOcupacao(boolean ocupacao) {
		this.ocupacao = ocupacao;
	}

	public int getId_quarto() {
		return id_quarto;
	}

	public void setId_quarto(int id_quarto) {
		this.id_quarto = id_quarto;
	}
	
	
}

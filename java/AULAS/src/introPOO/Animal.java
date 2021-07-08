package introPOO;

public class Animal {
	private int membros;
	private String nome;
	private int olhos; 
	
	
	public Animal(int membros, int olhos, String nome) {
		this.membros = membros;
		this.nome = nome;
		this.olhos = olhos;
	}
	
	public void vive() {
		
	}
	public void respira() {
		
	}
	public void dorme() {
		
	}

	public int getMembros() {
		return membros;
	}

	public void setMembros(int membros) {
		this.membros = membros;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getOlhos() {
		return olhos;
	}

	public void setOlhos(int olhos) {
		this.olhos = olhos;
	}
}

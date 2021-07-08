package listaHerança;

public class Animal {
	private int idade;
	private String nome;
	private boolean som;
	public Animal(int idade, String nome, boolean som) {
		super();
		this.idade = idade;
		this.nome = nome;
		this.som = som;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean isSom() {
		return som;
	}
	public void setSom(boolean som) {
		this.som = som;
	}
	
	public void emitirSom() {
		if(this.som==true) {
			System.out.println("AuauAUAuUAuAAUAuAUAUA");
		}
	}
}

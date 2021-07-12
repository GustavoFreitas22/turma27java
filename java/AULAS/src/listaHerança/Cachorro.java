package listaHerança;

public class Cachorro extends Animal{
	private String rabo;

	public Cachorro(int idade, String nome, boolean som, String rabo) {
		super(idade, nome, som);
		this.rabo = rabo;
	}

	public String getRabo() {
		return rabo;
	}

	public void setRabo(String rabo) {
		this.rabo = rabo;
	}
	
	public void correr() {
		System.out.println("Run forest Run!!!");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Au Au me de comida humano Au Au");
	}
}

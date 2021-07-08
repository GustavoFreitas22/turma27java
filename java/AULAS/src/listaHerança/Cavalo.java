package listaHerança;

public class Cavalo extends Animal {
	private int casco;

	public Cavalo(int idade, String nome, boolean som, int casco) {
		super(idade, nome, som);
		this.casco = casco;
	}

	public int getCasco() {
		return casco;
	}

	public void setCasco(int casco) {
		this.casco = casco;
	}
	
	public void correr() {
		System.out.println("Bora pé de pano!");
	}
	
	public void emitirSom() {
		System.out.println(" *Imagine aqui o som de um CAVALO* ");
	}
}

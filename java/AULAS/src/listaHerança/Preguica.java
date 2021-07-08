package listaHeran�a;

public class Preguica extends Animal {
	private boolean sorrisoFofo;

	public Preguica(int idade, String nome, boolean som, boolean sorrisoFofo) {
		super(idade, nome, som);
		this.sorrisoFofo = sorrisoFofo;
	}

	public boolean isSorrisoFofo() {
		return sorrisoFofo;
	}

	public void setSorrisoFofo(boolean sorrisoFofo) {
		this.sorrisoFofo = sorrisoFofo;
	}
	
	public void subirArvore() {
		System.out.println("Bateu a maior pregui�a, vou tirar um cochilo no gaio");
	}
	
	public void emitirSom() {
		System.out.println("�N�o me importa quem come�ou. Eu acabo com isso.�\n - Sid, Era do Gelo");
	}
}

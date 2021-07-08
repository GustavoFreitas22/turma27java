package introPOO;

public class Mamiferos extends Animal {
	private int mamas;
	
	public Mamiferos(int mamas, String nome, int membros, int olhos) {
		super(olhos, membros, nome);
		this.mamas = mamas;
	}

	public int getMamas() {
		return mamas;
	}

	public void setMamas(int mamas) {
		this.mamas = mamas;
	}
	
}

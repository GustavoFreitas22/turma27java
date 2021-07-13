package ninjas;

public class Gaara extends Ninja{
	private int qtdAreia;
	private int golpe;

	public Gaara(String nome, String aldeia, int forca) {
		super(nome, aldeia, forca);
	}

	public int getQtdAreia() {
		return qtdAreia;
	}

	public void setQtdAreia(int qtdAreia) {
		this.qtdAreia = qtdAreia;
	}
	
	public int caixaoDeAreia() {
		System.out.println("-Gaara:\nCaix�o de areia!!!");
		this.golpe = 80*this.getForca();
		return golpe;
	}
	public int golpePadrao() {
		System.out.println("-Gaara:\nVoc� � fraco demais!\nGolpe de areia!");
		this.golpe=25*this.getForca();
		return this.golpe;
	}
	public void escudoDeAreia(int danoGolpe) {
		if(qtdAreia<(danoGolpe/2)) {
			System.out.println("-Gaara:\nO ataque foi muito forte!\nN�o consegui me Defender!!!");
			this.receberGolpe(danoGolpe);
		}else {
			System.out.println("-Gaara:\nIsso n�o vai passar pela defesa perfeita!");
			this.qtdAreia = this.qtdAreia-(danoGolpe/2);
		}
	}
	public void carregarAreia() {
		System.out.println("-Gaara:\nAreia, volte para mim!");
		this.qtdAreia += 60;
	}
	
}
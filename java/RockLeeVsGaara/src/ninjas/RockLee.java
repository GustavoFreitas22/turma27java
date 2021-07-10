package ninjas;

public class RockLee extends Ninja{
	private int qtdDesvios = 10;
	private boolean peso = true;
	private boolean portao = false;
	private int golpe;
	public RockLee(String nome, String aldeia, int forca) {
		super(nome, aldeia, forca);
	}
	public int getQtdDesvios() {
		return qtdDesvios;
	}
	public void setQtdDesvios(int qtdDesvios) {
		this.qtdDesvios = qtdDesvios;
	}
	public boolean isPeso() {
		return peso;
	}
	public void setPeso(boolean peso) {
		this.peso = peso;
	}
	public int getGolpe() {
		return golpe;
	}
	public void setGolpe(int golpe) {
		this.golpe = golpe;
	}
	
	public void desviar(int danoGolpe) {
		if(this.qtdDesvios==0) {
			System.out.println("Não posso mais desviar!");
			this.receberGolpe(danoGolpe);
		}else{
			this.qtdDesvios--;
			System.out.println("Ainda posso desviar: "+this.qtdDesvios);
		}
	}
	public int soco() {
		if(peso==false) {
			System.out.println("Uau, aqueles pesos estavam me segurando mesmo!");
			this.golpe = 20*this.getForca(); 
		}else {
			System.out.println("Aaaaaa toma isso!");
			this.golpe = 10*this.getForca();
		}
		return golpe;
	}
	public int chute() {
		if(peso==false) {
			System.out.println("Aaaaaah dessa vez voce não escapa!");
			this.golpe = 30*this.getForca(); 
		}else {
			System.out.println("Aaaaaa toma isso!");
			this.golpe = 15*this.getForca();
		}
		return golpe;
	}
	public void tirarPeso() {
		this.peso = false;
		System.out.println("Obrigado por me deixar tirar os pesos Gai Sensei");
	}
	public int lotusPrimaria() {
		if(peso==false) {
			System.out.println("Esse é o meu golpe definitivo!");
			this.golpe = 120; 
		}else {
			System.out.println("Eu vou mostrar que o esforço vence o talento nato!");
			this.golpe = 80;
		}
		return golpe;
	}
	public void abrirPortoesChakra() {
		
		this.setForca(10);
		System.out.println("Essa é a minha técnica lendaria!!!\nPortão da dor ABRAAAAAA!!! ");
		this.qtdDesvios+=10;
	}
}

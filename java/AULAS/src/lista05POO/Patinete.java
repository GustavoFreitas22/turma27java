package lista05POO;

public class Patinete {
	private String modelo;
	private int velocidade;
	private String cor;
	private boolean freio;
	private int manobras;
	
	public Patinete(String modelo, String cor) {
		this.modelo = modelo;
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public boolean isFreio() {
		return freio;
	}

	public void setFreio(boolean freio) {
		this.freio = freio;
	}

	public int getManobras() {
		return manobras;
	}

	public void setManobras(int manobras) {
		this.manobras = manobras;
	}
	
	public void anda() {
		if(freio==true) {
			System.out.println("Eai user... bora soltar o freio?");
		}else {
			velocidade++;
			System.out.println("Você já está com a velocidade: "+velocidade+"km/h");
		}
		
	}
	public void parar() {
		for (int i = velocidade; i> 0; i--) {
			velocidade--;
			System.out.println("Você já está com a velocidade: "+velocidade+"km/h");
		}
		freio = true;
		
	}
	public void soltarFreio() {
		freio = false;
	}
	public void lacarAbraba() {
		manobras++;
		System.out.println("Ta doido, tu já lançou "+manobras+" manobras!!! Massa demais!");
	}
}

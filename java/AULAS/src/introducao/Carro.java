package introducao;

public class Carro {
	public String modelo;
	public int ano;
	public String cor;
	public String marca;
	public int velocidade = 0 ;
	public boolean ligado;
	
	public int ganharVelo(int acelerar){
		velocidade += acelerar;
		return velocidade;
	}
	public int perderVelo(int desacelerar) {
		velocidade-= desacelerar;
		return velocidade;
	}
	public void ligar() {
		ligado = true;
	}
	public void desligar() {
		ligado = false;
		if(velocidade==0) {
			System.out.println("Desligando...");
		}else {
			System.out.println("Pediu pra parar PAROU!!!");
		}
	}
	
}

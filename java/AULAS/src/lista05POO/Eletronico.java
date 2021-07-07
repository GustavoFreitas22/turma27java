package lista05POO;

public class Eletronico {
	String nome;
	int volts;
	String marca;
	boolean ligado;
	boolean tomada;
	
	public void ligado() {
		if(tomada==true) {
			System.out.println("Taca-le pau pra ligar isso!");
			ligado = true;
		}else {
			System.out.println("Bota na tomada isso aí, meu considerado!!!");
		}
	}
	public void desligar() {
		if(tomada==true) {
			System.out.println("Tira da tomada! Bandeira vermelha 2 ta a solta!!!");
			ligado = false;
		}else {
			System.out.println("Desligando...");
		}
	}
	public void colocarTomada() {
		tomada=true;
	}
	public void tirarTomada() {
		tomada=false;
	}
	
}

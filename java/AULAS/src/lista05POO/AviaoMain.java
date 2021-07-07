package lista05POO;

public class AviaoMain {

	public static void main(String[] args) {
		Aviao tecoTeco = new Aviao();
		
		tecoTeco.modelo = "Teco-Teco do GTA San Andreas";
		tecoTeco.rodas = 3;
		tecoTeco.tipo = "Passageiros: 2";
		tecoTeco.ligado = false;
		tecoTeco.noAr = false;
		tecoTeco.velocidade = 0;
		
		
		System.out.println("Bora vua!!!");
		tecoTeco.ligar();
		tecoTeco.aumentaVelo(80);
		tecoTeco.decola();
		tecoTeco.pousa();
		tecoTeco.desliga();
		
		
		
		
	}

}

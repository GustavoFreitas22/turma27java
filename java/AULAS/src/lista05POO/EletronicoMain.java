package lista05POO;

public class EletronicoMain {

	public static void main(String[] args) {
		Eletronico tv = new Eletronico();
		
		tv.nome = "Samsumg 50' FULL-HDD";
		tv.volts = 220;
		tv.marca = "Samsumg";
		
		System.out.println("Bora assistir Sherek 2 !!!");
		
		tv.colocarTomada();
		tv.ligado();
		System.out.println("Ta doido Sherek é bom demais!");
		tv.desligar();
		tv.tirarTomada();
		System.out.println("A tomada está: "+tv.tomada+"\nAgora sim, ninguem é socio da Ligth aqui não");

	}

}

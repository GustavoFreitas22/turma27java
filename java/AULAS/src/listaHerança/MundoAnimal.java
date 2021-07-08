package listaHerança;

public class MundoAnimal {

	public static void main(String[] args) {
		Cachorro caramelo = new Cachorro(4, "Vira lata caramelo", true, "Rabo longo");
		Cavalo peDePano = new Cavalo(5, "Pé de Pano", true, 4);
		Preguica sid = new Preguica(6, "Sid", true, true);
		
		sid.emitirSom();
		caramelo.emitirSom();
		peDePano.emitirSom();
		
		

	}

}

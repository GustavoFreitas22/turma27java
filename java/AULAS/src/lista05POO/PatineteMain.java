package lista05POO;

public class PatineteMain {

	public static void main(String[] args) {
		
		Patinete juju = new Patinete("Mandrake", "Cor de juliette");
		
		System.out.println("Meu patinete é um: "+juju.getModelo());
		juju.soltarFreio();
		for(int i = 0; i<10; i++) {
			juju.anda();
		}
		juju.lacarAbraba();
		juju.lacarAbraba();
		juju.parar();
		
		

	}

}

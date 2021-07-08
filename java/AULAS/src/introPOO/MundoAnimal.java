package introPOO;

public class MundoAnimal {

	public static void main(String[] args) {
		Mamiferos teste1 = new Mamiferos(2, "Teste", 4, 6);
		
		System.out.println(teste1.getNome());
		teste1.vive();

	}

}

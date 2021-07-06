package introducao;

public class TesteEquals {

	public static void main(String[] args) {
		
		String nome = "Ed";
		String names[] = {"Teste1", "Teste2"};
		
		for(int i = 0; i<names.length;i++) {
			if(names[i].equals("Teste1")) {
				System.out.println("É sim");
			}else {
				System.out.println("É nada");
			}
		}
		
		
		
	}

}

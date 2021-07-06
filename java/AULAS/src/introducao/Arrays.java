package introducao;

import java.util.*;

public class Arrays {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		String matricula[] = new String[4];
		
		String alunos[] = new String[4];
		
		String names[] = {"Teste1", "Teste2", "Teste3", "teste4"};
		
		int cod[] = {1, 2, 3, 4};
		
		
		System.out.println(names[3].isBlank());
		System.out.println(names[1].toUpperCase());
		System.out.println(cod[2]);
		
		for(int i = 0; i<alunos.length; i++) {
			System.out.println("Digite ai:");
			alunos[i] = read.nextLine();
			matricula[i] = "MAT-"+(i+1);
			System.err.println("Aluno cadastrado cod: "+matricula[i]);
		}
		for(String x: alunos) {
			System.out.println(x);
			
		}
		System.out.println("Digita ai");
		alunos[1] = read.nextLine();// le a linha completa, bom para ler frases!!!
		if(alunos[1].length()>15) {
			System.out.println("Eita nome grande");
		}
		
		for(int i = 0; i<alunos.length;i++) {
			System.out.println(alunos[i].equals(names));
		}
	}

}

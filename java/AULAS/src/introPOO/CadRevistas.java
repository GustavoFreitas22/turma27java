package introPOO;

import java.util.*;

public class CadRevistas {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		Pessoa cliente = new Pessoa();
		int anoAtual = 0;
		
		
		System.out.println("Digite o teu nome: ");
		cliente.nome = read.next();
		System.out.println("Digite o ano de nascimento: ");
		cliente.nascimento = read.nextInt();
		if(cliente.retornaIdade(2021)>=18) {
			System.out.println("ta liberado meu bom!");
		}else {
			System.out.println("Ai não em meu jovem hehe");
		}
		
	}

}

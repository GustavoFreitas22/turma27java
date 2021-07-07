package introPOO;

import java.util.Scanner;

import introducao.Carro;

public class main {

	public static void main(String[] args) {
		Pessoa amigo = new Pessoa(); // instancia de pessoa
		Carro fuscao = new Carro();
		Scanner read = new Scanner(System.in);
		amigo.nascimento = 2000;
		int anoAtual;
		
		System.out.println("Digite o teu nome: ");
		amigo.nome = read.next();
		read.nextLine();
		System.out.println("Sexo M/F/O?");
		amigo.sex = read.next().charAt(0);
		read.nextLine();
		System.out.println("Qual o modelo do teu carro:");
		fuscao.modelo = read.next();
		read.nextLine();
		System.out.println("Digite o ano atual");
		anoAtual = read.nextInt();
		System.out.println("O nosso amigo: "+ amigo.nome +" tem um "+ fuscao.modelo+" e a idade dele é: "+amigo.retornaIdade(anoAtual));
//		amigo.calcIdade();
		
		
	}

}

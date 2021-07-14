package TryCatch;

import java.util.Scanner;

public class TesteErro {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int valor=0;
		String nome[] = new String[3];
		
		
		try {
			System.out.println("Digite a posição para cadastro do nome [0-2]");
			valor = read.nextInt();
			System.out.println("Digita o nome:");
			nome[valor] = read.next();
		}catch(java.lang.ArrayIndexOutOfBoundsException e){
			System.out.println("Ai é osso");
		}
		
		
		System.out.println("O "+ nome[valor] + " esta na posisção "+valor);
	}

}

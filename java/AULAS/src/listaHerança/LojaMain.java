package listaHerança;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LojaMain {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		String nome;
		int preco;
		List <Produto> item = new ArrayList();
		
		for(int i = 0; i<2; i++) {
			System.out.println("Qual o nome do produto?");
			nome = read.next();
			System.out.println("Qual o preço dele?");
			preco = read.nextInt();
			item.add(new Produto(nome, preco));
		}
		System.out.println("------------------------------");
		for(Produto estoque: item ) {
			System.out.println(estoque.getNome());
		}
		System.out.println("------------------------------");
		item.remove(1);
		System.out.println("LISTA ATUALIZADA:");
		for(Produto estoque: item ) {
			System.out.println(estoque.getNome());
		}
	}

}

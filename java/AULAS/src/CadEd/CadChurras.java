package CadEd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadChurras {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		List<String> listaChurras = new ArrayList<>();
		
		listaChurras.add("Linguica");
		listaChurras.add("Farofa");
		listaChurras.add("Carne");
		listaChurras.add("Pão de alho");
		listaChurras.add("Cerveja");
		listaChurras.add("Pagodinho dos antingos");
		listaChurras.add("Franguinho");
		listaChurras.add("Salada de maionese");
		listaChurras.add(1, "Barriga de poico");
		
		for(String item: listaChurras) {
			System.out.println("Item: "+item);
		}
		System.out.println("Quantidade de itens: "+listaChurras.size());
		
		listaChurras.remove(5);
		
		System.out.println("*LISTA ATUALIZADA*");
		for(String item: listaChurras) {
			System.out.println("Item: "+item);
		}
	}

}

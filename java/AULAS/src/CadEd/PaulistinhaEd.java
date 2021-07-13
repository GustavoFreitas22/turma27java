package CadEd;

import java.util.*;

public class PaulistinhaEd {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		List<Time> tabela = new ArrayList<>();
		
		tabela.add(new Time("Vasco"));
		tabela.add(new Time("Athletico Paranaense"));
		tabela.add(new Time("Baiha"));
		tabela.add(new Time("Criciuma"));
		
		System.out.println(tabela.indexOf("Vasco"));
		
		for(Time equipes: tabela) {
			System.out.println(equipes.getNome());
		}
	}
}

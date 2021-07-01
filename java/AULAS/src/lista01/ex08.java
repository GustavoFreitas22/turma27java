package lista01;

import java.util.*;

public class ex08 {
	public static void main(String[] args) {
		double custoF, custoDist, valorF, imposto;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o custo do carro para a fabrica: ");
		custoF = leia.nextDouble();
		
		custoDist = custoF*0.28;
		imposto = custoF*0.45;
		valorF = custoF+imposto+custoDist;
		
		System.out.printf("O valor final do carro é de R$%.2f", valorF);
	}
}

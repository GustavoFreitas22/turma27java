package lista02;

import java.util.*;

public class ex02 {

	public static void main(String[] args) {
		double peso, excesso, multa;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o peso de tomates: ");
		peso = ler.nextDouble();
		
		if (peso > 50) {
			excesso = peso - 50;
			multa = excesso*4;
			
			System.out.printf("O valor da multa é de: R$%.0f", multa);
		}else {
			peso = 0;
			excesso = 0;
			multa = 0;
			System.out.println("Valores zerados!");
		}

	}

}

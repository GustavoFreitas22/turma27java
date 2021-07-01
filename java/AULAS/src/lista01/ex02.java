package lista01;

import java.util.*;

public class ex02 {
	public static void main(String [] args) {
		int idade, dias, anos, meses;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a tua idade: ");
		idade= leia.nextInt();
		
		anos = idade/365;
		meses = (idade%365)/30;
		dias = (idade%365)%30;
		
		System.out.printf("o resultado é %d anos %d meses e %d dias", anos, meses, dias);
	}
}


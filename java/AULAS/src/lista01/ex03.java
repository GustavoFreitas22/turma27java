package lista01;

import java.util.*;

public class ex03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int tempo, horas, min, seg;
		
		System.out.println("Digite o Valor do tempo: ");
		tempo = leia.nextInt();
		
		horas = tempo/3600;
		min = (tempo%3600)/60;
		seg = (tempo%3600)%60;
		
		System.out.printf("O valor é de %d horas %d minutos e %d segundos", horas, min, seg);

	}

}

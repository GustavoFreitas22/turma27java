package lista03;

import java.util.*;

public class Ex03 {

	public static void main(String[] args) {
		int idade=0, menor21=0, maior50=0;
		
		Scanner read = new Scanner(System.in);
		
		while(idade!=99) {
			System.out.println("Digite a idade: ");
			idade= read.nextInt();
			
			if(idade<21) {
				menor21++;
			}else if(idade>50) {
				maior50++;
			}
		}
			System.out.printf("Idades acima de 50: %d\nIdades abaixo de 21: %d", maior50, menor21);
	}

}

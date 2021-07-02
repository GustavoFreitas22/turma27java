package lista02;

import java.util.Scanner;

public class exLista03 {

	public static void main(String[] args) {
		int idade = 0;
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite o valor da idade: ");
		idade = read.nextInt();
		
		
		if(idade>=10 && idade <=14) {
			System.out.println("Infantil");
		}else if(idade>15 && idade <=17) {
			System.out.println("Juvenil");
		}else if(idade>18 && idade <=25) {
			System.out.println("Adulto");
		}

	}

}

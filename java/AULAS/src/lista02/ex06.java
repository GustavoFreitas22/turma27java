package lista02;

import java.util.*;

public class ex06 {

	public static void main(String[] args) {
		int idade = 0;
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite o valor da idade: ");
		idade = read.nextInt();
		
		
		if(idade>=5 && idade <=7) {
			System.out.println("Infantil A");
		}else if(idade>7 && idade <=11) {
			System.out.println("Infantil B");
		}else if(idade>11 && idade <=13) {
			System.out.println("Juvenil A");
		}else if(idade>13 && idade <=17) {
			System.out.println("Juvenil B");
		}else if(idade>17) {
			System.out.println("Adulto");
		}
		

	}

}

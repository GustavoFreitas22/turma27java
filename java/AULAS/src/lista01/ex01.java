package lista01;

import java.util.*;

public class ex01 {

	public static void main(String[] args) {
		int anos, meses, dias, soma;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite os anos: ");
		anos = leia.nextInt();
		System.out.println("Digite os meses: ");
		meses = leia.nextInt();
		System.out.println("Digite os dias: ");
		dias = leia.nextInt();
		
		anos = anos*365;
		meses = meses*30;
		dias += anos + meses;
		
		System.out.println("O total de dias é: "+dias);
	}

}

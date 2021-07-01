package introducao;

import java.util.*;

public class programaScanner {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String name;
		int ano;
		double salario;
		
		System.out.println("Digite o valor: ");
		name = leia.next();
		
		System.out.println("Digite o ano de nascimento: ");
		ano = leia.nextInt();
		
		System.out.println("Digite o valor do salario: ");
		salario = leia.nextDouble();
		
		System.out.printf("%s nasceu em %d e o salario é de: %.2f ", name, ano, salario);
	}
}

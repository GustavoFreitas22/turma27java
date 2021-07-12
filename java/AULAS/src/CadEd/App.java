package CadEd;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;


public class App {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		List <Funcionario> lista = new ArrayList<>();
		
		System.out.println("Cadastro de Funcionarios");
		int numero = read.nextInt();
		
		// Isso aqui é tipo o Naruto fazendo Clone
		
		for(int i = 0; i<numero; i++) {
			System.out.println("Funcionario: "+i);
			System.out.println("Funcionario é tercerizado?[S/N]");
			char op = read.next().toUpperCase().charAt(0);
			System.out.println("Digite a matricula do funcionario: ");
			String matricula = read.next();
			System.out.println("Digite as horas trabalhadas: ");
			int horasTrabalhadas = read.nextInt();
			System.out.println("Digite o valor da hora: ");
			double valorHora = read.nextDouble();
			
			if(op == 'S') {
				System.out.println("Digite o adicional");
				double adicional = read.nextDouble();
				lista.add(new Terceiro(matricula, horasTrabalhadas, valorHora, adicional));
			}else if(op == 'N') {
				lista.add(new Funcionario(matricula, horasTrabalhadas, valorHora));
			}
		}
		System.out.println("*************************************************");
		System.out.println("Folha de pagamento");
		for(Funcionario emp : lista) {
			System.out.println("Matricula: "+emp.getMatricula()+"    salario:"+emp.salario());
		}
	}
}

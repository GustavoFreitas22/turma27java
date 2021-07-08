package app;

import java.util.Random;
import java.util.Scanner;

import entidades.Conta;
import entidades.ContaEspecial;

public class MainApp {

	public static void main(String[] args) {
		int numero;
		String nome;
		Random num = new Random();
		Scanner read = new Scanner(System.in);
		System.out.println("Salve jovem, qual o teu vulgo?");
		nome=read.next();
		numero = num.nextInt(1000);
		
		ContaEspecial c1 = new ContaEspecial(numero,nome, 1000);
		
		c1.credito(100);
		c1.debito(200);

	}

}

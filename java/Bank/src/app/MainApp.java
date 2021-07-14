package app;

import java.util.*;
import javax.swing.*;
import entidades.Conta;
import entidades.ContaEspecial;
import entidades.ContaPoupanca;
import entidades.contaEstudante;

public class MainApp {

	public static void main(String[] args) {
		int opc;
		int numero;
		String nome;
		int dia=0;
		
		// Criação de conta:
		Random random = new Random();
		numero = random.nextInt(1000);
		nome= JOptionPane.showInputDialog("Seja Bem Vinde ao Banco FCBM!\nPoderia nos informar seu nome?");
		dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia de hoje:"));
		JOptionPane.showMessageDialog(null,"Olá "+nome+" sua conta foi aberta!\nO numero dela é: "+numero);
		
		
		// Instanciando Objetos:
		ContaEspecial contEspecial = new ContaEspecial(numero, nome, 1000);
		ContaPoupanca contPoup = new ContaPoupanca(numero, nome, dia);
		contaEstudante contEstu = new contaEstudante(numero, nome);
		
		do {
			JOptionPane.showMessageDialog(null,"Bem Vindo ao Banco G8 - FCBM\nJuntos fazemos o seu Dinheiro evoluir!");
			opc = Integer.parseInt(JOptionPane.showInputDialog("Por favor digite a opção desejada:\n 1- Conta poupanca\n 2- Conta corrente\n 3- Conta Especial\n 4- Conta Empresa\n 5- Conta Estudantil\n 6- Sair\n"));
			
			switch(opc) {
				case 1:
					contPoup.telas();
					break;
				case 2:
					JOptionPane.showMessageDialog(null,"Estamos implementando! :)");
					break;
				case 3:
					contEspecial.telas();
					break;
				case 4:
					JOptionPane.showMessageDialog(null,"Estamos implementando! :)");
					break;
				case 5:
					contEstu.telas();
					break;
				case 6:
					JOptionPane.showMessageDialog(null,"Obrigado e volte sempre!");
					// piadinha do foguete
					break;
				default:
					JOptionPane.showMessageDialog(null,"Opção invalida!\nTente Novamente!");
			}
			
		}while(opc!=6);

	}

}

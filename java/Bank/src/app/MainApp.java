package app;

import javax.swing.*;
import entidades.Conta;
import entidades.ContaEspecial;

public class MainApp {

	public static void main(String[] args) {
		int opc;
		
		ContaEspecial teste = new ContaEspecial(99, "Jose", 1000);
		
		do {
			JOptionPane.showMessageDialog(null,"Bem Vindo ao Banco G8 - FCBM\nJuntos fazemos o seu Dinheiro evoluir!");
			opc = Integer.parseInt(JOptionPane.showInputDialog("Por favor digite a opção desejada:\n 1- Conta poupanca\n 2- Conta corrente\n 3- Conta Especial\n 4- Conta Empresa\n 5- Conta Estudantil\n 6- Sair\n"));
			
			switch(opc) {
				case 1:
					teste.telas();
					break;
				case 2:
					JOptionPane.showMessageDialog(null,"Estamos implementando! :)");
					break;
				case 3:
					JOptionPane.showMessageDialog(null,"Estamos implementando! :)");
					break;
				case 4:
					JOptionPane.showMessageDialog(null,"Estamos implementando! :)");
					break;
				case 5:
					JOptionPane.showMessageDialog(null,"Estamos implementando! :)");
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

package luta;

import ninjas.*;
import javax.swing.*;

/*
 * Pensar em como fazer o sistema de turnos
 * Testar functions e outputs
 * Pensar em como definir o vencedor e mostrar na tela
 * */
public class Main {

	public static void main(String[] args) {
		Gaara gaara = new Gaara("Gaara", "Aldeia da Areia", 2);
		RockLee lee = new RockLee("RockLee", "Aldeia da folha", 4);
		int opc = 0;
		int turno;
		
		lee.soco();
		
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog(">>Bem vindo a luta Rock Lee Vs Gaara!<<\nPor favor Digite:\n1- Para começar a luta\n2- Saber o vencedor da luta\n3-Sair"));
			switch(opc) {
			case 1:
				luta();
				break;
			case 2:
				mostraVenc();
				break;
			case 3:
				System.out.println("Obrigado por ter aparecido! Volte sempre :)");
				break;
			default:
				JOptionPane.showMessageDialog(null,"Opção invalida");
				break;
			}
		}while(opc!=3);
	}
	public static void luta() {
		System.out.println("Ainda estamos implementando :)");
	}
	public static void mostraVenc() {
		System.out.println("Ainda estamos implementando :)");
	}

}

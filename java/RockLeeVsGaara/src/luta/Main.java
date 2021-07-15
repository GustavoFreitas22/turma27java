package luta;

import ninjas.*;
import javax.swing.*;
import java.util.*;
/*
 * Pensar em como fazer o sistema de turnos
 * Testar functions e outputs
 * Pensar em como definir o vencedor e mostrar na tela
 * */
public class Main {

	public static void main(String[] args) {
		
		int opc = 0;
		
		
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
		Random acao = new Random();
		Gaara gaara = new Gaara("Gaara", "Aldeia da Areia", 2);
		RockLee lee = new RockLee("RockLee", "Aldeia da folha", 4);
		int opc, turno = 1, desvio;
		
		JOptionPane.showMessageDialog(null,"Olá! Eu sou o RockLee e vou derrotar o Gaara apenas com o meu esforço! *-*");
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog(">>Estamos no turno: <<"+turno+"\nDigite:\n1- Soco\n2- Chute \n3- Usar a Lotus Primaria\n4- Tirar os pesos\n5- Abrir os portões de chakra"));
			lee.mostraStatus();
			switch(opc) {
			case 1:
				lee.soco();
				desvio = acao.nextInt(1)+1;
				if(desvio>0) {
					gaara.escudoDeAreia(lee.soco());
				}else {
					gaara.receberGolpe(lee.soco());
				}
				break;
			case 2:
				lee.chute();
				desvio = acao.nextInt(1)+1;
				if(desvio>0) {
					gaara.escudoDeAreia(lee.chute());
				}else {
					gaara.receberGolpe(lee.chute());
				}
				break;
			case 3:
				lee.lotusPrimaria();
				desvio = acao.nextInt(1)+1;
				if(desvio>0) {
					gaara.escudoDeAreia(lee.lotusPrimaria());
				}else {
					gaara.receberGolpe(lee.lotusPrimaria());
				}
				break;
			default:
				JOptionPane.showMessageDialog(null,"Opção invalida");
				break;
			}
			
		}while(opc!=99);
		
		
		
	}
	public static void mostraVenc() {
		System.out.println("Ainda estamos implementando :)");
	}

}

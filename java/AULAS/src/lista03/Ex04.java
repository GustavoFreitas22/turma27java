package lista03;

import javax.swing.*;

public class Ex04 {

	public static void main(String[] args) {
		int idade = 0;
		char sexo; // (1- feminino/ 2- Masculino/ 3- outro)
		char opcao;
		int pessoasCalmas = 0,mulheresNervosas = 0, homensAgressivos = 0, outrosCalmos = 0, pessoasNervosas40mais = 0, pessoasCalmas18menos = 0;
		char opc = 'S';
		final int LIMITE = 150;
		int cont = 1;
		String name;
		
		while(opc == 'S' && cont<=LIMITE) {
			
			JOptionPane.showMessageDialog(null,"Participante"+cont);
			idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:"));
			sexo=JOptionPane.showInputDialog("Digite:\n1-feminino\n2-masculino\n3-Outros\n").charAt(0);
			opcao=JOptionPane.showInputDialog("Digite:\n1-se a pessoa era calma\n2- se a pessoa era nervosa\n3- se a pessoa era agressiva\n").charAt(0);
			
			if(opcao=='1') {
				pessoasCalmas++;
			}
			
			
			
			opc=JOptionPane.showInputDialog("Quer continuar? S/N").toUpperCase().charAt(0);
			//Saida do loop
			cont++;
		}
		JOptionPane.showMessageDialog(null,"Pessoas Calmas: "+pessoasCalmas);
		
		
		
		
		
	}

}

package lista03;

import javax.swing.*;

public class Ex06 {

	public static void main(String[] args) {
		int num = 1, soma = 0, cont = 0;
		
		do {
			num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número ou 0 para sair"));
			if((num%3)==0) {
				soma+=num;
				cont++;
			}
		}while(num!=0);
		cont = cont-1;
		soma = soma/cont;
		JOptionPane.showMessageDialog(null, "O valor da media foi: "+soma);
		
	}

}

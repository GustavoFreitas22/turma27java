package lista03;

import javax.swing.*;

public class Ex05 {

	public static void main(String[] args) {
		int num = 1, soma = 0;
		
		do {
			num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número ou 0 para sair"));
			soma+=num;
		}while(num!=0);
		JOptionPane.showMessageDialog(null, "O valor da soma foi: "+soma);
	}

}

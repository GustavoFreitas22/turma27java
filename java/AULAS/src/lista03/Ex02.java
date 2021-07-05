package lista03;

import javax.swing.*;

public class Ex02 {

	public static void main(String[] args) {
		int num = 0, impar =0, par = 0;
		
		for(int i = 0; i<10;i++) {
			num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
			
			if((num%2)==0) {
				par++;
			}else {
				impar++;
			}
		}
		JOptionPane.showMessageDialog(null,"Resultado:\n Pares: "+par+"\n Impares: "+impar);
	}

}

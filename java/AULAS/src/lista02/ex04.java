package lista02;

import javax.swing.JOptionPane;

public class ex04 {

	public static void main(String[] args) {
	int num;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor"));
		
		
		if(num>0 && (num%2)==0) {
			JOptionPane.showMessageDialog(null,"O valor � PAR e POSITIVO");
		}else if((num%2)==0 && num<0) {
			JOptionPane.showMessageDialog(null,"O valor � PAR e NEGATIVO" );
		}else if(num>0 && (num%2)==1) {
			JOptionPane.showMessageDialog(null,"O � IMPAR e POSITIVO" );
		}else if(num<0 && (num%2)==1) {
			JOptionPane.showMessageDialog(null,"O � IMPAR e NEGATIVO" );
		}
		
		

	}

}

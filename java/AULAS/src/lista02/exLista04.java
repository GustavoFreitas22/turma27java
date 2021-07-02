package lista02;

import javax.swing.JOptionPane;

public class exLista04 {

	public static void main(String[] args) {
		double num;
		
		num = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor"));
		
		
		if((num%2)==0) {
			num = Math.sqrt(num);
			JOptionPane.showMessageDialog(null,"O valor é PAR e a raiz é: "+num);
		}else if((num%2)==1) {
			num = Math.pow(num, 2);
			JOptionPane.showMessageDialog(null,"O é IMPAR e a ao quadrado ele fica: "+num );
		}
	}

}

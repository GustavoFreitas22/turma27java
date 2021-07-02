package introducao;

import javax.swing.*;

public class elseIf {

	public static void main(String[] args) {
		int num;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor"));
		
		
		if(num>=0) {
			if((num%2)==0 && num != 0) {
				JOptionPane.showMessageDialog(null,"O valor é PAR" );
			}else if((num%2)!=0) {
				JOptionPane.showMessageDialog(null,"O valor é IMPAR" );
			}else if(num == 0) {
				JOptionPane.showMessageDialog(null,"O valor é 0 neutro" );
			}
		}else {
			JOptionPane.showMessageDialog(null,"O valor inválido" );
		}

	}

}

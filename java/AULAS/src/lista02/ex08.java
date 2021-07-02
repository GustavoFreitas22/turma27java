package lista02;

import javax.swing.*;

public class ex08 {

	public static void main(String[] args) {
		int num;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero ai"));
		
		if(num >= 1000) {
			JOptionPane.showMessageDialog(null,"Ta é doido, numero grandão "+num);
		}else {
			num = 0;
			JOptionPane.showMessageDialog(null,"Ta é doido, numero "+num);
		}

	}

}

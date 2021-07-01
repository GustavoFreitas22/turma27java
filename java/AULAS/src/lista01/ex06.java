package lista01;

import javax.swing.*;

public class ex06 {

	public static void main(String[] args) {
		double x1, x2,y1,y2,d;
		
		x1= Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de X1"));
		x2= Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de X2"));
		y1= Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de y1"));
		y2= Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de y2"));
		
		d = (Math.pow((x2-x1), 2))+(Math.pow((y2-y1), 2));
		d = Math.sqrt(d);
		
		JOptionPane.showMessageDialog(null,"O valor de D é:"+d);
	}

}

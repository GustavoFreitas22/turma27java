package lista01;

import javax.swing.*;

public class ex05 {

	public static void main(String[] args) {
		double n1, n2, n3, media;
		
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1"));
		n1 = n1*2;
		n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2"));
		n2 = n2*3;
		n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 3"));
		n3 = n3*5;
		
		media = (n1+n2+n3)/10;
		
		JOptionPane.showMessageDialog(null,"A média do aluno foi: "+media);

	}

}

package lista02;

import javax.swing.*;

public class ex05 {

	public static void main(String[] args) {
		double ind;
		
		ind = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor das medições"));
		
		if(ind <= 0.25 && ind >= 0.05) {
			JOptionPane.showMessageDialog(null, "Empresas de nivel 1 devem parar!!!");
		}else if(ind >= 0.26 && ind <= 0.39){
			JOptionPane.showMessageDialog(null, "Empresas de nivel 1 e 2 devem parar!!!");
		}else if(ind >= 0.4) {
			JOptionPane.showMessageDialog(null, "Empresas de TODOS niveis devem parar!!!");
		}

	}

}

package Lista04;

import javax.swing.*;
import java.util.*;


public class Ex02 {

	public static void main(String[] args) {
		Random dado = new Random();
		int valor[] = new int[10];
		int maiorValor=0, cont=0;
		double media = 0;
		
		
		for(int i = 0; i<valor.length; i++) {
			valor[i] = dado.nextInt(6)+1;
			if(valor[i]>maiorValor) {
				maiorValor= valor[i];
			}
			media = media+valor[i];
		}
		for(int i = 0; i<valor.length;i++) {
			if(valor[i]==maiorValor) {
				cont++;
			}
		}
		media= media/valor.length;
		JOptionPane.showMessageDialog(null,"A media foi: "+media+"\n O maior valor foi: "+maiorValor+" e ele apareceu "+cont);
		
	}
}

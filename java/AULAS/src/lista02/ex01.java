package lista02;

import javax.swing.*;

public class ex01 {

	public static void main(String[] args) {
		String codFunc;
		double salario, pagamentoEx, numHoras;
		double LIMITE = 50.0;
		double VALOR_HORA = 10.0;
		double VALOR_EXCEDENTE = 20.0;
		
		codFunc = JOptionPane.showInputDialog("Digite o código de funcionario");
		numHoras = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas:"));
		
		if(numHoras<LIMITE) {
			salario = numHoras*VALOR_HORA;
		}else {
			pagamentoEx = (numHoras - LIMITE)*VALOR_EXCEDENTE;
			salario = (LIMITE*VALOR_HORA)+pagamentoEx;
		}
		
		JOptionPane.showMessageDialog(null, "O valor a receber é: R$ "+ salario);

	}

}

package entidades;

import javax.swing.JOptionPane;

public class ContaPoupanca extends Conta{
	private int diaAniversario;

	public ContaPoupanca(int numero, String nomeCliente, int diaAniversario) {
		super(numero, nomeCliente);
		this.diaAniversario = diaAniversario;
	}

	public int getDiaAniversario() {
		return diaAniversario;
	}

	public void setDiaAniversario(int diaAniversario) {
		this.diaAniversario = diaAniversario;
	}
	
	@Override
	public void telas() {
		int opc;
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Bem vinde a sua conta *Insira aqui o tipo de conta* digite:\n1- opcao01\n2- opcao02\n3- opcao03\n4- para sair\n\nSaldo Atual: R$"+this.saldo));
			switch(opc) {
				case 1:
					JOptionPane.showMessageDialog(null,"Opção 01");
					break;
				case 2:
					JOptionPane.showMessageDialog(null,"Opção 02");
					break;
				case 3:
					JOptionPane.showMessageDialog(null,"Opção 03");
					break;
				case 4:
					JOptionPane.showMessageDialog(null,"Opção 04");
					break;
				default: 
					JOptionPane.showMessageDialog(null,"Opção invalida!\nPor favor, tente novamente!");
					break;
			}
		}while(opc!=4);
	}
	
}

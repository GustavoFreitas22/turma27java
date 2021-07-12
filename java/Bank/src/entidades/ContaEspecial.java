package entidades;

import javax.swing.JOptionPane;

public class ContaEspecial extends Conta {
	
	private double limite;
	
	public ContaEspecial(int numero, String nomeCliente, double limite) {
		super(numero, nomeCliente);
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public void usarLimite(double valor) {
		this.limite = this.limite-valor;
		super.credito(valor);
	}
	
	@Override
	public void telas() {
		int opc;
		double valor;
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Bem vinde a sua conta *Insira aqui o tipo de conta* digite:\n1- opcao01\n2- opcao02\n3- opcao03\n4- para sair"));
			switch(opc) {
				case 1:
					valor = Double.parseDouble(JOptionPane.showInputDialog("Teste"));
					this.debito(valor);
					break;
				case 2:
					JOptionPane.showMessageDialog(null,"Opção 02");
					break;
				case 3:
					JOptionPane.showMessageDialog(null,"Opção 03");
					break;
				default: 
					JOptionPane.showMessageDialog(null,"Opção invalida!\nPor favor, tente novamente!");
					break;
			}
		}while(opc!=4);
	}
	
}

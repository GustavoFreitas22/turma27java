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
		if(valor>this.limite) {
			JOptionPane.showMessageDialog(null,"Falha na opera��o!\nSaldo insulficiente");
		}else if(valor<=0) {
			JOptionPane.showMessageDialog(null,"Valor invalido!");
		}else {
			this.limite = this.limite-valor;
			super.credito(valor);
		}
		
	}
	
	@Override
	public void debito(double valorDebito) {
		int opc;
		if(valorDebito<=0) {
			JOptionPane.showMessageDialog(null,"Valor para debito invalido!");
		}else if(valorDebito>saldo){
			JOptionPane.showMessageDialog(null,"Falha na opera��o!\nSaldo insulficiente");
			opc = Integer.parseInt(JOptionPane.showInputDialog("Deseja utilizar o limite?\nDigite:\n1- Sim\n2- N�o\n\nSaldo atual Limite: R$"+this.limite));
			if(opc==1) {
				double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor desejado:"));
				this.usarLimite(valor);
			}else if(opc==2) {
				JOptionPane.showMessageDialog(null,"Muito obrigado! :)");
			}else {
				JOptionPane.showMessageDialog(null,"Op��o invalida!");
			}
		}else {
			this.saldo = this.saldo-valorDebito;
			JOptionPane.showMessageDialog(null,"Opera��o realizada com sucesso!\nSeu novo saldo � de: R$"+this.saldo);
		}
		
		
	}
	
	@Override
	public void telas() {
		int opc;
		double valor;
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Bem vinde "+this.getNomeCliente()+" a sua Conta Especial - N� "+this.getNumero()+" digite:\n1-Debito\n2- Credito\n3- Utilizar o Limite\n4- para sair\n\nSaldo atual: R$"+this.getSaldo()+"\nSaldo do Limite: R$"+this.limite));
			switch(opc) {
				case 1:
					valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser Debitado:"));
					this.debito(valor);
					break;
				case 2:
					valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser creditado:"));
					this.credito(valor);
					break;
				case 3:
					valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser utilizado do limite:"));
					this.usarLimite(valor);
					break;
				case 4:
					JOptionPane.showMessageDialog(null,"Obrigado por Utilizar O FCBM!\n Volte Sempre!");
					break;
				default: 
					JOptionPane.showMessageDialog(null,"Op��o invalida!\nPor favor, tente novamente!");
					break;
			}
		}while(opc!=4);
	}
	
}

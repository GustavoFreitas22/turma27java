package entidades;

import javax.swing.*;

public abstract class Conta {
	private int numero;
	private String nomeCliente;
	private double saldo;
	public Conta(int numero, String nomeCliente) {
		super();
		this.numero = numero;
		this.nomeCliente = nomeCliente;
	}
	public int getNumero() {
		return numero;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public double getSaldo() {
		return saldo;
	}
	public void credito(double valorCredito) {
		this.saldo = this.saldo + valorCredito;
	}
	public void debito(double valorDebito) {
		if(valorDebito<=0) {
			System.out.println("Eai queride? Eu sou uma piada?");
		}else if(valorDebito>saldo){
			System.out.println("Ta de brincadeira n� xuxu? Tem isso tudo de dinheiro aqui n�o kk");
		}else {
			this.saldo = this.saldo-valorDebito;
			System.out.println("S� se vive uma vez!");
		}
		
		
	}
	public void telas() {
		int opc;
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Bem vinde a sua conta *Insira aqui o tipo de conta* digite:\n1- opcao01\n2- opcao02\n3- opcao03\n4- para sair"));
			switch(opc) {
				case 1:
					JOptionPane.showMessageDialog(null,"Op��o 01");
					break;
				case 2:
					JOptionPane.showMessageDialog(null,"Op��o 02");
					break;
				case 3:
					JOptionPane.showMessageDialog(null,"Op��o 03");
					break;
				default: 
					JOptionPane.showMessageDialog(null,"Op��o invalida!\nPor favor, tente novamente!");
					break;
			}
		}while(opc!=4);
	}
	
}

package lista05POO;

public class Conta {
	private int numero;
	private String nome;
	private double saldo;
	private double limite = 1000;
	private String agencia;
	public Conta(String nome, String agencia) {
		super();
		this.nome = nome;
		this.agencia = agencia;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSaldo() {
		return saldo;
	}
//	public void setSaldo(double saldo) {
//		this.saldo = saldo;
//	}
	public double getLimite() {
		return limite;
	}
//	public void setLimite(double limite) {
//		this.limite = limite;
//	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	
	
	public void credito(double valorCredito) {
		this.saldo = this.saldo+valorCredito;
	}
	public void debito(double valorDebito) {
		if(valorDebito>this.saldo) {
			System.out.println("Operacao invalida");
		}else {
			this.saldo-=valorDebito;
		}
	}
	public void usarLimite(double valor) {
		this.limite = this.limite-valor;
		this.credito(valor);
	}
	
}

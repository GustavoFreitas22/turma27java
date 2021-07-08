package entidades;

public class Conta {
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
	
}

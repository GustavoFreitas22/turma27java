package introPOO;

public class Conta {
	private int numero;
	private double saldo;
	private double limite;
	
	public Conta(int numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
		
	}
	public Conta(int numero, double saldo, double limite) {
		super();
		this.numero = numero;
		this.saldo = saldo;
		this.limite = limite;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	
	public void saca(double valorSaque) {
		if((saldo-valorSaque)<0) {
			System.out.println("É consagrade... Num vai rolar!");
		}else if(valorSaque<=0){
			System.out.println("Eu sou uma piada para você usuário?");
		}else {
			saldo = saldo - valorSaque;
		}
		
	}
	public void deposita() {
		
	}
	public void imprimirExtrato() {
		System.out.println("Conta numero: "+numero+" tem o saldo de: "+saldo);
	}
}

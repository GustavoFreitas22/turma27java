package lista05POO;

public class ContaMain {

	public static void main(String[] args) {
		Conta c1 = new Conta("Gustavo", "01-06");
		
		System.out.println("A conta foi aberta no nome de: "+c1.getNome()+" na agencia: "+c1.getAgencia());
		c1.credito(100);
		System.out.println("Saldo atual: R$"+c1.getSaldo());
		c1.debito(250);
		System.out.println("Saldo atual: R$"+c1.getSaldo());
		c1.usarLimite(500);
		System.out.println("Saldo atual: R$"+c1.getSaldo());
		c1.debito(250);
		System.out.println("Saldo atual: R$"+c1.getSaldo());

	}

}

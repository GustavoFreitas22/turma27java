package introPOO;

import java.util.Scanner;

public class ContaMain {

	public static void main(String[] args) {
		int numConta= 0;
		double saldoPad = 0.0;
		Conta conta1 = new Conta(numConta, saldoPad);
		Scanner read = new Scanner(System.in);
		
		
		System.out.println("Saldo da conta: "+conta1.getSaldo());
		conta1.saca(0);
		System.out.println("Saldo da conta: "+conta1.getSaldo());
	}

}

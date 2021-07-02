package lista02;

import java.util.*;

public class ex03 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int n1, n2, n3, n4;
		
		System.out.println("Digite o valor de N1:");
		n1 = read.nextInt();
		System.out.println("Digite o valor de N2:");
		n2 = read.nextInt();
		System.out.println("Digite o valor de N3:");
		n3 = read.nextInt();
		System.out.println("Digite o valor de N4:");
		n4 = read.nextInt();
		
		if(n3>=1000) {
			System.out.printf("Numero grandão hein: %d", n3);
		}else {
			System.out.printf("Saca só os numero tudo: N1: %d - N2: %d - N3: %d - N4: %d", n1, n2, n3, n4);
		}

	}

}

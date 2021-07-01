package lista01;

import java.util.*;

public class ex04 {

	public static void main(String[] args) {
		double r, s;
		int a ,b ,c;
		double d;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor de A:");
		a = leia.nextInt();
		System.out.println("Digite o valor de B:");
		b = leia.nextInt();
		System.out.println("Digite o valor de C:");
		c = leia.nextInt();
		
		r = Math.pow((a+b), 2);
		s = Math.pow((b+c), 2);
		
		d = (r+s)/2;
		
		System.out.printf("O valor de D: %.2f", d);

	}

}

package lista02;

import java.util.*;

public class exLista01 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.println("Digite o numero:");
		num1 = read.nextInt();
		System.out.println("Digite o numero:");
		num2 = read.nextInt();
		System.out.println("Digite o numero:");
		num3 = read.nextInt();
		
		
		if(num1 > num2 && num1 > num3 ) {
			System.out.printf("Esse é o maior %d", num1);
		}else if(num2 > num1 && num2>num3) {
			System.out.printf("Esse é o maior %d", num2);
		}else if(num3 > num2 && num3>num1){
			System.out.printf("Esse é o maior %d",num3);
		}

	}

}

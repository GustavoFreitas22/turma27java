package lista03;

import java.util.*;

public class Ex01 {
	public static void main(String[] args) {
		int cont = 0;
		
		for(int i = 1000; i<=1999; i++) {
			if((i%11)==5) {
				cont++;
				System.out.println(i);
			}
		}
		System.out.printf("A quantidade de numeros foi: %d", cont);
	}
}

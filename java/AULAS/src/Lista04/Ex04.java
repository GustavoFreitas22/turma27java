package Lista04;

import java.util.*;

public class Ex04 {

	public static void main(String[] args) {
		int num[][] = new int[3][3];
		
		Scanner read = new Scanner(System.in);
		
		for(int i = 0; i<num.length; i++) {
			for(int y = 0; y<num.length;y++){
				System.out.println("Digita aí meu rei!:");
				num[i][y] = read.nextInt();
				
				if(i==y) {
					num[i][y] = 0;
				}
			}
		}
		for(int i = 0; i<num.length; i++) {
			for(int y = 0; y<num.length;y++){
				System.out.print("["+num[i][y]+"]");
				}
				System.out.println(" ");
			}
		}



}


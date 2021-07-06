package Lista04;

import java.util.*;

public class Ex03 {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner read = new Scanner(System.in);
		int m1[][] = new int[4][6];
		int m2[][] = new int[4][6];
		int n1[][] = new int[4][6];
		int n2[][] = new int[4][6];
		
		
		for(int x = 0; x<n1.length; x++) {
			for(int y = 0; y<n1.length; y++) {
				n1[x][y] = random.nextInt(4);
				n2[x][y] = random.nextInt(6);
				m1[x][y] = n1[x][y]+n2[x][y];
				m2[x][y] = n1[x][y]-n2[x][y];
			}
		}

	}

}

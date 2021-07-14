package TryCatch;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class testeArquivo {

	public static void main(String[] args) {
		File arq = new File("C:\\temp1\\turma27.txt");
		Scanner read = null;
		
		try {
			read = new Scanner(arq);
			while(read.hasNextLine()) {
				System.out.println(read.next());
			}
		}
		catch(IOException erro) {
			System.out.println("Erro");
		}
		finally {
			if(read!=null) {
				read.close();
			}
			System.out.println("Nois");
		}
	}

}

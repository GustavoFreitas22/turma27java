package lista05POO;

import java.util.Scanner;

public class PacienteMain {

	public static void main(String[] args) {
		Paciente p1 = new Paciente();
		Paciente p2 = new Paciente();
		Scanner read = new Scanner(System.in);
		
		p1.nome="Epaminondas";
		p1.idade = 560;
		p1.verificaIdade();
		p1.morto();
		System.out.println(p1.tipo);

		p2.nome = "Jão";
		p2.idade = 25;
		p2.verificaIdade();
		System.out.println(p2.tipo);
		p2.tirarRemedio();
	}

}

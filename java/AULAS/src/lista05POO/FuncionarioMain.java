package lista05POO;

public class FuncionarioMain {

	public static void main(String[] args) {
		Funcionario func1 = new Funcionario();
		
		func1.nome = "Cleber";
		func1.idade = 24;
		func1.cargo = "Analista";
		func1.horasTrabalhadas = 899;
		func1.trabalhar();
		func1.calcSalario();
		func1.promocao();
		System.out.println("\n"+func1.cargo);
		
		
	}

}

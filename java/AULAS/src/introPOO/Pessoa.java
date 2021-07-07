package introPOO;

public class Pessoa {
	int nascimento;
	String nome;
	char sex;
	
	public int getNascimento() {
		return nascimento;
	}
	public void setNascimento(int nascimento) {
		this.nascimento = nascimento;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}

	public void calcIdade() {
		System.out.println(2021-nascimento);
	}
	public int retornaIdade(int anoAtual) {
		int idade;
		idade = anoAtual-nascimento;
		return idade;
	}
	
}

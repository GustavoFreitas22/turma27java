package CadEd;

public class Time {	
	private String nome;
	private int pontos;
	public Time(String nome) {
		super();
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getPontos() {
		return pontos;
	}
//	public void setPontos(int pontos) {
//		this.pontos = pontos;
//	}
	public void pontos(char result) {
		if(result == 'G') {
			this.pontos += 3;
		}else if(result == 'E') {
			this.pontos += 1;
		}else {
			this.pontos += 0;
		}
	}

}

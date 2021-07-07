package lista05POO;

public class Paciente {
	int idade;
	public String nome;
	public String convenio;
	public String sintoma;
	public boolean vida;
	public boolean remedios;
	public String tipo;
	
	
	
	public void vivo() {
		vida = true;
	}
	public void morto() {
		vida = false;
		System.out.println("Medico: Vish, Perdemo...");
	}
	public void verificaIdade() {
		if(idade >= 0 && idade<= 15) {
			tipo = "Pediatria";
		}else if(idade > 15 && idade<60) {
			tipo = "Medico normal";
		}else if(idade> 60 && idade <=150){
			tipo = "Geriatria";
		}else {
			System.out.println("Oxi, ou num nasceu ou é um vampiro imortal, ta doido é?");
			tipo= "Sei o que tu é não,,,";
		}
	}
	public void receitaRemedio() {
		remedios = true;
	}
	public void tirarRemedio() {
		System.out.println("Ae meu rei/ rainha... Podemos parar de tomar");
		remedios = false;
	}
	
	
}

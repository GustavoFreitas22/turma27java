package CadEd;

public class Terceiro extends Funcionario{
	private double adicional;

	public Terceiro(String matricula, int horasTrabalhadas, double valorHora, double adicional) {
		super(matricula, horasTrabalhadas, valorHora);
		this.adicional = adicional;
	}


	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	
//	public double salario() {
//		return (this.getHorasTrabalhadas()*this.getValorHora())+this.adicional;
//	}
	
	@Override
	public double salario() {	
		return (this.horasTrabalhadas*this.valorHora)+this.adicional;
	}

	
}

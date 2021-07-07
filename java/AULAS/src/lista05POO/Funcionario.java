package lista05POO;

import javax.swing.*;

public class Funcionario {
	public String nome;
	public int idade;
	public String cargo;
	public int horasTrabalhadas = 0;
	public double salario;
	public int bancoHoras;
	public final int LIMITE = 50;
	
	public void fazAniversario() {
		idade++;
	}
	public void trabalhar() {
		char opc;
		do {
			System.out.println("Eita, ta trabalhando bem hein?");
			horasTrabalhadas++;
			opc = JOptionPane.showInputDialog("Vai continuar no ritmo da produtividade consagrade? [S/N]").charAt(0);
			if(horasTrabalhadas>LIMITE) {
				System.out.println("Tu sabe que isso aqui vai pro banco de horas né?");
			}
			
		}while(opc!='n');
	}
	public void calcSalario() {
		System.out.println("Bora lá proletariade... Ta na hora de ver quanto teu tempo está valendo!");
		if(horasTrabalhadas>LIMITE) {
			salario = LIMITE*12;
			bancoHoras = horasTrabalhadas-LIMITE;
			
			System.out.println("Teu salario é de: R$"+salario+" e tu tem: "+bancoHoras+"h de banco de horas");
		}else {
			salario = horasTrabalhadas*9;
			System.out.println("Teu salario é de: R$"+salario+" e tu tem: "+bancoHoras+"h de banco de horas");
		}
	}
	public void promocao() {
		System.out.println("Opa padawan, tu ta querendo aumento? Deixa eu analisar aqui...");
		if(horasTrabalhadas<900) {
			System.out.println("No Pain No gain... Sabe como é consagrado, ainda faltam umas: "+(900-horasTrabalhadas)+" horas de trabalho ai...");
		}else {
			System.out.println("Ta é doido kkk Num vai abrir um processo trabalista contra eu não né? Ta promovide!!!");
			System.out.println("Foguete num tem ré! Só vai!!!");
			System.out.println("                                            ,:\r\n"
					+ "                                          ,' |\r\n"
					+ "                                         /   :\r\n"
					+ "                                      --'   /\r\n"
					+ "                                      \\/ /:/\r\n"
					+ "                                      / ://_\\\r\n"
					+ "                                   __/   /\r\n"
					+ "                                   )'-. /\r\n"
					+ "                                   ./  :\\\r\n"
					+ "                                    /.' '\r\n"
					+ "                                  '/'\r\n"
					+ "                                  +\r\n"
					+ "                                 '\r\n"
					+ "                               `.\r\n"
					+ "                           .-\"-\r\n"
					+ "                          (    |\r\n"
					+ "                       . .-'  '.\r\n"
					+ "                      ( (.   )8:\r\n"
					+ "                  .'    / (_  )\r\n"
					+ "                   _. :(.   )8P  `\r\n"
					+ "               .  (  `-' (  `.   .\r\n"
					+ "                .  :  (   .a8a)\r\n"
					+ "               /_`( \"a `a. )\"'\r\n"
					+ "           (  (/  .  ' )=='\r\n"
					+ "          (   (    )  .8\"   +\r\n"
					+ "            (`'8a.( _(   (\r\n"
					+ "         ..-. `8P    ) `  )  +\r\n"
					+ "       -'   (      -ab:  )\r\n"
					+ "     '    _  `    (8P\"Ya\r\n"
					+ "   _(    (    )b  -`.  ) +\r\n"
					+ "  ( 8)  ( _.aP\" _a   \\( \\   *\r\n"
					+ "+  )/    (8P   (88    )  )\r\n"
					+ "   (a:f   \"     `\"`");
			
			cargo = "Chefe(a) Lv. 50";
		}
	}
}

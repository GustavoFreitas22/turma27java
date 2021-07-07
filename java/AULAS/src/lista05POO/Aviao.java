package lista05POO;

public class Aviao {
	public int rodas;
	public String modelo;
	public String tipo;
	public boolean noAr;
	public int velocidade;
	public boolean ligado;
	
	
	public void decola() {
		for(int i = 0; i<8; i++) {
			aumentaVelo();
			System.out.println("Velocidade atual: "+velocidade);
			if(velocidade>=125) {
				noAr=true;
				System.out.println("Bora voar!\n");
				System.out.println("/------------------------\\              |~~\\_____/~~\\__  |\r\n"
						+ "|   Foguete não tem ré   |______________ \\______====== )-+\r\n"
						+ "|                        |                      ~~~|/~~  |\r\n"
						+ "\\------------------------/                         ()\r\n"
						+ "");
			}else {
				System.out.println("VELOCIDADE MUITO BAIXA!!!");
				System.out.println("            __/\\__\r\n"
				+ "           `==/\\==`\r\n"
				+ " ____________/__\\____________\r\n"
				+ "/____________________________\\\r\n"
				+ "  __||__||__/.--.\\__||__||__\r\n"
				+ " /__|___|___( >< )___|___|__\\\r\n"
				+ "           _/`--`\\_\r\n"
				+ "          (/------\\)");
				
			}
		}
		
		
	}
	public void pousa() {
		System.out.println("Bora descer!\n");
		System.out.println(" \\    |\\\r\n"
				+ "    \\   | \\\r\n"
				+ "    ____| |__\r\n"
				+ "    \\___ \\|__\\\r\n"
				+ "        \\  \\\r\n"
				+ "         |  \\\r\n"
				+ "         \\ * \\_\r\n"
				+ "\\         \\  \\ \\     \\\r\n"
				+ " \\        /\\  \\|\\ _   \\\r\n"
				+ " ________/  X  ~~//_____\r\n"
				+ " \\_________/ \\  //|_____\\\r\n"
				+ "         *    \\/o/  *\r\n"
				+ "          *   //     *\r\n"
				+ "              ~\r\n"
				+ "            *           *\r\n"
				+ "");
		System.out.println();
		for(int i = 0; i<5; i++) {
			noAr = false;
		}
		System.out.println("Mo paz!");
	}
	public void ligar() {
		ligado = true;
	}
	public void desliga() {
		ligado = false;
	}
	public void aumentaVelo() {
		velocidade = velocidade+10;
	}
	public int aumentaVelo(int acrescimo) {
		velocidade = velocidade+acrescimo;
		return velocidade;
	}
	public void diminuiVelo() {
		velocidade = velocidade-50;
	}
}

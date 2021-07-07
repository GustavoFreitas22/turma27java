package lista05POO;

public class ex01Cliente {
	public int idade;
	public String nome;
	public boolean devedor;
	public String interesse;
	public double dinheiro = 0;
	
	public ex01Cliente(int age, String name, boolean deve, String inter, double dindin) {
		idade = age;
		devedor = deve;
		interesse = inter;
		nome = name;
		dinheiro = dindin;
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean isDevedor() {
		return devedor;
	}
	public void setDevedor(boolean devedor) {
		this.devedor = devedor;
	}
	public String getInteresse() {
		return interesse;
	}
	public void setInteresse(String interesse) {
		this.interesse = interesse;
	}
	
	public void comprar(double produto) {
		dinheiro = dinheiro-produto;
		if(dinheiro<0) {
			devedor = true;
			System.out.println("To devendo horrores!");
		}else {
			System.out.println("Bora gastar");
		}
	}
	public void guardaInteresse() {
		System.out.println("Me conta um dos seus intereses");
	}
	public void fazAniversario() {
		idade++;
	}
	public void ablubla() {
		System.err.println("                                        $\r\n"
				+ "\r\n"
				+ "                                       $$     o\r\n"
				+ "                                      $$$   o$   ooooooo\r\n"
				+ "                                    $ $$$  o$ o$$$$$$$ooo\r\n"
				+ "                                    $$$$$$o$$$$$$$$$$$$$$$$\r\n"
				+ "                                oooo$$$$$$$$$$\"$$o$$o$$$\"$$$\r\n"
				+ "                              o$$$$$$$$o$$$o$$$$$$$$$$$$$$o      $\r\n"
				+ "                              \"$$$$$$$\"$$$$$$$$$$$$\"$$$$$$$    o$\"\r\n"
				+ "                          oooo $$$$$$$$$$$$\"\"$$$$$$$$$$o$$$  o$$$$\r\n"
				+ "                       $$$$$$$$$$$$$$\"$$$o$$   \"$$$$$\"$$$$$$$\"$$$\r\n"
				+ "                     o$$$$$\"$$$\"$oo   \"\"$\"\"      $$$$$$$$$$$$$$$\r\n"
				+ "                   o$$$$$\"$$$\"\"           \"o oo   $$\"$\"\"\"\"$$$\"$$$o\r\n"
				+ "                o$$$$$\"$$$$\"       \"\"$oo      oo$$$$$o    $$$$$$$$\r\n"
				+ "             oo$$$$$\"$$$$$$$\"      o$$\"      o$$\"\"  $$$o$$\"\"\"$$$$$$o\r\n"
				+ "          oo$$$$$\"$$$$$$\"$$\"       $$$$      \"$$$$$$$$$$       \"\"$$$\"o\r\n"
				+ "      o$$$$$$$$\"$$$$$$\"$$$\"       $$$\"$       \"\"\"$$$$$\"         $o$$$o\r\n"
				+ "     $$$$$$\"$o$$$\"$$$$$$$$       $$$$o \"$                        $$$$$$\r\n"
				+ "      $$$o$$$$o   $$$o$$$        $$$$$o$$  o$   o  \" $o o$        $$$$$\r\n"
				+ "      $ \"$$$$$$o  $$$$$$$        $$$$$$$\" o$$$ o$  o$      o\" \"  o$$$$$$\r\n"
				+ "         \"$$\"$$$  $$$$o$$        $$$$$ $o$$$$$$$$$$$$o   \"        $$$$\"$$\r\n"
				+ "           $$$$$$  $\"$$$$$    \"o$$$$$  \"oo\"\"\"$$$$$$$$$$$o o   \"  $$$$$$$$$o\r\n"
				+ "            \"$$o$o $$$$$$$oo$$$$$$$$$$o \"  \"$\" \"$\"\"\"$$$$$$ooo$   $$$$$$$$$$$\r\n"
				+ "             $$$$$o$$$$o$$$$$$$$$$$$$$$ \"\"\"\"\" oo$   $$$$$$$$$$o $  \"\"$$$$o$$$o\r\n"
				+ "              \"$$\"$$$o$$$$$$$$o$$$  \"\"            \"\"$$$$$$$$$$$o$     \"$$$$$$$\r\n"
				+ "                \"$$$$$$$$$$$$$$$$$$$o     o $ooooooo   \"$$$$\"$$$$$   o$$$\"$$$\"\r\n"
				+ "                  \"$$$$$$$$\"\"\"\"$$$$$$oo$\"\"\"\"  $$$$$$$$o$$$$$$$$$$  o$$$$$$$$\"\r\n"
				+ "                     $$$\"$$o    \"\"$$$\"        \"$$$$$$$$$$$$$$$$$ o$$$$$$$\"\"\r\n"
				+ "                      $$$$$$                     \"   $$$$$$$$$$$$$$$\"\"\r\n"
				+ "         oo           \"$$\"$$                          \"$$$$o$$$$\"\"\r\n"
				+ "          \"$$o         $$$$$                           $ $$$$$\r\n"
				+ "            $$$        $$$$$                         $$$$\r\n"
				+ "             $$$        $o$$                        $$$$\r\n"
				+ "              $$$o      $$$$                        $$\r\n"
				+ "             oo$$$o     $$$$                      $$$\r\n"
				+ "             $$$$o$$$$$$$$$$                    $$$\r\n"
				+ "             \"$$$$$\"$$$$$o$$                   $$\r\n"
				+ "               \"$o$$$$$\"$$$$                 o$$o\r\n"
				+ "                 \"$$$$$$$$$$o            ooo$$$$$$oo\r\n"
				+ "                 o$$$\"$$$o$$$$oo    ooo$$$$$$$$$$$$$$oo\r\n"
				+ "               o$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$o\r\n"
				+ "              $$$$\"$$$\"$o$$$$\"\"\"           \"\"$$$$$o$$$$$$o\r\n"
				+ "             o$$$$$$$$$$$\"\"                 o$$$\"$$$$$$$$\"\r\n"
				+ "             \" $\"$$\"$$$$oo                o$$$$$$\"\"\"  \"\r\n"
				+ "                   \"\"$$$$$$oo            $$$$$$oo\r\n"
				+ "    oooo$$$$$oooo$$$$$$$o$$$$$           \"\"\"$$$$$$$$$$$$$$$$$$$$$$$oo\r\n"
				+ "  o$$$$$$$$$$$$$$$$\"\"\"\"                               \"\"\"\"\"$$$$$$$$$$$\r\n"
				+ " $$$$$$$$o$$$\"\"\"                                             \"\"o$$$$$$o\r\n"
				+ "o$$$$$$o$\"\"                                                      \"\"\"\"\"\r\n"
				+ "  \"\"\"\"\"");
		
		System.err.println("                  ¶¶¶¶¶¶¶¶¶¶¶¶\r\n"
				+ "                ¶¶            ¶¶\r\n"
				+ "  ¶¶¶¶¶        ¶¶                ¶¶\r\n"
				+ "  ¶     ¶     ¶¶                   ¶¶\r\n"
				+ "   ¶     ¶    ¶¶       ¶¶    ¶¶      ¶¶\r\n"
				+ "    ¶    ¶   ¶¶        ¶¶    ¶¶      ¶¶\r\n"
				+ "     ¶   ¶   ¶                         ¶¶\r\n"
				+ "   ¶¶¶¶¶¶¶¶¶¶¶¶                         ¶¶\r\n"
				+ "  ¶            ¶    ¶¶            ¶¶    ¶¶\r\n"
				+ " ¶¶            ¶    ¶¶            ¶¶    ¶¶\r\n"
				+ "¶¶   ¶¶¶¶¶¶¶¶¶¶¶      ¶¶        ¶¶     ¶¶\r\n"
				+ "¶               ¶       ¶¶¶¶¶¶¶       ¶¶\r\n"
				+ "¶¶              ¶                    ¶¶\r\n"
				+ " ¶   ¶¶¶¶¶¶¶¶¶¶¶¶                   ¶¶\r\n"
				+ " ¶¶           ¶  ¶¶                ¶¶\r\n"
				+ " ¶¶¶¶¶¶¶¶¶¶¶¶    ¶¶            ¶¶\r\n"
				+ "                 ¶¶¶¶¶¶¶¶¶¶¶"+"\n\n\n            PERDEMO!!!");
	}
}

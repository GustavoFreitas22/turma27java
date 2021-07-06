package Lista04;

import java.util.Scanner;

public class LojaEd {

	public static void main(String[] args) {
		
		String produtos[] = {"Banana","Maça","Abacaxi","Maracuja","Melão","Melancia","Laranja","Morango","Pera","Acerola"};

		double precos[] = {30,70,20,50,70,50,30,50,10,80};
		String codigo [] = new String[10];
		int estoque[] = {10,10,10,10,10,10,10,10,10,10};
		int carrinho[] = new int[10];
		int opc = 0;
		Scanner read = new Scanner(System.in);
		String auxCod;
		int qtdCompra;
		int totalCompra;
		double total;
		
		
		
		for (int x=0; x<10; x++) {
			codigo[x]="G2-0"+(x+1);
		}
		
		do {
			System.out.println("Digite:\n 1- Para Listar itens\n 2- Para Comprar\n 3- Para ver o carrinho\n 4- Finalizar Compra\n 5- SAIR");
			opc = read.nextInt();
			if(opc==1) {
				for(int x = 0; x < produtos.length; x++) {
					System.out.println("Produto:"+(x+1));
					System.out.println("G2 - "+codigo[x]+"-"+produtos[x]+"-R$:"+precos[x]+"-estoque:"+estoque[x]);
				}	
			}else if(opc == 2) {
				System.out.println("Qual o código do produto desejado:");
				auxCod = read.next().toUpperCase();
				for(int i = 0; i<produtos.length;i++) {
					if(auxCod.equals(codigo[i])){
						System.out.println("-------PRODUTO SELECIONADO-------\n");
						System.out.println("Produto:"+produtos[i]+" Preco: R$"+precos[i]);
						System.out.println("Qual a quantidade a ser comprada:");
						qtdCompra = read.nextInt();
						if(qtdCompra>estoque[i]) {
							System.out.println("*>OPERACAO INVALIDA<*");
						}else {
							carrinho[i] = qtdCompra;
							estoque[i] = estoque[i]-qtdCompra;
							total = carrinho[i]*precos[i];
						}
					}
				}
			}else if(opc == 3) {
				for(int i = 0; i<10; i++) {
					if(carrinho[i]!=0) {
						System.out.println(codigo[i]+"\t"+produtos[i]+"\t"+precos[i]+"\t"+carrinho[i]+"\t"+(carrinho[i]*precos[i]));
					}
				}
			}else if(opc == 4) {
				System.out.println("Ainda estamos implementando :)");
			}
			
		}while(opc != 5);
		System.out.println("Obrigado por escolher a HORTIFRUTE-G2!!!");
	}

}


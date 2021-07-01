programa
{
	
	funcao inicio()
	{
		real saldo = 0.0, limite = 1000.0
		inteiro numCont = 0
		inteiro opc = 3

		contEspecial(saldo, limite)
	}

	funcao contEspecial(real saldo, real limite){
		caracter opc = 's'
		caracter mov
		real valor
		real aux
		inteiro cont = 0
		
		escreva("NOME DO BANCO\n")
		escreva("SLOGAN\n")
		faca{
		escreva("Conta do tipo: Especial")
		escreva("\nSaldo na conta: R$",saldo)
		escreva("\nLimite: R$", limite)
		escreva("\nDigite:\n D - Para debitar \n C - Para creditar: ")
		leia(mov)  
		// Começo das transações:
			se(mov == 'd' ou mov == 'D'){
				escreva("\nQual o valor do debito?")
				leia(valor)
				se(saldo >= valor){
					saldo = saldo - valor
				}senao se(valor > saldo e limite >= valor){
					aux = saldo - valor
					limite = limite + aux	
				}senao se (valor > saldo e valor > limite){
					escreva("Valor excedido!")
				}
				
			}
			se (mov == 'c' ou mov == 'C'){
				escreva("\nQual o valor a ser creditado?")
				leia(valor)
				saldo = saldo + valor
			}
		// Finalização da movimentação
		escreva("\nNovo saldo: R$", saldo)
		escreva("\nNovo valor de limite: R$", limite)
		// Contador de movimentos ++
		cont++
		
		escreva("\nDeseja continuar?\n Digite S/N")
		leia(opc)
		
		}enquanto(opc != 'n' ou cont >= 10)

		se(cont>=10){
			escreva("\nLimite de movimentação atingido")
			escreva("Obrigado por utilizar *NOME DO BANCO*")
		}senao{
			escreva("\nObrigado por utilizar *NOME DO BANCO*")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1398; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
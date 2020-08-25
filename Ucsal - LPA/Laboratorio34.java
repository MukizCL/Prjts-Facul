package br.ucsal;

/* PROBLEMA: a partir de no nome completo qualquer, atribuído a uma variável com tipo String, 
 * construa os métodos específicos para solucionar cada questão abaixo:
 * 
a) Nome do Método: obterDados. Contém a variável nome com o nome completo qualquer
b) Nome do Método: imprimir. Recebe a String no parâmetro e imprime
c) Nome do Método: sobrenomeNome. Recebe o nome e executa o método de impressão com o sobrenome, uma vírgula e o resto do nome
d) Nome do Método: primeirasLetras. Recebe o nome e executa o método de impressão com as primeiras letras de cada nome
e) Nome do Método: arrumaTexto. Recebe o nome e executa o método de impressão com as primeiras letras de cada nome em letras maiúsculas 
 				   e as demais em minúsculas, independente de como foi informado. */

public class Laboratorio34 {

	public static void main(String[] args) {

		obterDados();
		
	}
	
	public static void obterDados () {
		String nome = "samuel Kihoma Castro Lírio";		
		sobrenomeNome(nome);
		primeirasLetras(nome);
		arrumaTexto(nome);
		
	}
	
	public static void imprimir (String txt) {
		System.out.print(txt);

		}
	
	public static void sobrenomeNome (String nome) {
		int sobrenomePosicao = 0;
		for (int var = 0; var < nome.length(); var++) {
			if (nome.substring(var, var + 1).equals(" ")) {
				sobrenomePosicao = var+1;
			}
		}
		imprimir(nome.substring(sobrenomePosicao, nome.length()) + ", " + nome.substring(0, sobrenomePosicao));
	}
	
	public static void primeirasLetras (String nome) {
		int primeiraPosicao = 0, primeiraLetra = 0;
		
		imprimir("\n");
		imprimir(nome.substring(primeiraLetra, primeiraLetra +1));
		for (int var = 0; var < nome.length(); var++) {
			if (nome.substring(var, var + 1).equals(" ")) {
				primeiraPosicao = var + 1;
				imprimir(" " + nome.substring(primeiraPosicao, primeiraPosicao +1));
			}
		}
	}
	
	
	
	//e) Nome do Método: arrumaTexto. Recebe o nome e executa o método de impressão com as primeiras letras de cada nome em letras maiúsculas 
	//   e as demais em minúsculas, independente de como foi informado. */
	
	// samuel kihoma castro lírio
	
	public static void arrumaTexto (String nome) {
		int primeiraPosicao = 0, primeiraLetra = 0;

		imprimir("\n");
		for (int var = 0; var < nome.length(); var++) {

			if (nome.substring(var, var + 1).equals(" ")) {
				imprimir(nome.substring(primeiraLetra, primeiraLetra +1).toUpperCase());
				primeiraPosicao = var + 1;
				imprimir(nome.substring(primeiraLetra +1, primeiraPosicao).toLowerCase());
				primeiraLetra = var + 1;
			}

		}
		imprimir(nome.substring(primeiraLetra, primeiraLetra +1).toUpperCase() + nome.substring(primeiraLetra+1, nome.length()));
	}
	
}
		
		/* Não consigo imprimir o 'Lírio' porque não tem " " (espaço) no fínal para o if pegar;
		 * Preciso imprimir do final até o caractér antes do último espaço + 1;
		 * Preciso imprimir o último caracter  */

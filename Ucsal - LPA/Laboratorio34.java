package br.ucsal;

/* PROBLEMA: a partir de no nome completo qualquer, atribu�do a uma vari�vel com tipo String, 
 * construa os m�todos espec�ficos para solucionar cada quest�o abaixo:
 * 
a) Nome do M�todo: obterDados. Cont�m a vari�vel nome com o nome completo qualquer
b) Nome do M�todo: imprimir. Recebe a String no par�metro e imprime
c) Nome do M�todo: sobrenomeNome. Recebe o nome e executa o m�todo de impress�o com o sobrenome, uma v�rgula e o resto do nome
d) Nome do M�todo: primeirasLetras. Recebe o nome e executa o m�todo de impress�o com as primeiras letras de cada nome
e) Nome do M�todo: arrumaTexto. Recebe o nome e executa o m�todo de impress�o com as primeiras letras de cada nome em letras mai�sculas 
 				   e as demais em min�sculas, independente de como foi informado. */

public class Laboratorio34 {

	public static void main(String[] args) {

		obterDados();
		
	}
	
	public static void obterDados () {
		String nome = "samuel Kihoma Castro L�rio";		
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
	
	
	
	//e) Nome do M�todo: arrumaTexto. Recebe o nome e executa o m�todo de impress�o com as primeiras letras de cada nome em letras mai�sculas 
	//   e as demais em min�sculas, independente de como foi informado. */
	
	// samuel kihoma castro l�rio
	
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
		
		/* N�o consigo imprimir o 'L�rio' porque n�o tem " " (espa�o) no f�nal para o if pegar;
		 * Preciso imprimir do final at� o caract�r antes do �ltimo espa�o + 1;
		 * Preciso imprimir o �ltimo caracter  */

package br.ucsal;

/*PROBLEMA: a partir de no nome completo qualquer, atribu�do a uma vari�vel com tipo String, 
 * construa os m�todos espec�ficos para solucionar cada quest�o abaixo:
 * 
a) Nome do M�todo: obterDados. Cont�m a vari�vel nome com o nome completo qualquer
b) Nome do M�todo: imprimir. Recebe o nome como par�metro e imprime o nome
c) Nome do M�todo: palavraPorLinha. Recebe o nome e executa o m�todo de impress�o com uma palavra em cada linha
d) Nome do M�todo: vertical. Recebe o nome e executa o m�todo de impress�o com o nome na vertical
e) Nome do M�todo: diagonal. Recebe o nome e executa o m�todo de impress�o com o nome na diagonal decrescente
f) Nome do M�todo: inverso. Recebe o nome e executa o m�todo de impress�o com o nome de tr�s para frente */

public class Laboratorio33 {

	public static void main(String[] args) {
		
		obterDados();

	}
	
	public static void obterDados() {
		String nome = "Samuel Kihoma Castro L�rio";
		palavraPorLinha(nome);
		vertical(nome);
		diagonal(nome);
		inverso(nome);
		sobrenomeNome(nome);
		
	}
	
	public static void imprimir (String txt) {
		System.out.print(txt);
	}
	
	public static void palavraPorLinha(String nome) {
		imprimir(" ");
		for (int var = 0; var < nome.length(); var++) { // O 'for' vai ir continuando at� o 'var' for igual ao comprimento do nome.
			if(nome.substring(var, var + 1).equals(" ")) { // Se a letra entre 'var' e 'var+1' for igual a ' '(espa�o em branco), ele vai criar uma linha.
				imprimir("\n"); // Imprimir a nova linha.
			}
			imprimir(nome.substring(var, var + 1)); // Imprime a letra que est� naquele espa�o entre 'var' e 'var+1'.
		}
	}
	
	public static void vertical (String nome) {
        for (int i = 0;i < nome.length(); i++ ) {
            imprimir(nome.substring(i,i + 1) + "\n");			

		}
		
	}
	
	public static void diagonal(String nome) {
		imprimir("\n\n");
		String espaco = "";
		for (int i = 0; i < nome.length(); i++) {
			imprimir(espaco + nome.substring(i, i + 1) + "\n");
			espaco += "  ";
		}
	}
	
	public static void inverso (String nome) {    
        for(int i = nome.length(); i > 0 ; i--){
            imprimir(nome.substring(i - 1, i));
        }
        
	}
	
	public static void sobrenomeNome (String nome) {
		imprimir("\n\n");
		int sobrenomePosicao = 0;
		for (int var = 0; var < nome.length(); var++) {
			if(nome.substring(var, var + 1).equals(" ")) {
				sobrenomePosicao = var;				
			}		
		}
		imprimir(nome.substring(sobrenomePosicao,nome.length()) + ", " + nome.substring(0,sobrenomePosicao));
		
  }
	
}

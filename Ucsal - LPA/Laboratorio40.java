package br.ucsal;

/* PROBLEMA: criar um array unidimensional contendo uma sequencia aritm�tica de 20 valores inteiros,
 * positivos iniciada com o valor 3, tendo a raz�o o valor 6. Sendo assim, apresente as solu��es dos itens
 * abaixo em m�todos espec�ficos que retornem as seguintes solu��es:
		a) o vetor criado dinamicamente com a sequencia elaborada.
		b) a soma de todos os elementos do item "a".
		c) o vetor criado dinamicamente com os elementos pares elaborado com o retorno do item "a".
		d) o vetor criado dinamicamente com a sequencia decrescente elaborado com o retorno do item "a".
		e) a impress�o de todos as informa��es solicitadas nos itens dever�o ser feitas utilizando m�todos "imprimir" espec�ficos.

Obs: n�o tem System.out.print(ln) em nenhum m�todo diferente do "imprimir" */

public class Laboratorio40 {

	public static void main(String[] args) {
		final int RAZAO = 5, TAMANHO = 20, VALORINICIO = 5;
		
		sequenciaAritmetica(TAMANHO, VALORINICIO, RAZAO);
	}
	

	public static void imprimir(int valor) {
		System.out.println(valor);
	}
	
	public static void imprimir(String valor) {
		System.out.println(valor);
	}
	
	public static void imprimir(int[] valor) {
		System.out.println(valor);
	}
	
	public static int[] sequenciaAritmetica(int tam, int vin, int raz) {
		int[] valores = new int [tam];
		for (int i = 0; i < valores.length; i++) {
			imprimir(vin);
			vin += raz;
			valores[i] = vin;
		}		
		somaTotal(vin, valores);
		todosPares(tam, vin, valores);
		return valores;
	}
	
	public static int somaTotal(int vin, int[] valores) {
		int valorSoma = 0;
		for (int i = 0; i < valores.length; i++) {
			valorSoma += valores[i];
		}
		imprimir("\n");
		imprimir(valorSoma);
		
		return valorSoma;
	}
	
	public static int[] todosPares(int tam, int vin, int[] valores) {
		int[] valoresPares = new int [tam];
		if (vin % 2 == 0) {
			for (int i = 0; i < valores.length; i++) {
				valoresPares[i] = vin;
				
			}
		} 
		
		if (valoresPares[0] == 0) {
			imprimir("N�o tem valor par.");
		} else {
			imprimir(valoresPares);
		}

		return valoresPares;		
	}

}

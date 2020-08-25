package br.ucsal;

/* PROBLEMA: criar um array unidimensional contendo uma sequencia aritmética de 20 valores inteiros,
 * positivos iniciada com o valor 3, tendo a razão o valor 6. Sendo assim, apresente as soluções dos itens
 * abaixo em métodos específicos que retornem as seguintes soluções:
		a) o vetor criado dinamicamente com a sequencia elaborada.
		b) a soma de todos os elementos do item "a".
		c) o vetor criado dinamicamente com os elementos pares elaborado com o retorno do item "a".
		d) o vetor criado dinamicamente com a sequencia decrescente elaborado com o retorno do item "a".
		e) a impressão de todos as informações solicitadas nos itens deverão ser feitas utilizando métodos "imprimir" específicos.

Obs: não tem System.out.print(ln) em nenhum método diferente do "imprimir" */

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
			imprimir("Não tem valor par.");
		} else {
			imprimir(valoresPares);
		}

		return valoresPares;		
	}

}

package br.ucsal;

import java.util.Scanner;

/* PROBLEMA: Crie um método de nome valoresSeq2 para ser preenchido dinamicamente com um vetor de 
 * 15 números inteiros positivos formado pela sequencia lógica dos números que seguem da seguinte forma: 
 * {3, 8, 18, 38, 78, ... } - O ultimo número deverá ser: 81918
 *  +(5x2^0)... +(5x2^1)*/

public class Laboratorio36 {

	public static void main(String[] args) {
		
		int[] temp = valoresSeq2();
		imprimir(temp);
	}
	
	public static int[] valoresSeq2() {
		int[] valoresRes = new int[15];
		int valorInicial = 3, valorFinal, valorAux;
		final int VALORBASE = 5;
		
		for (int i = 0; i < valoresRes.length; i++) {
			valoresRes[i] = valorInicial;
			valorAux = (int) Math.pow(2,i);
			valorFinal = valorInicial + (VALORBASE * valorAux);
			valorInicial = valorFinal;
		}
		return valoresRes;
	}
	
	public static void imprimir(int[] valores) {
		for (int i = 0; i < valores.length; i++) {
			System.out.println(valores[i] + " ");
		}
	}
}

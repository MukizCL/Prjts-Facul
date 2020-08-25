package br.ucsal;

public class Laboratorio24 {

	/* PROBLEMA: elabore uma solução para construir uma sequencia de valores inteiros positivos
	 * que sejam ao mesmo tempo impares e divisíveis por 3, na qual o último valor 
	 * não pode ser maior que 100. (Não entra o zero, utilize While) */

	public static void main(String[] args) {
		int valor = 1;
		while (valor <= 100) {
			if (valor % 3 == 0) {
				System.out.print(valor + " ");
			}
			valor += 2;
		}
	}

}

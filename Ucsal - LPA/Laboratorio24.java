package br.ucsal;

public class Laboratorio24 {

	/* PROBLEMA: elabore uma solu��o para construir uma sequencia de valores inteiros positivos
	 * que sejam ao mesmo tempo impares e divis�veis por 3, na qual o �ltimo valor 
	 * n�o pode ser maior que 100. (N�o entra o zero, utilize While) */

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

package br.ucsal;

public class Laboratorio23 {
	
	/* PROBLEMA: elabore uma solu��o para construir uma sequencia de valores inteiros positivos 
	 * que sejam ao mesmo tempo pares e divis�veis por 5, na qual o �ltimo valor 
	 * n�o pode ser maior que 100. (N�o entra o zero, utilize While) */

	public static void main(String[] args) {
		int valor = 0;
		while (valor <= 100) {
			if (valor != 0 && valor % 5 == 0) {
				System.out.print(valor + ", ");
			}
			valor += 2;
			
		}

	}

}

package br.ucsal;

public class Laboratorio28 {
	
	/* Elabore uma solução para criar uma sequencia de números de 1.000 e 1.500 
	 * (inclusive) composta por valores que quando divididos por 11 produzam resto igual a 5.
	 * Ao final apresente as seguintes informações:
	 * 		a) a sequencia impressa;
	 * 		b) quantos elementos fazem parte dessa sequencia;
	 * 		c) qual a soma de todos os números dessa sequencia. */

	public static void main(String[] args) {
		int valor = 1000, qtdeElementos = 0, somaTudo = 0;
		System.out.print("a) A sequência impressa é: ");
		while (valor <= 1500) {
			if (valor % 11 == 5) {
				System.out.print(valor + " ");
				qtdeElementos++;
				somaTudo += valor;
			}
			valor++;			
		}
		System.out.print("\nb) Os elementos que fazem parte dessa sequencia são: " + qtdeElementos);
		System.out.print("\nc) A soma de todos os números dessa sequencia: " + somaTudo);

	}

}

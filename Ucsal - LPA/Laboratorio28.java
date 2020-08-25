package br.ucsal;

public class Laboratorio28 {
	
	/* Elabore uma solu��o para criar uma sequencia de n�meros de 1.000 e 1.500 
	 * (inclusive) composta por valores que quando divididos por 11 produzam resto igual a 5.
	 * Ao final apresente as seguintes informa��es:
	 * 		a) a sequencia impressa;
	 * 		b) quantos elementos fazem parte dessa sequencia;
	 * 		c) qual a soma de todos os n�meros dessa sequencia. */

	public static void main(String[] args) {
		int valor = 1000, qtdeElementos = 0, somaTudo = 0;
		System.out.print("a) A sequ�ncia impressa �: ");
		while (valor <= 1500) {
			if (valor % 11 == 5) {
				System.out.print(valor + " ");
				qtdeElementos++;
				somaTudo += valor;
			}
			valor++;			
		}
		System.out.print("\nb) Os elementos que fazem parte dessa sequencia s�o: " + qtdeElementos);
		System.out.print("\nc) A soma de todos os n�meros dessa sequencia: " + somaTudo);

	}

}

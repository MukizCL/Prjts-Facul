package br.ucsal;

import java.util.Scanner;

public class Laboratorio11 {

	/* PROBLEMA: a partir de tr�s valores decimais quaisquer informados
	 * pelo usu�rio, elabore uma solu��o para identificar qual � o maior
	 * e qual � o menor dos tr�s n�meros.
	 * Obs: utilizar a estrutura que achar mais adequada para a solu��o.*/

	public static void main(String[] args) {
		double v1, v2, v3, vBigger, vSmaller;
		Scanner userInput = new Scanner (System.in);

		System.out.println("Informe tr�s valores:");
		v1 = userInput.nextDouble();
		v2 = userInput.nextDouble();
		v3 = userInput.nextDouble();

		if (v1 > v2 && v2 > v3) {
			System.out.println("O n�mero maior �: " + v1 + " e o n�mero menor �: " + v3);
		} else if (v1 > v3 && v3 > v2) {
			System.out.println("O n�mero maior �: " + v1 + " e o n�mero menor �: " + v2);
		} else if (v2 > v1 && v1 > v3) {
			System.out.println("O n�mero maior �: " + v2 + " e o n�mero menor �: " + v3);
		} else if (v2 > v3 && v3 > v1) {
			System.out.println("O n�mero maior �: " + v2 + " e o n�mero menor �: " + v1);
		} else if (v3 > v2 && v2 > v1) {
			System.out.println("O n�mero maior �: " + v3 + " e o n�mero menor �: " + v1);
		} else if (v3 > v1 && v1 > v2) {
			System.out.println("O n�mero maior �: " + v3 + " e o n�mero menor �: " + v2);
		}
		
		System.out.println();
	}

}

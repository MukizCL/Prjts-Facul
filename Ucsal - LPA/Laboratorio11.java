package br.ucsal;

import java.util.Scanner;

public class Laboratorio11 {

	/* PROBLEMA: a partir de três valores decimais quaisquer informados
	 * pelo usuário, elabore uma solução para identificar qual é o maior
	 * e qual é o menor dos três números.
	 * Obs: utilizar a estrutura que achar mais adequada para a solução.*/

	public static void main(String[] args) {
		double v1, v2, v3, vBigger, vSmaller;
		Scanner userInput = new Scanner (System.in);

		System.out.println("Informe três valores:");
		v1 = userInput.nextDouble();
		v2 = userInput.nextDouble();
		v3 = userInput.nextDouble();

		if (v1 > v2 && v2 > v3) {
			System.out.println("O número maior é: " + v1 + " e o número menor é: " + v3);
		} else if (v1 > v3 && v3 > v2) {
			System.out.println("O número maior é: " + v1 + " e o número menor é: " + v2);
		} else if (v2 > v1 && v1 > v3) {
			System.out.println("O número maior é: " + v2 + " e o número menor é: " + v3);
		} else if (v2 > v3 && v3 > v1) {
			System.out.println("O número maior é: " + v2 + " e o número menor é: " + v1);
		} else if (v3 > v2 && v2 > v1) {
			System.out.println("O número maior é: " + v3 + " e o número menor é: " + v1);
		} else if (v3 > v1 && v1 > v2) {
			System.out.println("O número maior é: " + v3 + " e o número menor é: " + v2);
		}
		
		System.out.println();
	}

}

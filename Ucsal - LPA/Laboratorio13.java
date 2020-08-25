package br.ucsal;

import java.util.Scanner;

public class Laboratorio13 {
	
	/* PROBLEMA: a partir de três valores inteiros positivos informados pelo usuário, 
	 * apresente-os uma saída com esses valores ordenados de forma crescente e
	 * depois em ordem decrescente.*/

	public static void main(String[] args) {
		int v1, v2, v3;
		Scanner userInput = new Scanner (System.in);

		System.out.println("Informe três valores:");
		v1 = userInput.nextInt();
		v2 = userInput.nextInt();
		v3 = userInput.nextInt();
		
		if (v1 > v2 && v2 > v3) {
			System.out.println("Em ordem decrescente: " + v1 + ", " + v2 + ", " + v3 + ".");
			System.out.println("Em ordem crescente: " + v3 + ", " + v2 + ", " + v1 + ".");
		} else if (v1 > v3 && v3 > v2) {
			System.out.println("Em ordem decrescente: " + v1 + ", " + v3 + ", " + v2 + ".");
			System.out.println("Em ordem crescente: " + v2 + ", " + v3 + ", " + v1 + ".");
		} else if (v2 > v1 && v1 > v3) {
			System.out.println("Em ordem decrescente: " + v2 + ", " + v1 + ", " + v3 + ".");
			System.out.println("Em ordem crescente: " + v3 + ", " + v1 + ", " + v2 + ".");
		} else if (v2 > v3 && v3 > v1) {
			System.out.println("Em ordem decrescente: " + v2 + ", " + v3 + ", " + v1 + ".");
			System.out.println("Em ordem crescente: " + v1 + ", " + v3 + ", " + v2 + ".");
		} else if (v3 > v2 && v2 > v1) {
			System.out.println("Em ordem decrescente: " + v3 + ", " + v2 + ", " + v1 + ".");
			System.out.println("Em ordem crescente: " + v1 + ", " + v2 + ", " + v3 + ".");
		} else if (v3 > v1 && v1 > v2) {
			System.out.println("Em ordem decrescente: " + v3 + ", " + v1 + ", " + v2 + ".");
			System.out.println("Em ordem crescente: " + v2 + ", " + v1 + ", " + v3 + ".");
		}
		

	}

}

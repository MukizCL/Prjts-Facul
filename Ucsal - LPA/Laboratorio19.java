package br.ucsal;

import java.util.Scanner;

	/* A partir do ano que o usu�rio nasceu, dado pelo mesmo, determine qual gera��o ele nasceu. Use a tabela abaixo como guia:
	 * Lost Generation: 1883 - 1900
	 * Greatest Generation: 1900 - 1927
	 * Silent Generation: 1927 - 1945
	 * Baby Boomer: 1945 - 1980
	 * Gen X: 1980 - 1996
	 * Millenials: 1996 e 2010
	 * Gen Z: 1996 - 2010
	 * Gen Alpha: 2010 - 2025*/

public class Laboratorio19 {

	public static void main(String[] args) {
		int anonascimento;
		
		Scanner userInput = new Scanner (System.in);
		System.out.println("Por favor, digite o ano que voc� nasceu.");
		anonascimento = userInput.nextInt();
		if (anonascimento >= 1883 && anonascimento <= 1900) {
			System.out.println("Voc� faz parte da 'Gera��o Perdida' (Lost Generation).");
		} else if (anonascimento > 1900 && anonascimento <= 1927) {
			System.out.println("Voc� faz parte da 'Gera��o Formid�vel' (Greatest Generation).");
		} else if (anonascimento > 1927 && anonascimento <= 1945) {
			System.out.println("Voc� faz parte da 'Gera��o Silenciosa' (Silent Generation).");
		} else if (anonascimento > 1945 && anonascimento <= 1964) {
			System.out.println("Voc� faz parte da 'Gera��o Baby Boomer'.");
		} else if (anonascimento > 1964 && anonascimento <= 1980) {
			System.out.println("Voc� faz parte da 'Gera��o X' (Generation X).");
		} else if (anonascimento > 1980 && anonascimento <= 1996) {
			System.out.println("Voc� faz parte da 'Mileniais' (Millennials).");
		} else if (anonascimento > 1996 && anonascimento <= 2010) {
			System.out.println("Voc� faz parte da 'Gera��o Z' (Generation Z).");
		} else if (anonascimento > 2010 && anonascimento <= 2025) {
			System.out.println("Voc� faz parte da 'Gera��o Alpha' (Generation Alpha).");
		} else {
			System.out.println("Voc� n�o faz parte de nenhuma gera��o nomeada at� agora.");
		}

	}

}

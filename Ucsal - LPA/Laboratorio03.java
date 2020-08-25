package br.ucsal;

import java.util.Scanner;

public class Laboratorio03 {

	public static void main(String[] args) {
		int choice;
		double valor1, valor2, result;
		
		Scanner userInput = new Scanner (System.in);
		
		System.out.println("Digite dois números:");
		valor1 = userInput.nextDouble();
		valor2 = userInput.nextDouble();
						
		System.out.println("Dependendo de qual operação queira fazer, digite o número abaixo.");						
		System.out.println("Soma = 1, Subtração = 2, Multiplicação = 3, Divisão = 4");
		
		choice = userInput.nextInt();
		if (choice == 1) {
			result = valor1 + valor2;
			System.out.println("O resultado é: " + result + ".");
		} else if (choice == 2) {
			result = valor1 - valor2;
			System.out.println("O resultado é: " + result + ".");
		} else if (choice == 3) {
			result = valor1 * valor2;
			System.out.println("O resultado é: " + result + ".");
		} else if (choice == 4) {
			result = valor1 / valor2;
			System.out.println("O resultado é: " + result + ".");
		} else {
			System.out.println("A opção escolhida não está entre as 4 possíveis.");
		
		}
		
	}

}
package br.ucsal;

import java.util.Scanner;

public class Laboratorio03 {

	public static void main(String[] args) {
		int choice;
		double valor1, valor2, result;
		
		Scanner userInput = new Scanner (System.in);
		
		System.out.println("Digite dois n�meros:");
		valor1 = userInput.nextDouble();
		valor2 = userInput.nextDouble();
						
		System.out.println("Dependendo de qual opera��o queira fazer, digite o n�mero abaixo.");						
		System.out.println("Soma = 1, Subtra��o = 2, Multiplica��o = 3, Divis�o = 4");
		
		choice = userInput.nextInt();
		if (choice == 1) {
			result = valor1 + valor2;
			System.out.println("O resultado �: " + result + ".");
		} else if (choice == 2) {
			result = valor1 - valor2;
			System.out.println("O resultado �: " + result + ".");
		} else if (choice == 3) {
			result = valor1 * valor2;
			System.out.println("O resultado �: " + result + ".");
		} else if (choice == 4) {
			result = valor1 / valor2;
			System.out.println("O resultado �: " + result + ".");
		} else {
			System.out.println("A op��o escolhida n�o est� entre as 4 poss�veis.");
		
		}
		
	}

}
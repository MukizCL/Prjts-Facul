package br.ucsal;

import java.util.Scanner;

public class Laboratorio09 {

	public static void main(String[] args) {
		int age;
		String category;
		
		Scanner userInput = new Scanner (System.in);
		System.out.println("Por favor, digite a sua idade:");
		age = userInput.nextInt();
		
		if (age < 5) {
			System.out.println("Idade mencionada não possui uma categoria definida!");
		} else {
			switch (age) {
			case 5: case 6: case 7:
				System.out.println("Sua categoria é: INFANTIL A.");
				break;
			case 8: case 9: case 10:
				System.out.println("Sua categoria é: INFANTIL B.");
				break;
			case 11: case 12: case 13:
				System.out.println("Sua categoria é: JUVENIL A.");
				break;
			case 14: case 15: case 16: case 17:
				System.out.println("Sua categoria é: JUVENIL B.");
				break;
			default:
				System.out.println("Sua categoria é: ADULTO.");
				break;
			}
		}

	}

}

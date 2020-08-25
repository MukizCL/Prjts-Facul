package br.ucsal;

import java.util.Scanner;

public class Laboratorio15 {

	public static void main(String[] args) {
		int exchange;
		double value;
		final double realtodollar = 0.19607, realtoeuro = 0.18181;
		final double dollartoreal = 5.10, dollartoeuro = 0.92727;
		final double eurotoreal = 5.50, eurotodollar = 1.07843;

		Scanner userInput = new Scanner (System.in);

		System.out.println("Por favor, indique o valor a ser convertido:");
		value = userInput.nextDouble();

		do {
			System.out.println("Por favor, indique, em número, a conversão de moeda desejada:");
			System.out.println("1 -> REAL para DOLAR.");
			System.out.println("2 -> REAL para EURO.");
			System.out.println("3 -> DOLAR para REAL.");
			System.out.println("4 -> DOLAR para EURO.");
			System.out.println("5 -> EURO para REAL");
			System.out.println("6 -> EURO para DOLAR");
			exchange = userInput.nextInt();

			switch (exchange) {
			case 1:
				System.out.println("O valor em DOLAR é igual a: $" + (value*realtodollar));
				break;

			case 2:
				System.out.println("O valor em EURO é igual a: £" + (value*realtoeuro));
				break;

			case 3:
				System.out.println("O valor em REAL é igual a: R$" + (value*dollartoreal));
				break;

			case 4:
				System.out.println("O valor em EURO é igual a: £" + (value*dollartoeuro));
				break;

			case 5:
				System.out.println("O valor em REAL é igual a: R$" + (value*eurotoreal));
				break;

			case 6:
				System.out.println("O valor em DOLAR é igual a: £" + (value*eurotodollar));
				break;

			default:
				System.out.println("O número informado não pertence a nenhuma conversão listada. Tente novamente.");
				break;
			}		

		} while (exchange >= 7);
	}

}
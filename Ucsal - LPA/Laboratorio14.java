package br.ucsal;

import java.util.Scanner;

public class Laboratorio14 {

	public static void main(String[] args) {
		double basewage, maxloan, trueloan, endloan;
		final double wagetax = 0.30, tax1 = 0.975, tax2 = 0.966, tax3 = 0.958;

		Scanner userInput = new Scanner (System.in);
		System.out.println("Por favor, digite o seu sal�rio, em n�meros:");
		basewage = userInput.nextDouble();
		maxloan = (basewage * wagetax);
		System.out.println("O valor m�ximo do empr�stimo ser� de: " + maxloan + " reais.");
		System.out.println("Digite o valor desejado do empr�stimo:");
		trueloan = userInput.nextDouble();

		if (trueloan <= maxloan) {
			if (trueloan <= 1000) {
				endloan = trueloan*tax1;
				System.out.println("Ap�s taxas, o valor total do empr�stimo ser� de: " + endloan + " reais.");
			} else if (trueloan > 1000 && trueloan <= 2000) {
				endloan = trueloan*tax2;
				System.out.println("Ap�s taxas, o valor total do empr�stimo ser� de: " + endloan + " reais.");
			} else {
				endloan = trueloan*tax3;
				System.out.println("Ap�s taxas, o valor total do empr�stimo ser� de: " + endloan + " reais.");
			}

		} else {
			System.out.println("O valor mencionado est� acima do limite m�ximo.");
		}

	}

}

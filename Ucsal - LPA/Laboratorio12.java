package br.ucsal;

import java.util.Scanner;

public class Laboratorio12 {

	/* PROBLEMA: a partir da velocidade obtida do veículo (informada pelo usuário)
	 * registre a multa aplicada considerando a seguinte tabela:
	 * acima de 40Km ................. R$ 160,00
	 * acima de 60Km ................. R$ 200,00
	 * acima de 80Km ................. R$ 300,00 */
	
	public static void main(String[] args) {
		int speed;
		
		Scanner userInput = new Scanner (System.in);
		System.out.println("Informe a velocidade na multa:");
		speed = userInput.nextInt();
		
		if (speed <= 40) {
			System.out.println("O usuário não recebeu multa.");
		} else if (speed > 40 && speed <= 60) {
			System.out.println("O valor a ser pago será de R$160,00.");
		} else if (speed > 60 && speed <= 80) {
			System.out.println("O valor a ser pago será de R$200,00.");
		} else {
			System.out.println("O valor a ser pago será de R$300,00.");
		}

	}

}

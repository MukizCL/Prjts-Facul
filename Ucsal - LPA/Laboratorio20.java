package br.ucsal;

import java.util.Scanner;

public class Laboratorio20 {

	public static void main(String[] args) {
		String resposta;
		int academiatreinou;
		
				
		Scanner userInput = new Scanner (System.in);
		System.out.println("Você já fez musculação ontem? (SIM ou NÃO)");
		resposta = userInput.next().toUpperCase();
		
		switch (resposta) {
		case "SIM":
			System.out.println("Se SIM, treinou parte SUPERIOR (1) ou INFERIOR (2)?");
			academiatreinou = userInput.nextInt();
			if (academiatreinou == 1) {
				System.out.println("Faça um treino focando na parte INFERIOR.");
			} else if (academiatreinou == 2) {
				System.out.println("Faça um treino focado na parte SUPERIOR.");
			} else {
				System.out.println("Número apresentado não consta nas opções.");
			}
			break;
		case "NÃO": case "NAO":
			System.out.println("Se NÃO, o último treino foi SUPERIOR (1) ou INFERIOR (2)?");
			academiatreinou = userInput.nextInt();
			if (academiatreinou == 1) {
				System.out.println("Faça um treino focando na parte INFERIOR.");
			} else if (academiatreinou == 2) {
				System.out.println("Faça um treino focado na parte SUPERIOR.");
			} else {
				System.out.println("Número apresentado não consta nas opções.");
			}
			break;
		default:
			System.out.println("A resposta precisa ser 'SIM' ou 'NÃO'.");
			break;
		}

	}

}

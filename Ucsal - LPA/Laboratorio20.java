package br.ucsal;

import java.util.Scanner;

public class Laboratorio20 {

	public static void main(String[] args) {
		String resposta;
		int academiatreinou;
		
				
		Scanner userInput = new Scanner (System.in);
		System.out.println("Voc� j� fez muscula��o ontem? (SIM ou N�O)");
		resposta = userInput.next().toUpperCase();
		
		switch (resposta) {
		case "SIM":
			System.out.println("Se SIM, treinou parte SUPERIOR (1) ou INFERIOR (2)?");
			academiatreinou = userInput.nextInt();
			if (academiatreinou == 1) {
				System.out.println("Fa�a um treino focando na parte INFERIOR.");
			} else if (academiatreinou == 2) {
				System.out.println("Fa�a um treino focado na parte SUPERIOR.");
			} else {
				System.out.println("N�mero apresentado n�o consta nas op��es.");
			}
			break;
		case "N�O": case "NAO":
			System.out.println("Se N�O, o �ltimo treino foi SUPERIOR (1) ou INFERIOR (2)?");
			academiatreinou = userInput.nextInt();
			if (academiatreinou == 1) {
				System.out.println("Fa�a um treino focando na parte INFERIOR.");
			} else if (academiatreinou == 2) {
				System.out.println("Fa�a um treino focado na parte SUPERIOR.");
			} else {
				System.out.println("N�mero apresentado n�o consta nas op��es.");
			}
			break;
		default:
			System.out.println("A resposta precisa ser 'SIM' ou 'N�O'.");
			break;
		}

	}

}

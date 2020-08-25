package br.ucsal;

import java.util.Scanner;

public class Laboratorio07 {

	public static void main(String[] args) {
		int diaDaSemana;
		
		Scanner userInput = new Scanner (System.in);
		System.out.println("Informe o dia da semana (em número de 1 a 7):");
		
		diaDaSemana = userInput.nextInt();
				
		switch (diaDaSemana) {
		case 1:
			System.out.println("Domingo");			
			break;
		
		case 2:
			System.out.println("Segunda-feira");
			break;
			
		case 3:
			System.out.println("Terça-feira");
			break;
			
		case 4:
			System.out.println("Quarta-feira");
			break;
			
		case 5:
			System.out.println("Quinta-feira");
			break;
			
		case 6:
			System.out.println("Sexta-feira");
			break;
			
		case 7:
			System.out.println("Sábado");
			break;
			
		default:
			System.out.println("Não existe o dia informado");
			break;
		}
		System.out.println("\nFim do Algoritmo");
	}

}

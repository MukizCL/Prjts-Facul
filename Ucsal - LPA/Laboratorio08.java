package br.ucsal;

import java.util.Scanner;

public class Laboratorio08 {

	public static void main(String[] args) {
		String month, answer;
		int year;

		Scanner userInput = new Scanner (System.in);		
		System.out.println("Infome um mes usando as tr�s primeiras letras do mesmo (Exemplo -> Fevereiro = FEV):");
		month = userInput.next().toUpperCase();
		System.out.println("Agora informe o ano, digitando todos os n�meros:");
		year = userInput.nextInt();

		if (year % 4 == 0 && year % 100 != 0) {
			switch (month) {
			case "JAN": case "MAR": case "MAI": case "JUL": case "AGO": case "OUT": case "DEZ":
				System.out.println("Nesse ano, o m�s " + month + " possui 31 dias.");			
				break;

			case "ABR": case "JUN": case "SET": case "NOV":
				System.out.println("Nesse ano, o mes " + month + " possui 30 dias.");
				break;

			case "FEV":
				System.out.println("Nesse ano, o mes " + month + " possui 29 dias.");
				break;		
			default:
				System.out.println("O valor informado n�o corresponde a um m�s valido!");
				break;
			}

		} else {		
			switch (month) {
			case "JAN": case "MAR": case "MAI": case "JUL": case "AGO": case "OUT": case "DEZ":
				System.out.println("O m�s " + month + " possui 31 dias.");			
				break;

			case "ABR": case "JUN": case "SET": case "NOV":
				System.out.println("Nesse ano, o mes " + month + " possui 30 dias.");
				break;

			case "FEV":
				System.out.println("Nesse ano, o mes " + month + " possui 28 dias.");
				break;		
			default:
				System.out.println("O valor informado n�o corresponde a um m�s valido!");
				break;
			}

		}

	}

}	

package br.ucsal;

import java.util.Scanner;

public class Laboratorio06 {

	/* Problema: elabore uma solucao para construir uma calculadora de temperatura
	 * onde o usu�rio informe qual o valor da temperatura inicial, 
	 * escolha qual a convers�o deseja e obtenha a temperatura convertida.
	 * As op��es de convers�o s�o: Celsius, Kelvin e Fahreinheit. */
	
	public static void main(String[] args) {
		int temperature, conversion;
		
		Scanner userInput = new Scanner (System.in);
		
		System.out.println("Por favor, indique a temperatura:");
		temperature = userInput.nextInt();
				
		do {
		System.out.println("Por favor, indique, em n�mero, a convers�o desejada:");
		System.out.println("1 -> CELSIUS para KELVIN.");
		System.out.println("2 -> CELSIUS para FAHREINHEIT.");
		System.out.println("3 -> KELVIN para CELSIUS.");
		System.out.println("4 -> KELVIN para FAHREINHEIT.");
		System.out.println("5 -> FAHREINHEIT para CELSIUS");
		System.out.println("6 -> FAHREINHEIT para KELVIN");
		conversion = userInput.nextInt();
			
		switch (conversion) {
		case 1:
			System.out.println("A temperatura em Kelvin � igual a: " + (temperature+273.15) + "K");
			break;
		
		case 2:
			System.out.println("A temperatura em Fahreinheit � igual a: " + ((temperature*9/5) + 32) + "�F");
			break;
			
		case 3:
			System.out.println("A temperatura em Celsius � igual a: " + (temperature-273.15) + "�C");
			break;
			
		case 4:
			System.out.println("A temperatura em Fahreinheit � igual a: " + ((temperature-273.15) * 9/5 + 32) + "�F");
			break;
			
		case 5:
			System.out.println("A temperatura em Celsius � igual a: " + ((temperature-32) * 5/9) + "�C");
			break;
			
		case 6:
			System.out.println("A temperatura em Kelvin � igual a: " + ((temperature-32) * 5/9 + 273.15) + "K");
			break;
			
		default:
			System.out.println("O n�mero informado n�o pertence a nenhuma escala.");
			break;
		}		

		} while (conversion >= 7);
	}

}

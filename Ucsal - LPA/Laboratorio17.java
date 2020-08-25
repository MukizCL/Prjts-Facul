package br.ucsal;

import java.util.Scanner;

public class Laboratorio17 {

	public static void main(String[] args) {
		int number;
		long id;
		
		Scanner userInput = new Scanner (System.in);
		System.out.println("Por favor, digite sua senha:");
		number = userInput.nextInt();
		System.out.println("Digite seu CPF:");
		id = userInput.nextLong();
		
				
		switch (number) {
		case 98:
			if (id == 88888888888L) {
				System.out.println("Usuário válido!");
			} else {
				System.out.println("Usuário inválido!");
			}
			break;
		case 97:
			if (id == 44444444444L) {
				System.out.println("Usuário válido!");
			} else {
				System.out.println("Usuário inválido!");
			}
			break;
		case 96:
			if (id == 22222222222L) {
				System.out.println("Usuário válido!");
			} else {
				System.out.println("Usuário inválido!");
			}
			break;
		case 95:
			if (id == 77777777777L) {
				System.out.println("Usuário válido!");
			} else {
				System.out.println("Usuário inválido!");
			}
			break;
		case 94:
			if (id == 55555555555L) {
				System.out.println("Usuário válido!");
			} else {
				System.out.println("Usuário inválido!");
			}
			break;	
		default:
			System.out.println("O CPF não está presente no banco de dados.");
			break;
		}

	}

}

package br.ucsal;

import java.util.Scanner;

public class Laboratorio18 {
		
	/* Crie um menu de uma lanchonete com, no m�nimo, 6 itens distintos e 
	 * fa�a com que o usu�rio informe qual deles deseja comprar.
	 * Obs.: S� ser� poss�vel comprar 1 item do card�pio.*/

	public static void main(String[] args) {
		int itemdomenu;
		
		Scanner userInput = new Scanner (System.in);
		System.out.println("Ol�! Bem vindo a lanchonete 'Mister Gula'.");
		System.out.println("Abaixo voc� ver� as nosso card�pio.");
		System.out.println("Escolha a que deseja comprar digitando o n�mero do item:");
		System.out.println("1. Hamburguer");
		System.out.println("2. X-Ovo");
		System.out.println("3. X-Tudo");
		System.out.println("4. Batata-frita");
		System.out.println("5. An�l de cebola empanado");
		System.out.println("6. �gua sem g�s");
		System.out.println("7. �gua com g�s");
		System.out.println("8. Refrigerante Coca-Cola");
		System.out.println("9. Refrigerante Pepsi");
		itemdomenu = userInput.nextInt();
		
		switch (itemdomenu) {
		case 1:
			System.out.println("Item 'Hamburguer' adicionado ao carrinho.");
			System.out.println("Obrigado por comprar na nossa loja!");
			break;
		case 2:
			System.out.println("Item 'X-Ovo' adicionado ao carrinho.");
			System.out.println("Obrigado por comprar na nossa loja!");
			break;
		case 3:
			System.out.println("Item 'X-Tudo' adicionado ao carrinho.");
			System.out.println("Obrigado por comprar na nossa loja!");
			break;
		case 4:
			System.out.println("Item 'Batata-frita' adicionado ao carrinho.");
			System.out.println("Obrigado por comprar na nossa loja!");
			break;
		case 5:
			System.out.println("Item 'An�l de cebola empanado' adicionado ao carrinho.");
			System.out.println("Obrigado por comprar na nossa loja!");
			break;
		case 6:
			System.out.println("Item '�gua sem g�s' adicionado ao carrinho.");
			System.out.println("Obrigado por comprar na nossa loja!");
			break;
		case 7:
			System.out.println("Item '�gua com g�s' adicionado ao carrinho.");
			System.out.println("Obrigado por comprar na nossa loja!");
			break;
		case 8:
			System.out.println("Item 'Refrigerante Coca-Cola' adicionado ao carrinho.");
			System.out.println("Obrigado por comprar na nossa loja!");
			break;
		case 9:
			System.out.println("Item 'Refrigerante Pepsi' adicionado ao carrinho.");
			System.out.println("Obrigado por comprar na nossa loja!");
			break;
		default:
			System.out.println("O n�mero escolhido n�o remete a nenhum item de nosso card�pio!");
			break;
		}

	}

}

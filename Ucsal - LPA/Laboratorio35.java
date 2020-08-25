package br.ucsal;

import java.util.Scanner;

/* PROBLEMA: Construa as soluções dos itens abaixo em métodos específicos e execute todas as soluções com as respectivas impressões:
 * 
	a) criar e devolver um vetor pela atribuição direta, com as idades de 07 alunos e retornar o resultado final para quem executa.
	b) criar e devolver um vetor contendo 03 nomes informados pelo usuário (apenas o primeiro nome).
	c) criar e devolver um vetor com 03 idades informadas pelo usuário em um intervalo fechado de 20 a 30.
	d) criar métodos para impressão dos itens anteriores */

public class Laboratorio35 {

	public static void main(String[] args) {

		String[] temp = nomeAlunos();
		imprimir("");
		imprimir(temp[0]);
		imprimir(temp[1]);
		imprimir(temp[2]);

		int[] temp2 = idadeInformada();
		imprimir("");
		imprimir(temp2[0]);
		imprimir(temp2[1]);
		imprimir(temp2[2]);

	}

	public static int[] idadeAlunos() {
		int[] idades = new int[7];
		idades[0] = 18;
		idades[1] = 15;
		idades[2] = 27;
		idades[3] = 24;
		idades[4] = 19;
		idades[5] = 20;
		idades[6] = 21;

		return idades;
	}

	public static String[] nomeAlunos() {
		String[] nomes = new String[3];
		Scanner userInput = new Scanner(System.in);

		System.out.println("Quando for pedido, digite 3 (três) nomes simples.");
		System.out.println("Digite o primeiro nome:");
		nomes[0] = userInput.nextLine();
		System.out.println("Digite o segundo nome:");
		nomes[1] = userInput.nextLine();
		System.out.println("Digite o terceiro e último nome:");
		nomes[2] = userInput.nextLine();

		return nomes;
	}

	public static int[] idadeInformada() {
		int[] idadeInf = new int[3];
		int valor;
		Scanner userInput = new Scanner(System.in);

		System.out.println("");
		System.out.println("Quando for pedido, digite 3 (três) idades entre 20 e 30.");
		valor = userInput.nextInt();
		if (valor >= 20 && valor <= 30) {
			idadeInf[0] = valor;
		} else {
			System.out.println("Valor fora do permitido!");
		}
		valor = userInput.nextInt();
		if (valor >= 20 && valor <= 30) {
			idadeInf[1] = valor;
		} else {
			System.out.println("Valor fora do permitido!");
		}
		valor = userInput.nextInt();
		if (valor >= 20 && valor <= 30) {
			idadeInf[2] = valor;
		} else {
			System.out.println("Valor fora do permitido!");
		}

		return idadeInf;
	}

	public static void imprimir(int valor) {
		System.out.println(valor);
	}

	public static void imprimir(String txt) {
		System.out.println(txt);
	}

}

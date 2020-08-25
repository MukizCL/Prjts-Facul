package br.ucsal;

import java.util.Scanner;

public class Laboratorio32 {
	
	/* Problema: Elaboraruma calculadora com as 4 opera��es: somar, a subtrair, dividir, multiplicar
	 * que dever� operar com apenas 2 parcelas. O usu�rio dever� informar dois valores e escolher
	 * qual a opera��o deseja realizar.
	 * 
	 * Objetivo:
	 * - Obter dados do usu�rio;
	 * - Definir a opera��o a partir da escolha do usu�rio;
	 * - Um m�todo para cada opera��o da calculadora.*/

	public static void main(String[] args) {

		obterDados();
		
	}
	
	public static void obterDados() {
		String escolha;
		int num1, num2;
		
		Scanner userInput = new Scanner (System.in);
		imprimir("Por favor, escolha o primeiro n�mero da equa��o:");
		num1 = userInput.nextInt();
		imprimir("Agora escolha o segundo n�mero da equa��o:");
		num2 = userInput.nextInt();
		imprimir("Escolha qual opera��o voc� deseja fazer:");
		imprimir("-> Soma");
		imprimir("-> Subtra��o");
		imprimir("-> Divis�o");
		imprimir("-> Multiplica��o");
		imprimir("-> Quadrado");
		escolha = userInput.next();
		operacao(num1, num2, escolha);
	
	}
	
	public static void operacao(int valor1, int valor2, String oper) {
		switch (oper.toLowerCase()) {
		case "soma":
			imprimir("A soma de " + valor1 + " + " + valor2 + " �: " + obterSoma(valor1, valor2));
			break;
		case "subtra��o": case "subtracao": case "subtra�ao": case "subtrac�o":
			imprimir("A subtra��o de " + valor1 + " - " + valor2 + " �: " + obterSub(valor1, valor2));
			break;
		case "divis�o": case "divisao":
			imprimir("A divis�o de " + valor1 + " / " + valor2 + " �: " + obterDiv(valor1, valor2));
			break;
		case "multiplica��o": case "multiplicacao": case "multiplicac�o": case "multiplica�ao":
			imprimir("A multiplica��o de " + valor1 + " x " + valor2 + " �: " + obterMulti(valor1, valor2));
			break;
		case "quadrado":
			imprimir("O quadrado do valor " + valor1 + " �: " + obterQuad1(valor1));
			imprimir("\nO quadrado do valor " + valor2 + " �: " + obterQuad2(valor2));
			break;
		default:
			imprimir("Escolha inv�lida!");
			break;
		}
		
	}

	public static void imprimir(String txt) {
		System.out.println(txt);
	}
	
	public static double obterSoma(double vlr1, double vlr2) {
		return vlr1 + vlr2;
	}
	
	public static double obterSub(double vlr1, double vlr2) {
		return vlr1 - vlr2;
	}
	
	public static double obterMulti(double vlr1, double vlr2) {
		return vlr1 * vlr2;
	}
	
	public static double obterDiv(double vlr1, double vlr2) {
		return vlr1 / vlr2;
	}
	
	public static double obterQuad1(double vlr1) {
		return vlr1 * vlr1;
	}
	
	public static double obterQuad2(double vlr2) {
		return vlr2 * vlr2;
	}
}

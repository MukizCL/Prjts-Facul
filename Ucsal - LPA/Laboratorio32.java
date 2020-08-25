package br.ucsal;

import java.util.Scanner;

public class Laboratorio32 {
	
	/* Problema: Elaboraruma calculadora com as 4 operações: somar, a subtrair, dividir, multiplicar
	 * que deverá operar com apenas 2 parcelas. O usuário deverá informar dois valores e escolher
	 * qual a operação deseja realizar.
	 * 
	 * Objetivo:
	 * - Obter dados do usuário;
	 * - Definir a operação a partir da escolha do usuário;
	 * - Um método para cada operação da calculadora.*/

	public static void main(String[] args) {

		obterDados();
		
	}
	
	public static void obterDados() {
		String escolha;
		int num1, num2;
		
		Scanner userInput = new Scanner (System.in);
		imprimir("Por favor, escolha o primeiro número da equação:");
		num1 = userInput.nextInt();
		imprimir("Agora escolha o segundo número da equação:");
		num2 = userInput.nextInt();
		imprimir("Escolha qual operação você deseja fazer:");
		imprimir("-> Soma");
		imprimir("-> Subtração");
		imprimir("-> Divisão");
		imprimir("-> Multiplicação");
		imprimir("-> Quadrado");
		escolha = userInput.next();
		operacao(num1, num2, escolha);
	
	}
	
	public static void operacao(int valor1, int valor2, String oper) {
		switch (oper.toLowerCase()) {
		case "soma":
			imprimir("A soma de " + valor1 + " + " + valor2 + " é: " + obterSoma(valor1, valor2));
			break;
		case "subtração": case "subtracao": case "subtraçao": case "subtracão":
			imprimir("A subtração de " + valor1 + " - " + valor2 + " é: " + obterSub(valor1, valor2));
			break;
		case "divisão": case "divisao":
			imprimir("A divisão de " + valor1 + " / " + valor2 + " é: " + obterDiv(valor1, valor2));
			break;
		case "multiplicação": case "multiplicacao": case "multiplicacão": case "multiplicaçao":
			imprimir("A multiplicação de " + valor1 + " x " + valor2 + " é: " + obterMulti(valor1, valor2));
			break;
		case "quadrado":
			imprimir("O quadrado do valor " + valor1 + " é: " + obterQuad1(valor1));
			imprimir("\nO quadrado do valor " + valor2 + " é: " + obterQuad2(valor2));
			break;
		default:
			imprimir("Escolha inválida!");
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

package br.ucsal;

import java.util.Scanner;

/* PROBLEMA: elabore uma sequencia (PG) de razão 5, contendo 10 elementos, cujo valor inicial será informado 
 * pelo usuário dentro de um intervalo fechado de 50 a 60. O usuario só poderá informar errado 03 vezes, 
 * passou desse número o mesmo deve apresentar mensagem de fim da execução por ter informado o valor errado 
 * e não apresenta a sequencia. Utilize a estrutura "for" */

public class Questao02 {

	public static void main(String[] args) {
		int valor, contador;
		final int RAZAO = 5;
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("Por favor, informe um número entre 50 e 60:");
		valor = userInput.nextInt();
		
		for (contador = 1; (valor < 50 || valor > 60) && contador < 3; contador++) {
			System.out.println("O número que você digitou não está dentro dos valores informados.");
			System.out.println("Por favor, tente novamente:");
			valor = userInput.nextInt();			
		}
		
		if (contador <= 3 && valor >= 50 && valor <= 60) {
			for (int i = 1; i <= 10; i++) {
				valor *= RAZAO;
				System.out.print(valor + " ");
			}

		} else {
			System.out.println("Máximo número de erros atingido.");
		}

	}

}

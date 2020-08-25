package br.ucsal;

import java.util.Scanner;

/* PROBLEMA: elabore uma sequencia (PG) de raz�o 5, contendo 10 elementos, cujo valor inicial ser� informado 
 * pelo usu�rio dentro de um intervalo fechado de 50 a 60. O usuario s� poder� informar errado 03 vezes, 
 * passou desse n�mero o mesmo deve apresentar mensagem de fim da execu��o por ter informado o valor errado 
 * e n�o apresenta a sequencia. Utilize a estrutura "for" */

public class Questao02 {

	public static void main(String[] args) {
		int valor, contador;
		final int RAZAO = 5;
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("Por favor, informe um n�mero entre 50 e 60:");
		valor = userInput.nextInt();
		
		for (contador = 1; (valor < 50 || valor > 60) && contador < 3; contador++) {
			System.out.println("O n�mero que voc� digitou n�o est� dentro dos valores informados.");
			System.out.println("Por favor, tente novamente:");
			valor = userInput.nextInt();			
		}
		
		if (contador <= 3 && valor >= 50 && valor <= 60) {
			for (int i = 1; i <= 10; i++) {
				valor *= RAZAO;
				System.out.print(valor + " ");
			}

		} else {
			System.out.println("M�ximo n�mero de erros atingido.");
		}

	}

}

package br.ucsal;

public class Laboratorio26 {
	
	/* PROBLEMA: elabore uma sequencia de anos bissextos a partir de 1950 at� o ano atual.
	 * 1� regra: Divis�vel por 4 e n�o-divis�vel por 100.
	 * 2� regra: Divis�vel por 400.*/

	public static void main(String[] args) {
		int year = 1950;
		while (year <= 2020) {
			if (year % 4 == 0 && year % 100 != 0) {
				System.out.print(year + " ");				
			}			
			year += 1;			
		}

	}

}

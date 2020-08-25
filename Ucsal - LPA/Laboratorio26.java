package br.ucsal;

public class Laboratorio26 {
	
	/* PROBLEMA: elabore uma sequencia de anos bissextos a partir de 1950 até o ano atual.
	 * 1º regra: Divisível por 4 e não-divisível por 100.
	 * 2º regra: Divisível por 400.*/

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

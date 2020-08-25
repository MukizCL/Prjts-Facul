package br.ucsal;

import java.util.Scanner;

public class Laboratorio02 {

	public static void main(String[] args) {
		double x, y, media, mediaf;
		final int p1 = 4, p2 = 6;
		
		Scanner userInput = new Scanner (System.in);
		System.out.println("Por favor, digite as três notas:");
		x = userInput.nextDouble();
		y = userInput.nextDouble();
		media = (x*p1) + (y*p2);
		mediaf = media / 10;
		System.out.println(mediaf);
		if (mediaf <= 4) {
			System.out.println("O aluno está reprovado!");
		} else if (mediaf > 4 && mediaf < 6) {
			System.out.println("O aluno deverá fazer prova final!");
		} else if (mediaf >= 6){
			System.out.println("O aluno está aprovado!");
		}
		
	}

}

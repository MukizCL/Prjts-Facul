package br.ucsal;

import java.util.Scanner;

public class Laboratorio01 {

	public static void main(String[] args) {
		double x, y, z, media;
		
		Scanner userInput = new Scanner (System.in);
		System.out.println("Por favor, digite as três notas:");
		x = userInput.nextDouble();
		y = userInput.nextDouble();
		z = userInput.nextDouble();
		media = (x + y + z) / 3;
		
		if (media >= 6) {
			System.out.println("Aluno aprovado!");
		} else {
			System.out.println("Aluno reprovado!");
		}

	}

}

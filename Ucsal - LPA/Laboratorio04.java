package br.ucsal;

import java.util.Scanner;

public class Laboratorio04 {

	public static void main(String[] args) {

		int x, y, z;

		Scanner inputNumber = new Scanner (System.in);

		System.out.println("Digite 3 valores");

		x = inputNumber.nextInt();
		y = inputNumber.nextInt();
		z = inputNumber.nextInt();

		if (x == y && x == z) {
			System.out.println("O tri�ngulo �: Equil�tero.");
		} else if (x != y && x != z && y != z) {
			System.out.println("O tri�ngulo �: Escaleno.");
		} else {
			System.out.println("O tri�ngulo �: Is�celes.");
		}

	}
}
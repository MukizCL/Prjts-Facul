package br.ucsal;

import java.util.Scanner;

public class Laboratorio16 {

	public static void main(String[] args) {
		int bornyear, bornmonth, bornday, todayyear, todaymonth, todayday, age, trueage;

		Scanner userInput = new Scanner (System.in);
		System.out.println("Por favor, informe a data de hoje.");
		System.out.println("Dia:");
		todayday = userInput.nextInt();
		System.out.println("Mes:");
		todaymonth = userInput.nextInt();
		System.out.println("Ano:");
		todayyear = userInput.nextInt();

		System.out.println("Por favor, digite a data que você nasceu.");
		System.out.println("Dia:");
		bornday = userInput.nextInt();
		System.out.println("Mes:");
		bornmonth = userInput.nextInt();
		System.out.println("Ano:");
		bornyear = userInput.nextInt();

		age = todayyear - bornyear;
		if (todaymonth < bornmonth) {
			trueage = (age - 1);
			System.out.println("Sua idade é: " + trueage + " anos.");
		} else {
			if (todayday < bornday) {
				trueage = (age - 1);
				System.out.println("Sua idade é: " + trueage + " anos.");
			} else {
				System.out.println("Sua idade é: " + age + " anos.");
			}

		}
	}

}



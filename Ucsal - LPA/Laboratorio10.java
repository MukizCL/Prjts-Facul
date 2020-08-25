package br.ucsal;

import java.util.Scanner;

public class Laboratorio10 {

	public static void main(String[] args) {
		int age;
		double weight, height, heightsqr, bmi;
		String situação;

		Scanner userInput = new Scanner (System.in);
		System.out.println("Por favor, digite a sua idade:");
		age = userInput.nextInt();
		System.out.println("Agora, diga o seu peso:");
		weight = userInput.nextDouble();
		System.out.println("Por fim, digite a sua altura:");
		height = userInput.nextDouble();
		heightsqr = (height * height);
		bmi = (weight / heightsqr);

		if (age >= 0 && age <= 17) {
			switch (age) {
			case 0:
				System.out.println("Nessa idade não é possível descobrir o Índice.");
				break;
			case 1:
				if (bmi <= 6.3) {
					System.out.println("O seu peso está normal! (" + bmi + ")");
				} else if (bmi > 6.3 && bmi <= 7.2) {
					System.out.println("Você está na faixa de: SOBREPESO. (" + bmi + ")");
				} else {
					System.out.println("Você está na faixa de: OBESIDADE. (" + bmi + ")");
				}
				break;
			case 2:
				if (bmi <= 8.6) {
					System.out.println("O seu peso está normal! (" + bmi + ")");
				} else if (bmi > 8.6 && bmi <= 9.8 ) {
					System.out.println("Você está na faixa de: SOBREPESO. (" + bmi + ")");
				} else {
					System.out.println("Você está na faixa de: OBESIDADE. (" + bmi + ")");
				}
				break;
			case 3:
				if (bmi <= 10.6) {
					System.out.println("O seu peso está normal! (" + bmi + ")");
				} else if (bmi > 10.6 && bmi <= 11.6) {
					System.out.println("Você está na faixa de: SOBREPESO. (" + bmi + ")");
				} else {
					System.out.println("Você está na faixa de: OBESIDADE. (" + bmi + ")");
				}
				break;
			case 4:
				if (bmi <= 12.6) {
					System.out.println("O seu peso está normal! (" + bmi + ")");
				} else if (bmi > 12.6 && bmi <= 15.0) {
					System.out.println("Você está na faixa de: SOBREPESO. (" + bmi + ")");
				} else {
					System.out.println("Você está na faixa de: OBESIDADE. (" + bmi + ")");
				}
				break;
			case 5:
				if (bmi <= 15.6) {
					System.out.println("O seu peso está normal! (" + bmi + ")");
				} else if (bmi > 15.6 && bmi <= 16.3) {
					System.out.println("Você está na faixa de: SOBREPESO. (" + bmi + ")");
				} else {
					System.out.println("Você está na faixa de: OBESIDADE. (" + bmi + ")");
				}
				break;
			case 6:
				if (bmi <= 16.6) {
					System.out.println("O seu peso está normal! (" + bmi + ")");
				} else if (bmi > 16.6 && bmi <= 18.0) {
					System.out.println("Você está na faixa de: SOBREPESO. (" + bmi + ")");
				} else {
					System.out.println("Você está na faixa de: OBESIDADE. (" + bmi + ")");
				}
				break;
			case 7:
				if (bmi <= 17.3) {
					System.out.println("O seu peso está normal! (" + bmi + ")");
				} else if (bmi > 17.3 && bmi <= 19.1 ) {
					System.out.println("Você está na faixa de: SOBREPESO. (" + bmi + ")");
				} else {
					System.out.println("Você está na faixa de: OBESIDADE. (" + bmi + ")");
				}
				break;
			case 8:
				if (bmi <= 18.7) {
					System.out.println("O seu peso está normal! (" + bmi + ")");
				} else if (bmi > 18.7 && bmi <= 20.3) {
					System.out.println("Você está na faixa de: SOBREPESO. (" + bmi + ")");
				} else {
					System.out.println("Você está na faixa de: OBESIDADE. (" + bmi + ")");
				}
				break;
			case 9:
				if (bmi <= 18.8) {
					System.out.println("O seu peso está normal! (" + bmi + ")");
				} else if (bmi > 18.8 && bmi <= 21.4) {
					System.out.println("Você está na faixa de: SOBREPESO. (" + bmi + ")");
				} else {
					System.out.println("Você está na faixa de: OBESIDADE. (" + bmi + ")");
				}
				break;
			case 10:
				if (bmi <= 19.6) {
					System.out.println("O seu peso está normal! (" + bmi + ")");
				} else if (bmi > 19.6 && bmi <= 22.5) {
					System.out.println("Você está na faixa de: SOBREPESO. (" + bmi + ")");
				} else {
					System.out.println("Você está na faixa de: OBESIDADE. (" + bmi + ")");
				}
				break;
			case 11:
				if (bmi <= 20.3) {
					System.out.println("O seu peso está normal! (" + bmi + ")");
				} else if (bmi > 20.3 && bmi <= 23.7) {
					System.out.println("Você está na faixa de: SOBREPESO. (" + bmi + ")");
				} else {
					System.out.println("Você está na faixa de: OBESIDADE. (" + bmi + ")");
				}
				break;
			case 12:
				if (bmi <= 21.1) {
					System.out.println("O seu peso está normal! (" + bmi + ")");
				} else if (bmi > 21.1 && bmi <= 24.8) {
					System.out.println("Você está na faixa de: SOBREPESO. (" + bmi + ")");
				} else {
					System.out.println("Você está na faixa de: OBESIDADE. (" + bmi + ")");
				}
				break;
			case 13:
				if (bmi <= 21.9) {
					System.out.println("O seu peso está normal! (" + bmi + ")");
				} else if (bmi > 21.9 && bmi <= 25.9) {
					System.out.println("Você está na faixa de: SOBREPESO. (" + bmi + ")");
				} else {
					System.out.println("Você está na faixa de: OBESIDADE. (" + bmi + ")");
				}
				break;
			case 14:	
				if (bmi <= 22.7) {
					System.out.println("O seu peso está normal! (" + bmi + ")");
				} else if (bmi > 22.7 && bmi <= 26.9) {
					System.out.println("Você está na faixa de: SOBREPESO. (" + bmi + ")");
				} else {
					System.out.println("Você está na faixa de: OBESIDADE. (" + bmi + ")");
				}
				break;	
			default:
				if (bmi <= 23.6) {
					System.out.println("O seu peso está normal! (" + bmi + ")");
				} else if (bmi > 23.6 && bmi <= 27.7) {
					System.out.println("Você está na faixa de: SOBREPESO. (" + bmi + ")");
				} else {
					System.out.println("Você está na faixa de: OBESIDADE. (" + bmi + ")");
				}
				break;
			  }
		} else {
			if (bmi < 17) {
				System.out.println("Você está na faixa de: MUITO ABAIXO DO PESO.");
			} else if (bmi >= 17 && bmi < 18.5) {
				System.out.println("Você está na faixa de: ABAIXO DO PESO.");
			} else if (bmi >= 18.5 && bmi < 25) {
				System.out.println("Você está na faixa de: PESO NORMAL.");
			} else if (bmi >=25 && bmi < 30) {
				System.out.println("Você está na faixa de: ACIMA DO PESO.");
			} else if (bmi >= 30 && bmi < 35) {
				System.out.println("Você está na faixa de: OBESIDADE I.");
			} else if (bmi >= 35 && bmi < 40) {
				System.out.println("Você está na faixa de: OBESIDADE II.");
			} else {
				System.out.println("Você está na faixa de: OBESIDADE III.");
			}
		}
		
	}		

}
package lista.JavaBasico;

import java.util.Scanner;

public class PesoIdeal {

	public static void main(String[] args) {
		String nome;
		double peso, altura;
		int sexo;


		Scanner userInput = new Scanner(System.in);
		System.out.print("Digite o seu nome: ");
		nome = userInput.nextLine();
		System.out.println("Qual o seu sexo?");
		System.out.println("[1] - Feminino");
		System.out.println("[2] - Masculino");
		sexo = userInput.nextInt();
		System.out.print("Digite o seu altura (em metros):");
		altura = userInput.nextDouble();

		if (sexo == 2) {
			peso = ((72.7 * altura) - 58);
			System.out.println("\nO peso ideal é de: " + peso + " kg.");
		} else if (sexo == 1) {
			peso = ((62.1 * altura) - 44.7);
			System.out.println("\nO peso ideal é de: " + peso + " kg.");
		}

	}
}
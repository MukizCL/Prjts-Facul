package lista.JavaBasico;

import java.util.Scanner;

public class CalculadoraUsuario {

	public static void main(String[] args) {
		int escolha;
		double a, b, resultado;
		Scanner userInput = new Scanner(System.in);

		System.out.print("Digite o primeiro número: ");
		a = userInput.nextDouble();
		System.out.print("Agora digite o segundo número: ");
		b = userInput.nextDouble();

		System.out.println("\nQual operação deseja fazer? (Digite o número)");
		System.out.println("[1] - Adição");
		System.out.println("[2] - Subtração");
		System.out.println("[3] - Multiplicação");
		System.out.println("[4] - Divisão");		
		escolha = userInput.nextInt();

		if (escolha == 1) {
			System.out.println("O resultado é: " + (a + b) + ".");
		} else if (escolha == 2) {
			System.out.println("O resultado é: " + (a - b) + ".");
		} else if (escolha == 3) {
			System.out.println("O resultado é: " + (a * b) + ".");
		} else if (escolha == 4) {
			System.out.println("O resultado é: " + (a / b) + ".");
		} else {
			System.out.println("A opção não está disponível.");
		}

	}

}

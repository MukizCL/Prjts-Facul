package lista.JavaBasico;

import java.util.Scanner;

public class CalculadoraUsuario {

	public static void main(String[] args) {
		int escolha;
		double a, b, resultado;
		Scanner userInput = new Scanner(System.in);

		System.out.print("Digite o primeiro n�mero: ");
		a = userInput.nextDouble();
		System.out.print("Agora digite o segundo n�mero: ");
		b = userInput.nextDouble();

		System.out.println("\nQual opera��o deseja fazer? (Digite o n�mero)");
		System.out.println("[1] - Adi��o");
		System.out.println("[2] - Subtra��o");
		System.out.println("[3] - Multiplica��o");
		System.out.println("[4] - Divis�o");		
		escolha = userInput.nextInt();

		if (escolha == 1) {
			System.out.println("O resultado �: " + (a + b) + ".");
		} else if (escolha == 2) {
			System.out.println("O resultado �: " + (a - b) + ".");
		} else if (escolha == 3) {
			System.out.println("O resultado �: " + (a * b) + ".");
		} else if (escolha == 4) {
			System.out.println("O resultado �: " + (a / b) + ".");
		} else {
			System.out.println("A op��o n�o est� dispon�vel.");
		}

	}

}

package lista.JavaBasico;

import java.util.Scanner;

public class MediaUnidade {
	
	public static void main(String[] args) {
		String nome;
		double a, b, c, media;
		
		Scanner userInput = new Scanner (System.in);
		System.out.print("Digite o seu nome completo: ");
		nome = userInput.nextLine();
		System.out.println("Digite as três notas:");
		a = userInput.nextDouble();
		b = userInput.nextDouble();
		c = userInput.nextDouble();
		media = (a + b + c) / 3;
		
		System.out.println("\nAluno: " + nome);
		System.out.println("Média: " + media);		

	}

}

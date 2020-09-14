package lista.JavaBasico;

import java.util.Scanner;

public class EstoqueMedio {

	public static void main(String[] args) {
		String nome;
		double numMax, numMin, numMed;
		
		Scanner userInput = new Scanner(System.in);				
		System.out.print("Digite o nome do produto: ");
		nome = userInput.nextLine();
		System.out.print("Digite a quantidade mínima do produto: ");
		numMin = userInput.nextDouble();
		System.out.print("Digite a quantidade máxima do produto: ");
		numMax = userInput.nextDouble();
		
		numMed = ((numMin + numMax) / 2);
		System.out.println("\nA quantidade média do produto " + nome + " é de "
				+ numMed + " unidades.");
	}

}

package lista.JavaBasico;

import java.util.Scanner;

public class EstoqueMedio {

	public static void main(String[] args) {
		String nome;
		double numMax, numMin, numMed;
		
		Scanner userInput = new Scanner(System.in);				
		System.out.print("Digite o nome do produto: ");
		nome = userInput.nextLine();
		System.out.print("Digite a quantidade m�nima do produto: ");
		numMin = userInput.nextDouble();
		System.out.print("Digite a quantidade m�xima do produto: ");
		numMax = userInput.nextDouble();
		
		numMed = ((numMin + numMax) / 2);
		System.out.println("\nA quantidade m�dia do produto " + nome + " � de "
				+ numMed + " unidades.");
	}

}

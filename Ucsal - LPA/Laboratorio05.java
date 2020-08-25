package br.ucsal;

import java.util.Scanner;

public class Laboratorio05 {

	/* Problema: crie um algoritmo para calcular o desconto previdenciário do funcionário, 
	 * considerando o salário bruto inicial (sem o desconto), o salário liquido (após o desconto),
	 * o valor do desconto e o percentual que será aplicado ao salário.
	 * 	Utilize a seguinte regra: o desconto deve ser de 11% sobre o valor do salário, 
	 * entretanto, o valor máximo de desconto é 318,20. */
	
	public static void main(String[] args) {

		double salariob, salariol, valdesc, percent;
		final double desc = 0.11, descmax = 318.20;
		
		Scanner userInput = new Scanner (System.in);
		System.out.println("Por favor, informe o seu salário");
		salariob = userInput.nextDouble();
		
		valdesc = salariob * desc;
		
		if (valdesc >= descmax) {
			salariol = salariob - descmax;
			System.out.println("O seu salário após o desconto previdênciário é: R$ " + salariol);
		} else {
			salariol = salariob - valdesc;
			System.out.println("O seu salário após o desconto previdênciário é: R$ " + salariol);
		}
			
		
		

	}

}

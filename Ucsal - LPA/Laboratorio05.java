package br.ucsal;

import java.util.Scanner;

public class Laboratorio05 {

	/* Problema: crie um algoritmo para calcular o desconto previdenci�rio do funcion�rio, 
	 * considerando o sal�rio bruto inicial (sem o desconto), o sal�rio liquido (ap�s o desconto),
	 * o valor do desconto e o percentual que ser� aplicado ao sal�rio.
	 * 	Utilize a seguinte regra: o desconto deve ser de 11% sobre o valor do sal�rio, 
	 * entretanto, o valor m�ximo de desconto � 318,20. */
	
	public static void main(String[] args) {

		double salariob, salariol, valdesc, percent;
		final double desc = 0.11, descmax = 318.20;
		
		Scanner userInput = new Scanner (System.in);
		System.out.println("Por favor, informe o seu sal�rio");
		salariob = userInput.nextDouble();
		
		valdesc = salariob * desc;
		
		if (valdesc >= descmax) {
			salariol = salariob - descmax;
			System.out.println("O seu sal�rio ap�s o desconto previd�nci�rio �: R$ " + salariol);
		} else {
			salariol = salariob - valdesc;
			System.out.println("O seu sal�rio ap�s o desconto previd�nci�rio �: R$ " + salariol);
		}
			
		
		

	}

}
